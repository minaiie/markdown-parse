import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile() throws IOException {
        String contents= Files.readString(Path.of("./test-file8.md"));

        List<String> expect = List.of();
        assertEquals(expect, MarkdownParse.getLinks(contents));
    }

    
    
}