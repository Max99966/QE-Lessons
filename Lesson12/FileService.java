package Lesson12;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileService {
    static List<String> read (String path) throws IOException {
        return Files.readAllLines(Paths.get(path));
    }

}
