package ru.geekbrains.lesson01.homework;

public class Task10 {

    public static void main(String[] args) {
        int year = 400;
        System.out.println("Год " + year + " является " + yearWIS(year));

    }

    public static String yearWIS(int year) {
        if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return "високосным";
        } else {
            return "не високосным";
        }
    }
}
