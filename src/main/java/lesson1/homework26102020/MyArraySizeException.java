package lesson1.homework26102020;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int max, int i, int j) {
        super(String.format("This array is not [" + max + "x" + max + "] in size. Now array size is [" + i + "x" + j + "]"));
    }

}
