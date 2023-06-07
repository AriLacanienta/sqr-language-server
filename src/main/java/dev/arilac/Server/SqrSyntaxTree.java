package dev.arilac.server;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;


import dev.arilac.sqrparsing.SqrLexerGrammar;
import dev.arilac.sqrparsing.SqrParserGrammar;
import dev.arilac.sqrparsing.SqrParserGrammar.ProgramContext;

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
