package lesson01.homework;

public class Task01 {

    public static void main(String[] args) {
        int numOne = 0;
        int numTwo = 0;
        System.out.println("Сумма чисел " + numOne + " и " + numTwo + " в пределах [10;20]: " + calcTwoNumbers(numOne, numTwo));
    }

    public static boolean calcTwoNumbers(int numOne, int numTwo) {
        int sumTwoNum = numOne + numTwo;
        if((sumTwoNum >= 10) && (sumTwoNum <=20)) {
            return true;
        } else {
            return false;
        }

    }

}
