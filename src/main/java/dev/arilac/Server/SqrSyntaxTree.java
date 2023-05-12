package dev.arilac.Server;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.eclipse.lsp4j.TextDocumentItem;

import dev.arilac.Parsing.SqrLexerGrammar;
import dev.arilac.Parsing.SqrParserGrammar;
import dev.arilac.Parsing.SqrParserGrammar.ProgramContext;

public class SqrSyntaxTree {

    String sourceText;
    
    public SqrSyntaxTree(String filepath) {
        File sourceFile = new File(filepath);
        try (FileReader reader = new FileReader(sourceFile)) {
            CharStream sourceText = CharStreams.fromReader(reader);

            SqrLexerGrammar lexer = new SqrLexerGrammar(sourceText);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqrParserGrammar parser = new SqrParserGrammar(tokens);

            ProgramContext result = parser.program();
            System.out.println(result.getText());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }


}
