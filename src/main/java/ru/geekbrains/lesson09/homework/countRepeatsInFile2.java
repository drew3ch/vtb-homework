package ru.geekbrains.lesson09.homework;

import java.io.*;
import java.util.Scanner;

public class countRepeatsInFile2 {

    public static int countRepeatsInFile(String string, String pathname) throws FileNotFoundException {
        File file = new File(pathname);
        Scanner sc = new Scanner(file);
        int n = 0;
        while (sc.hasNextLine()) {
            String str = sc.nextLine();
            for (int i = 0; i < str.length(); i++) if (str.substring(i).startsWith(string)) n++;
        }
        sc.close();
        return n;
    }

    public static void main(String args[]) throws FileNotFoundException {

        System.out.println(countRepeatsInFile("aaa", "C:\\file.txt"));
    }
}