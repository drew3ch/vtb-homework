package lesson02.homework;

public class Task03 {

    public static void main(String[] args) {

        int secs = 143520;
        System.out.println(secsToTime(secs));

    }

    private static String secsToTime(int secs) {
        int hour = secs / 3600, min = secs / 60 % 60, sec = secs / 1 % 60;
        hour = hour / 24 > 0 ? hour % 24 : hour;
        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

}