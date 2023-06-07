package dev.arilac.server;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import javax.print.Doc;

import org.eclipse.lsp4j.CompletionItem;
import org.eclipse.lsp4j.CompletionItemKind;
import org.eclipse.lsp4j.CompletionList;
import org.eclipse.lsp4j.CompletionParams;
import org.eclipse.lsp4j.DidChangeTextDocumentParams;
import org.eclipse.lsp4j.DidCloseTextDocumentParams;
import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.DidSaveTextDocumentParams;
import org.eclipse.lsp4j.DocumentSymbol;
import org.eclipse.lsp4j.DocumentSymbolParams;
import org.eclipse.lsp4j.Position;
import org.eclipse.lsp4j.Range;
import org.eclipse.lsp4j.SymbolInformation;
import org.eclipse.lsp4j.SymbolKind;
import org.eclipse.lsp4j.jsonrpc.messages.Either;
import org.eclipse.lsp4j.services.TextDocumentService;

public class SqrTextDocumentService implements TextDocumentService {

    private LSClientLogger clientLogger;

    public SqrTextDocumentService() {
        this.clientLogger = LSClientLogger.getInstance();
    }

    @Override
    public void didOpen(DidOpenTextDocumentParams params) {
        clientLogger.logMessage("SQRTextDocumentService/didOpen()");
        /*
         * LanguageId: sqr
         * Uri:         file:///c%3A/Users/arire/OneDrive%20-%20University%20of%20Utah/_Work/_Repos/hrdev_wip/usax1096.sqr
         * Version:     1
         */
        if (params.getTextDocument().getLanguageId().equals("sqr")) 
            new SqrSyntaxTree(params.getTextDocument().getUri());

        
        // TODO Auto-generated method stub
        
    }

    @Override
    public void didChange(DidChangeTextDocumentParams params) {
        clientLogger.logMessage("SQRTextDocumentService/didChange()");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void didClose(DidCloseTextDocumentParams params) {
        clientLogger.logMessage("SQRTextDocumentService/didClose()");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void didSave(DidSaveTextDocumentParams params) {
        clientLogger.logMessage("SQRTextDocumentService/didSave()");
        // TODO Auto-generated method stub
        
    }

    @Override
    public CompletableFuture<Either<List<CompletionItem>, CompletionList>> completion(CompletionParams completionParams) {
        clientLogger.logMessage("SqrTextDocumentService/completion()");
        clientLogger.logMessage(completionParams.toString());
        return CompletableFuture.supplyAsync(() -> {
            List<CompletionItem> completionItems = new ArrayList<>();

            CompletionItem testItem = new CompletionItem();
            testItem.setInsertText("insertText");
            testItem.setLabel("label");
            testItem.setKind(CompletionItemKind.Snippet);
            testItem.setDetail("detail");

            completionItems.add(testItem);
            
            return Either.forRight(new CompletionList(completionItems));
        });
    }
    
    @Override
    public CompletableFuture<List<Either<SymbolInformation, DocumentSymbol>>> documentSymbol(DocumentSymbolParams params) {
        clientLogger.logMessage("SqrTextDocumentService/completion()");
        return CompletableFuture.supplyAsync(() -> {

            List<Either<SymbolInformation, DocumentSymbol>> symbolList = new ArrayList<>();
            symbolList.add(Either.forRight(new DocumentSymbol()));

            Either<SymbolInformation, DocumentSymbol> testSymbol = Either.forRight(new DocumentSymbol(
                "name", 
                SymbolKind.Function, 
                new Range(new Position(33, 0), new Position(47, 10)), 
                new Range(new Position(33, 0), new Position(33, 12))));

            symbolList.add(testSymbol);

            return symbolList;
        });
    }

}
