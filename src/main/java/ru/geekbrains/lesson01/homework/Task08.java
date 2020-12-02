package ru.geekbrains.lesson01.homework;

public class Task08 {

    public static void main(String args[]) {
        int N = 5;
        int Z;
        int[][] intArr = new int[N][N];
        for (int i = 0; i < N; i++) {
            intArr[i][i] = 1;
            Z = N - i - 1;
            intArr[Z][i] = 1;
        }

        for (int i = 0; i < intArr.length; i++) {
            for (int j = 0; j < intArr[i].length; j++) {
                System.out.print(intArr[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
