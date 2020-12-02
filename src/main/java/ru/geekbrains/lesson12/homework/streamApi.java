package ru.geekbrains.lesson12.homework;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streamApi {

    public static void main(String[] args) {
        String string = "Worddd1 Worddd2 Worddd3 Worddd4 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1 Word1";

        System.out.println(Arrays.stream(string.split(" "))
                .filter(word -> word.length() > 5)
                .collect(Collectors.joining(" ")));

        String[][] words = {
                {"Word1", "Word2", "Word2", "Word2", "Word2"},
                {"Word2", "Word2", "Word2", "Word2", "Word11"},
                {"Word1", "Word2", "Word9", "Word91", "Word10"},
                {"Word2", "Word2", "Word6", "Word7", "Word8"},
                {"Word2", "Word1", "Word3", "Word4", "Word5"},
        };

        System.out.println(Arrays.stream(words)
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList()));

        System.out.println(IntStream.range(100, 200)
                .filter(n -> n % 2 == 0)
                .sum());

        String[] s  = {"Winter", "Spring", "Summer", "Autumn"};

        System.out.println(Arrays.stream(s)
                .mapToInt(String::length)
                .sum());

        System.out.println(Stream.of(s)
                .limit(3)
                .sorted()
                .collect(Collectors.joining(" ")));

    }
}
