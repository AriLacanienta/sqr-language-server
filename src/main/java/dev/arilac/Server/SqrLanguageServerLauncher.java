package dev.arilac.server;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import org.eclipse.lsp4j.jsonrpc.Launcher;
import org.eclipse.lsp4j.launch.LSPLauncher;
import org.eclipse.lsp4j.services.LanguageClient;
import org.eclipse.lsp4j.services.LanguageClientAware;

/**
 * Standard IO Launcher for the SQR Language Server
 *
 */
public class SqrLanguageServerLauncher
{
    public static void main( String[] args ) throws InterruptedException, ExecutionException
    {
        // Deactivate logger so we can use stdio.
        // NOTE: use LSClientLogger.getInstance().logMessage(String message) instead of System.out.println() 
        LogManager.getLogManager().reset();
        Logger.getGlobal().setLevel(java.util.logging.Level.OFF);

        startServer(System.in, System.out);

        // TODO: TCP implementation using Sockets instead of stdio

        // try (Socket clientSocket = new Socket("127.0.0.1", 9925);) {
            
            //     startServer(clientSocket.getInputStream(), clientSocket.getOutputStream());
            // } catch (IOException | InterruptedException | ExecutionException e) {
                //     System.out.println("failed to launch server");
                //     e.printStackTrace();
                //     Thread.currentThread().interrupt();
                // }
    }

    private static void startServer(InputStream in, OutputStream out) throws InterruptedException, ExecutionException {
        SqrLanguageServer server = new SqrLanguageServer();
        Launcher<LanguageClient> launcher = LSPLauncher.createServerLauncher(server, in, out);
        if(server instanceof LanguageClientAware) {
            LanguageClient client = launcher.getRemoteProxy();
            ((LanguageClientAware)server).connect(client);
        }

        launcher.startListening();
    }
}
