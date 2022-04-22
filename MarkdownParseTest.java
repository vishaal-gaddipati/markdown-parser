import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
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
            assertEquals("[https://something.com, some-page.html]", links);
        }
        catch (IOException e) {
            return;
        }
    }
}