package lesson08.homework;

import java.util.*;

public class uniqueWords {

    public static void main(String[] args) {

        Integer count;
        String[] words = {
                "Word01",
                "Word01",
                "Word02",
                "Word02",
                "Word03",
                "Word03",
                "Word04",
                "Word04",
                "Word05",
                "Word05",
                "Word06",
                "Word07",
                "Word08",
                "Word09",
                "Word10"
        };

        HashMap<String, Integer> uniqueWords = new HashMap<>();

        for (String word : words) {
            count = uniqueWords.get(word);
            uniqueWords.put(word, count == null ? 1 : count + 1);
        }

        for (HashMap.Entry<String, Integer> word : uniqueWords.entrySet()) {
            String key = word.getKey();
            Integer value = word.getValue();
            System.out.print(key + ": " + value + "; ");
        }

    }
}