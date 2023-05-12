package dev.arilac.Server;

import org.eclipse.lsp4j.MessageParams;
import org.eclipse.lsp4j.MessageType;
import org.eclipse.lsp4j.services.LanguageClient;

/**
 * Singleton used send log messages to the client.
 */
public class LSClientLogger {
        private static LSClientLogger instance;
        private LanguageClient client;
        private boolean isInitialized;

        private LSClientLogger() {
        }

        public void initialize(LanguageClient client) {
            if(!isInitialized) {
                this.client = client;
                isInitialized = true;
            }
        }

        public static LSClientLogger getInstance() {
            if (instance == null) {
                instance = new LSClientLogger();
            }
            return instance;
        }

        public void logMessage(String message) {
            if (!isInitialized) {
                return;
            }
            client.logMessage(new MessageParams(MessageType.Info, message));
        }
}
