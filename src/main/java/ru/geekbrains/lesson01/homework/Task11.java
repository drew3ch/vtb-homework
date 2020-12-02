package ru.geekbrains.lesson01.homework;

public class Task11 {

    public static void main(String[] args) {
        int[] intArr = {2, 2, 2, 1, 2, 2, 10, 1};
        System.out.println(checkSum(intArr));

    }

    public static boolean checkSum(int[] array) {
        int left = 0;
        int right = 0;

        for (int i:array) {
            right += i;
        }

        for (int i = 0; i < array.length; i++) {
            if (left == right) {
                return true;
            }
            left += array[i];
            right -= array[i];
        }
        return false;
    }

}
