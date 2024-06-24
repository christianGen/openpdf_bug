package bug;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MainTest {

    public static final String HELLO_PDF = "hello.pdf";

    @Test
    void countPages() throws IOException {
        Path openpdfBugDir = Files.createTempDirectory("openpdf_bug");

        ClassLoader classLoader = getClass().getClassLoader();

        Path helloIn = openpdfBugDir.resolve("hello-in.pdf");
        Path helloOut = openpdfBugDir.resolve("hello-out.pdf");

        Files.copy(Objects.requireNonNull(classLoader.getResourceAsStream(HELLO_PDF)), helloIn);

        // Neither works.
        new Main().moveFile(helloIn.toString(), helloOut.toString(), true);
        new Main().moveFile(helloIn.toString(), helloOut.toString(), false);
    }
}