package lesson1.homework;

public class Task05 {

    public static void main(String[] args) {

        int[] intArr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

        for (int i=0; i < intArr.length; i++) {
            if(intArr[i] == 1) {
                intArr[i] = 0;
                System.out.println(intArr[i]);
            } else if (intArr[i] == 0) {
                intArr[i] = 1;
                System.out.println(intArr[i]);
            }
        }

    }

}
