package lesson9.homework;

import java.io.*;
import java.io.IOException;
import java.util.Scanner;

public class joinFiles {

    public static void joinFiles(String output, String pathname) throws IOException {
        File directoryPath = new File(pathname);
        File filesList[] = directoryPath.listFiles();
        Scanner sc;
        FileWriter writer = new FileWriter(pathname + "\\" + output);
        for (File file : filesList) {
            if (file.isFile()) {
                sc = new Scanner(file);
                String input;
                while (sc.hasNextLine()) {
                    input = sc.nextLine();
                    writer.write(input + "\n");
                }
            }
        }
        writer.close();
    }

    public static void main(String args[]) throws IOException {

        joinFiles("output.txt", "C:\\lesson9");

    }
}