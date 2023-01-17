import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DemoFileText {
    public static void main(String[] args) {
        processTempFile(args[0]);

    }
    private static void processTempFile(String inputFile){
        Path filePath = Paths.get(inputFile);
        try {
            byte[] fileContent = Files.readAllBytes(filePath);
            String content = new String(fileContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
