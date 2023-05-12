package Dependency;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.io.File;

public class Main {
    
    public void createFile() {
        String fileName = "newfile.txt";
        File file = new File(fileName);
        
        String content = "text content 23";
        try {
            Path path = file.toPath();
            Files.write(path, content.getBytes());
        } catch (IOException exception) {
            return;
        }
    }
    
    public static void main(String[] args) {
        new Main().createFile();
    }
}
