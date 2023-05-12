package dev.arilac;

import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.FileReader;
import java.nio.charset.Charset;

import org.eclipse.lsp4j.TextDocumentItem;
import org.junit.Test;

import dev.arilac.Server.SqrSyntaxTree;

/**
 * TestSqrSyntaxTree
 */
public class TestSqrSyntaxTree {

    @Test
    public void testLoadsFile(){
        SqrSyntaxTree testTree = new SqrSyntaxTree("C:\\Users\\arire\\Repos\\sqrls\\sqr-language-server\\src\\test\\java\\dev\\arilac\\usax1096.sqr");
        assertTrue(true);
    }
    
}