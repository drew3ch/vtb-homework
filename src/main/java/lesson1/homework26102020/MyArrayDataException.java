package lesson1.homework26102020;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j, String value) {
        super(String.format("Cell [%dx%d] contains a non-int type with value is '%s'", i, j, value));
    }

}
