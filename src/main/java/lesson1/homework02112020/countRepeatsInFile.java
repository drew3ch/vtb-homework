package lesson1.homework02112020;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class countRepeatsInFile {

    public static int countRepeatsInFile(Path path, String sequence) throws IOException {
        BufferedReader reader = Files.newBufferedReader(path);
        StringBuilder sb = new StringBuilder();
        int n = 0;
        int nextChar;
        while ((nextChar = reader.read()) != -1) {
            if (sb.length() < sequence.length()) {
                sb.append((char) nextChar);
                continue;
            } else if (sb.toString().equals(sequence)) {
                n++;
            }
            sb.deleteCharAt(0);
            sb.append((char) nextChar);
        }
        if (sb.toString().equals(sequence)) {
            n++;
        }
        return n;
    }

    public static void main(String args[]) throws IOException {

        System.out.println(countRepeatsInFile(Paths.get("C:\\file.txt"), "aaa"));

    }
}