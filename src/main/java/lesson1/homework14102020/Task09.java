package lesson1.homework14102020;

public class Task09 {

    public static void main(String[] args) {

        int[] intArr = {1, 3, 2, 11, 5, 4, 8, 19, 7};
        int maxNum = 0;
        int minNum = intArr[0];
        for (int i=0; i < intArr.length; i++) {
            if(maxNum < intArr[i]) {
                maxNum = intArr[i];
            } else if(minNum > intArr[i]) {
                minNum = intArr[i];
             }

        }
        System.out.println("Максимальное число: " + maxNum);
        System.out.println("Минимальное число: " + minNum);

    }
}
