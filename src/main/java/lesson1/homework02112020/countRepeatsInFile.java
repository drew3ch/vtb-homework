package lesson1.homework02112020;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class countRepeatsInFile {

    private static int n = 0;

    public static int countRepeatsInFile(String string, String pathname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(pathname), StandardCharsets.UTF_8);
        Set<String> repeats = new HashSet<>(lines);
        for (String line : repeats) if (line.contains(string)) n++;
        return n;
    }

    public static void main(String args[]) throws IOException {

        System.out.println(countRepeatsInFile("Word1", "C:\\file.txt"));

    }
}