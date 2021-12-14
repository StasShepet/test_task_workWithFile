package work_with_file.service.impl;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import work_with_file.service.CreateNewFile;
import work_with_file.service.ReadFromFile;

public class ReadFromFileImpl implements ReadFromFile {
    @Override
    public String readFromFile(String filePath) {
        CreateNewFile createNewFile = new CreateNewFileImpl();
        String result;
        try {
            result = Files.readString(Path.of(filePath));
            System.out.println(result);
        } catch (IOException e) {
            System.out.println("No file!");
            createNewFile.createNewFile(filePath);
            throw new RuntimeException("File is not exist!");
        }
        return result;
    }
}
