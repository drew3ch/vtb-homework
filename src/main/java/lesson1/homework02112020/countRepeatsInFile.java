package lesson1.homework02112020;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class countRepeatsInFile {

    public static int countRepeatsInFile(Path path, String sequence) throws IOException {
        try (BufferedReader  reader = Files.newBufferedReader(path, StandardCharsets.UTF_8)) {
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
    }

    public static void main(String args[]) throws IOException {

        System.out.println(countRepeatsInFile(Path.of("C:\\file.txt"), "aaa"));

    }
}