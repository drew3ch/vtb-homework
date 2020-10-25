package lesson1.homework26102020;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j, String value) {
        super("Cell [" + i + "x" + j + "] contains a non-int type with value is '" + value + "'");
    }

}
