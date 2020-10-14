package lesson1.homework16102020;

import java.util.Arrays;
import java.util.Random;

public class Task05 {

    public static void main(String[] args) {

        int [] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(Arrays.toString(shuffle(arr)));

    }

    public static int[] shuffle(int arr[]) {
        Random rnd = new Random();
        for (int i = arr.length - 1; i >= 1; i--)
        {
            int j = rnd.nextInt(arr.length) % (i + 1);

            int tmp = arr[j];
            arr[j] = arr[i];
            arr[i] = tmp;
        }
        return arr;
    }

}