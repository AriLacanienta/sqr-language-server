package dev.arilac;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import dev.arilac.server.SqrSyntaxTree;
import dev.arilac.sqrparsing.SqrLexerGrammar;
import dev.arilac.sqrparsing.SqrParserGrammar;
import dev.arilac.sqrparsing.SqrParserGrammar.ProgramContext;

/**
 * TestSqrSyntaxTree
 */
public class TestSqrSyntaxTree {

    private String testFilepath;

    @BeforeEach
    public void SetUp() {
        testFilepath = "C:\\Users\\arire\\Repos\\sqrls\\sqr-language-server\\src\\test\\java\\dev\\arilac\\testfile.sqr";
    }

    @Test
    public void testSyntaxTree(){
        SqrSyntaxTree testTree = new SqrSyntaxTree(testFilepath);
        assertTrue(true);
    }

    @Test
    public void testLoadFile(){
        File sourceFile = new File(testFilepath);
        try (FileReader reader = new FileReader(sourceFile)) {
            CharStream sourceText = CharStreams.fromReader(reader);

            SqrLexerGrammar lexer = new SqrLexerGrammar(sourceText);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            SqrParserGrammar parser = new SqrParserGrammar(tokens);

            ProgramContext result = parser.program();
            
            System.out.println(result.toStringTree());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    
}