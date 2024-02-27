import parser.SimpleParser;
import utils.FileUtils;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        String sourceFilePath = "C:\\dev\\hs-parser\\hs-parser\\SampleFile.md";
        String targetFilePath = "C:\\dev\\hs-parser\\hs-parser\\SampleFile.html";
        try {
            String sourceData = FileUtils.readFile(sourceFilePath);
            String sourceFileType = FileUtils.getExtension(sourceFilePath);
            String targetFileType = FileUtils.getExtension(targetFilePath);

            SimpleParser simpleParser = new SimpleParser();
            String convertedData = simpleParser.parse(sourceData, sourceFileType, targetFileType);

            FileUtils.saveFile(convertedData, targetFilePath);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}