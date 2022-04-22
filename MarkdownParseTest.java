import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void test1() {
        Path fileName = Path.of("test-file.md");
        try {
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            assertEquals(List.of("https://something.com", "some-thing.html"), links);
        }
        catch (IOException e) {
            return;
        }
    }

    @Test
    public void test2() {
        Path fileName = Path.of("test-file2.md");
        try {
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            assertEquals(List.of(), links);
        }
        catch (IOException e) {
            return;
        }
    }

    @Test
    public void test3() {
        Path fileName = Path.of("test-file3.md");
        try {
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            assertEquals(List.of("https://something.com", "some-thing.html"), links);
        }
        catch (IOException e) {
            return;
        }
    }

    @Test
    public void test4() {
        Path fileName = Path.of("test-file4.md");
        try {
            String content = Files.readString(fileName);
            ArrayList<String> links = MarkdownParse.getLinks(content);
            assertEquals(List.of(), links);
        }
        catch (IOException e) {
            return;
        }
    }
}