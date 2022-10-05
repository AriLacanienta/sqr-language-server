package dev.arilac;

import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;

import javax.swing.text.Position;

import org.eclipse.lsp4j.TextDocumentItem;

public class SqrSyntaxTree {

    String sourceText;
    
    public SqrSyntaxTree(TextDocumentItem textDocument) {
        sourceText = textDocument.getText();

        StringReader reader = new StringReader(sourceText);
        StreamTokenizer tokens = new StreamTokenizer(reader);
        tokens.commentChar('!');
        tokens.slashSlashComments(false);
        tokens.slashStarComments(false);
        tokens.lowerCaseMode(true);
        tokens.quoteChar('\'');

        // String[] tokens = sourceText.split("\\s");

        setupTokenMap();
        // for (String t : tokens) {
            
        // }

        try {
            while (tokens.nextToken() != StreamTokenizer.TT_EOF) {
                switch (tokens.ttype) {
                    case StreamTokenizer.TT_WORD:
                        System.out.println(tokens.sval);
                        if (tokenMap.containsKey(tokens.sval)) {
                            System.out.println("^TOKEN^");
                        }
                        break;
                    case StreamTokenizer.TT_NUMBER:
                        break;
                    case '\'':
                        break;
                    default:

                    break;
                }
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
    private class Node {
        TokenType ttype;
        Position startPosition;
        Position endPosition;
        ArrayList<Node> content;
    }

    private enum TokenType {
        BEGIN_PROGRAM,
        END_PROGRAM
    }

    private HashMap<String, TokenType> tokenMap;

    private void setupTokenMap() {
        tokenMap = new HashMap<>();
        tokenMap.put("begin-program", TokenType.BEGIN_PROGRAM);
        tokenMap.put("end-program",   TokenType.END_PROGRAM);
    }
}
