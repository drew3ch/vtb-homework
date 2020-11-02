package lesson2.homework;

import java.util.Arrays;

public class Task04 {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(reverse(arr)));

    }

    public static int[] reverse(int arr[]) {
        int[] d = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            d[i] = arr[arr.length - 1 -i];
        }
        return d;
    }

}