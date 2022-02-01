package algorithms.files;

import java.io.File;
import java.util.List;

/**
 * @author Sir-Hedgehog (mailto:quaresma_08@mail.ru)
 * @version 1.0
 * @since 01.02.2022
 */
public class FileSearch {

    /**
     * Метод с помощью отхода дерева в глубину и рекурсии находит png-файлы
     * @param basicFile - папка поиска
     * @param electFiles - список избранных файлов
     */
    public void searchFiles(File basicFile, List<File> electFiles) {
        if (basicFile.isDirectory()) {
            File[] files = basicFile.listFiles();
            if (files != null) {
                for (File file : electFiles) {
                    if (file.isDirectory()) {
                        searchFiles(file, electFiles);
                    } else if (file.getName().toLowerCase().endsWith(".png")) {
                        electFiles.add(file);
                    }
                }
            }
        }
    }
}
