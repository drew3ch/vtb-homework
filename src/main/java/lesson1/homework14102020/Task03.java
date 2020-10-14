package lesson1.homework14102020;

public class Task03 {

    public static void main(String[] args) {
        int wNum = -1;
        System.out.println("Число " + wNum + " отрицательное: " + whatIsNum(wNum));
    }

    public static boolean whatIsNum(int wNum) {
        if(wNum < 0) {
            return true;
        } else {
           return false;
        }
    }
}
