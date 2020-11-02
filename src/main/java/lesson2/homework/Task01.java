package lesson2.homework;

public class Task01 {

    public static void main(String[] args) {

        int l = 5 * 2 - 1;
        for (int i = 1; i <= l; i += 2) {
            for (int j = 0; j < (l - i) /2; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}