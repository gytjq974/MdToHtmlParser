package utils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileUtils {
    public static String readFile(String filePath) throws IOException {
        return new String(Files.readAllBytes(Paths.get(filePath)));
    }

    public static void saveFile(String saveData, String filePath) throws IOException {
        FileWriter writer = new FileWriter(filePath);
        writer.write(saveData);
        writer.close();
    }

    public static String getExtension(String filePath) {
        int extIndex = filePath.lastIndexOf(".");

        if (extIndex == -1) {
            return null;
        } else {
            return filePath.substring(extIndex + 1);
        }
    }
}
