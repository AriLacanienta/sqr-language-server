package dev.arilac.server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.eclipse.lsp4j.ClientCapabilities;
import org.eclipse.lsp4j.CompletionOptions;
import org.eclipse.lsp4j.DocumentSymbolOptions;
import org.eclipse.lsp4j.DocumentSymbolRegistrationOptions;
import org.eclipse.lsp4j.InitializeParams;
import org.eclipse.lsp4j.InitializeResult;
import org.eclipse.lsp4j.InitializedParams;
import org.eclipse.lsp4j.Registration;
import org.eclipse.lsp4j.RegistrationParams;
import org.eclipse.lsp4j.ServerCapabilities;
import org.eclipse.lsp4j.TextDocumentClientCapabilities;
import org.eclipse.lsp4j.TextDocumentSyncKind;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;
import org.eclipse.lsp4j.services.LanguageServer;
import org.eclipse.lsp4j.services.TextDocumentService;
import org.eclipse.lsp4j.services.WorkspaceService;

/**
 * Hello world!
 *
 */
public class SqrLanguageServer implements LanguageServer, LanguageClientAware {
    private TextDocumentService textDocumentService;
    private WorkspaceService workspaceService;
    private ClientCapabilities clientCapabilities;
    private LanguageClient languageClient;
    private int shutdown = 1;

    public SqrLanguageServer() {
        this.textDocumentService = new SqrTextDocumentService();
        this.workspaceService = new SqrWorkspaceService();
    }
    
    @Override
    public CompletableFuture<InitializeResult> initialize(InitializeParams params) {
        this.clientCapabilities = params.getCapabilities();

        ServerCapabilities capabilities = new ServerCapabilities();

        capabilities.setTextDocumentSync(TextDocumentSyncKind.Full);
        
        if(!isDynamicCompletionRegistration()) {
            capabilities.setCompletionProvider(new CompletionOptions());
        }
        
        capabilities.setDocumentSymbolProvider(new DocumentSymbolOptions("tmplabel"));
        
        // Create provided capabilites:
        final InitializeResult response = new InitializeResult(capabilities);

        return CompletableFuture.supplyAsync(() -> response);
    }

    @Override
    public void initialized(InitializedParams params) {

    }

    @Override
    public void connect(LanguageClient client) {
        this.languageClient = client;
        LSClientLogger.getInstance().initialize(this.languageClient);
        LSClientLogger.getInstance().logMessage("SqrLanguageServer/connect: Client connected!");
        LSClientLogger.getInstance().logMessage("Testing: LSPLauncher listening");
        

        
        // LSClientLogger.getInstance().logMessage(this.clientCapabilities.toString());

        // LSClientLogger.getInstance().logMessage(this.clientCapabilities.getTextDocument().getDocumentSymbol().toString());
    }

    @Override
    public TextDocumentService getTextDocumentService() {
        return this.textDocumentService;
    }

    @Override
    public WorkspaceService getWorkspaceService() {
        return this.workspaceService;
    }

    @Override
    public CompletableFuture<Object> shutdown() {
        shutdown = 0;
        return CompletableFuture.supplyAsync(Object::new);
    }
        
    @Override
    public void exit() {
        System.exit(shutdown);
    }



    /**
     * Check if dynamic registration of completion capabilities is allowed by the client.
     * @return
     */
    private boolean isDynamicCompletionRegistration() {
        TextDocumentClientCapabilities textDocumentClientCapabilities = clientCapabilities.getTextDocument();

        return  textDocumentClientCapabilities != null 
                && textDocumentClientCapabilities.getCompletion() != null
                && Boolean.FALSE.equals(textDocumentClientCapabilities.getCompletion().getDynamicRegistration());
    }

}
