package lesson1.homework02112020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class countRepeatsInFile {

    public static int countRepeatsInFile(String string, String pathname) throws IOException {
        Map map = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(pathname))) {
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (map.get(words[i]) == null) {
                        map.put(words[i], 1);
                    } else {
                        int n = Integer.valueOf(String.valueOf(map.get(string)));
                        n++;
                        map.put(words[i], n);
                    }
                }
                line = br.readLine();
            }
        }
        return (int) map.get(string);
    }

    public static void main(String args[]) throws IOException {

        System.out.println(countRepeatsInFile("Word1", "C:\\file.txt"));

    }
}