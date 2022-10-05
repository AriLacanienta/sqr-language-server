package dev.arilac;

import static org.junit.Assert.assertTrue;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.eclipse.lsp4j.DidOpenTextDocumentParams;
import org.eclipse.lsp4j.TextDocumentItem;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for SqrAbstractSyntaxTree.
 */
public class AstTests {

    @Test
    public void testBareStructure() {
        String simpleSqr = "begin-program\ncontent\nend-program";

        TextDocumentItem item = new TextDocumentItem(
            "",
            "",
            0,
            simpleSqr);
        SqrSyntaxTree tree = new SqrSyntaxTree(item);
    }

    /**
     * Rigorous Test :-)
     */
    @Test
    public void exampleFileTest() {
        /*
         * Test File
         *
         * LanguageId: sqr
         * Uri:
         * file:///c%3A/Users/arire/Repos/sqrls/sqr-language-server/src/test/java/dev/
         * arilac/usax1096.sqr
         * Version: 1
         */
        
        // SqrTextDocumentService tds = new SqrTextDocumentService();
        // DidOpenTextDocumentParams params = new DidOpenTextDocumentParams();

        File testFile = new File(
                "src\\test\\java\\dev\\arilac\\usax1096.sqr");
        String testText = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(testFile))) {

            StringBuilder sb = new StringBuilder();
            while (reader.ready()) {
                sb.append(reader.readLine());
            }

            testText = sb.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }

        TextDocumentItem item = new TextDocumentItem(
            "file:///c:/Users/arire/Repos/sqrls/sqr-language-server/src/test/java/dev/arilac/usax1096.sqr",
            "sqr",
            1,
            testText);

        new SqrSyntaxTree(item);

        // tds.didOpen(params);
    }
}
