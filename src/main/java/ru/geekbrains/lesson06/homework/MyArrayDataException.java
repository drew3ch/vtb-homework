package ru.geekbrains.lesson06.homework;

public class MyArrayDataException extends RuntimeException {

    public MyArrayDataException(int i, int j, String value) {
        super(String.format("Cell [%dx%d] contains a non-int type with value is '%s'", i, j, value));
    }

}
