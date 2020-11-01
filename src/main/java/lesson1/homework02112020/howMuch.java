package lesson1.homework02112020;

import java.io.*;

public class howMuch {

    public static int howMuch(String string, String pathname) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(pathname));
        String line = in.readLine();
        int count = 0;
        do {
            count += (line.length() - line.replace(string, "").length()) / string.length();
            line = in.readLine();
        } while (line != null);
        return count;
    }

    public static void main(String args[]) throws IOException {

        System.out.println(howMuch("Word1", "C:\\file.txt"));

    }
}