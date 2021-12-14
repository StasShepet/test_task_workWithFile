package work_with_file;

import java.util.Scanner;
import work_with_file.service.ReadFromFile;
import work_with_file.service.WriteToFile;
import work_with_file.service.impl.ReadFromFileImpl;
import work_with_file.service.impl.WriteToFileImpl;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File name: ");
        String filePath = scanner.next();
        //String filePath = args[0];

        ReadFromFile readFromFile = new ReadFromFileImpl();
        String s = readFromFile.readFromFile(filePath);

        WriteToFile writeToFile = new WriteToFileImpl();
        writeToFile.writeToFile(s, filePath);
    }
}
