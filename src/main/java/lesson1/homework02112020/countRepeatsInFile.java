package lesson1.homework02112020;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class countRepeatsInFile {

    public static void countRepeatsInFile(String string, String pathname) throws IOException {
        Map map = new HashMap();
        try (BufferedReader br = new BufferedReader(new FileReader(pathname))) {
            String line = br.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                for (int i = 0; i < words.length; i++) {
                    if (words[i].equals(string)) {
                        if (map.get(words[i]) == null) {
                            map.put(words[i], 1);
                        } else {
                            int n = Integer.valueOf(String.valueOf(map.get(words[i])));
                            n++;
                            map.put(words[i], n);
                        }
                    }
                }
                line = br.readLine();
            }
        }
        for (Object key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }
    }

    public static void main(String args[]) throws IOException {

        countRepeatsInFile("Word1", "C:\\file.txt");

    }
}