package ru.geekbrains.lesson01.homework;

public class Task07 {

        public static void main(String[] args) {

            int[] intArr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
            for (int item : intArr) {
                if(item < 6) {
                    item *= 2;
                }
                System.out.println(item);
            }
        }
}
