package ru.geekbrains.lesson02.homework;

import java.util.Arrays;

public class Task02 {

    public static void main(String[] args) {

        int[] intArr = {10, 1, 30, 4, 5, 6};
        sort(intArr);

        System.out.println(Arrays.toString(intArr));

    }

    public static void sort(int[] arr) {
        for (int min = 0; min < arr.length; min++) {
            int l = min;
            for (int j = min + 1; j < arr.length; j++) {
                if (arr[j] < arr[l]) {
                    l = j;
                }
            }
            int tmp = arr[min];
            arr[min] = arr[l];
            arr[l] = tmp;
        }
    }

}