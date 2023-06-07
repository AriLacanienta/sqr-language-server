package dev.arilac.server;

import org.eclipse.lsp4j.DidChangeConfigurationParams;
import org.eclipse.lsp4j.DidChangeWatchedFilesParams;
import org.eclipse.lsp4j.services.WorkspaceService;

public class SqrWorkspaceService implements WorkspaceService {
    
    private LSClientLogger clientLogger;

    public SqrWorkspaceService() {
        this.clientLogger = LSClientLogger.getInstance();
        clientLogger.logMessage("SqrWorkplaceService/constructor");
    }

    @Override
    public void didChangeConfiguration(DidChangeConfigurationParams params) {
        clientLogger.logMessage("SqrWorkplaceService/didChangeConfiguration");
        // TODO Auto-generated method stub
        
    }

    @Override
    public void didChangeWatchedFiles(DidChangeWatchedFilesParams params) {
        clientLogger.logMessage("SqrWorkplaceService/didChangeWatchedFiles");
        // TODO Auto-generated method stub
        
    }
    
}
