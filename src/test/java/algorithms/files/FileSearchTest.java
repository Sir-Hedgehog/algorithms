package algorithms.files;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.io.TempDir;

import static org.junit.Assert.assertEquals;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class FileSearchTest {

    @TempDir
    File tempDirectory;

    @Test
    public void testDifferentElements() {

        var fileSearch = new FileSearch();

        var upDirectory = new File(tempDirectory, "directory");

        new File(upDirectory, "letter.txt");
        var pngFile1 = new File(upDirectory, "picture.png");
        var downDirectory = new File(upDirectory, upDirectory.getAbsolutePath());
        new File(downDirectory, "photo.jpg");
        var pngFile2 = new File(downDirectory, "capture.png");

        var electFiles = List.of(pngFile1, pngFile2);

        fileSearch.searchFiles(upDirectory, electFiles);

        var expectFiles = List.of(pngFile1, pngFile2);

        assertEquals(expectFiles, electFiles);
    }
}
