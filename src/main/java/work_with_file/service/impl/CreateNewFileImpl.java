package work_with_file.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import work_with_file.service.CreateNewFile;

public class CreateNewFileImpl implements CreateNewFile {
    @Override
    public String createNewFile(String filePath) {
        File file = new File(filePath);
        String newNumber = String.valueOf(new Random().nextInt(1, 10));
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));) {
            file.createNewFile();
            bufferedWriter.write(newNumber);
        } catch (IOException e) {
            throw new RuntimeException("Can't create new file!");
        }
        return newNumber;
    }
}
