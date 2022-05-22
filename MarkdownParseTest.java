/**
Windows: 
javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" MarkdownParseTest.java
java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore MarkdownParseTest
 */

import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    //test edit
    //test edit 2

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\test-file.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), links);
    }

    @Test
    public void test2() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\test-file2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void test3() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\test-file3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-thing.html"), links);
    }

    @Test
    public void test4() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\test-file4.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of(), links);
    }

    @Test
    public void firstTest() {
        assertEquals(2, 1+1);
    }

    @Test
    public void test5() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\test-file5.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }

    // @Test
    // public void testSpaceAfterParen() {
    //     String contents = "[title]( space-in-url.com)";
    //     List<String> expect = List.of("space-in-url.com");
    //     assertEquals(expect, MarkdownParse.getLinks(contents));
    // }

    @Test
    public void testSnippet1() throws IOException {
        Path fileName = Path.of("C:\\Users\\visha\\Documents\\GitHub\\markdown-parser\\snippet1.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        assertEquals(List.of("url.com", "google.com", "ucsd.edu"), links);
    }
}