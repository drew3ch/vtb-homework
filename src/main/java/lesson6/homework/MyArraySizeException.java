package lesson6.homework;

public class MyArraySizeException extends RuntimeException {

    public MyArraySizeException(int max, int i, int j) {
        super(String.format("This array is not [" + max + "x" + max + "] in size. Incorrect array size in [" + i + "x" + j + "]"));
    }

}
