package lesson1.homework26102020;

public class Exception {

    private static final int MAX_LENGTH = 4;
    private static String[][] arr = new String[MAX_LENGTH][MAX_LENGTH];

    public static void newArr(String[][] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr.length == MAX_LENGTH && arr[i].length == MAX_LENGTH) {
                    try {
                        result += Integer.parseInt(arr[i][j]);
                    } catch (RuntimeException e) {
                        throw new MyArrayDataException(i, j, arr[i][j]);
                    }
                } else {
                    throw new MyArraySizeException(MAX_LENGTH, i, arr[i].length);
                }
            }
        }
        System.out.println("Sum of cells of the array is " + result);
    }

    public static void main(String[] args) {

        arr = new String[][] {
                {
                    "1","1","1","1"
                },
                {
                    "1","1","1","1"
                },
                {
                    "1","1","1","1"
                },
                {
                    "1","1","1","1"
                }
        };

        try {
            newArr(arr);
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

    }
}