package work_with_file.service.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import work_with_file.service.WriteToFile;

public class WriteToFileImpl implements WriteToFile {
    @Override
    public void writeToFile(String input, String filePath) {
        int newNumber = Integer.parseInt(input) + 3;
        File file = new File(filePath);
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))) {
            bufferedWriter.write(String.valueOf(newNumber));
            System.out.println(newNumber);
        } catch (IOException e) {
            throw new RuntimeException("Can't write to file!");
        }
    }
}
