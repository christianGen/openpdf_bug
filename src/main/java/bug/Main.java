package bug;

import com.lowagie.text.pdf.PdfReader;
import com.lowagie.text.pdf.RandomAccessFileOrArray;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public void moveFile(String filename, String newFilename, boolean testUsingReader) throws IOException {
        if (testUsingReader) {
            try (PdfReader ignored = new PdfReader(filename)) {
                // Don't do anything.
            }
        } else {
            try (RandomAccessFileOrArray ignored = new RandomAccessFileOrArray(filename)) {
                // Don't do anything.
            }
        }

        Files.move(Paths.get(filename), Paths.get(newFilename));
    }
}