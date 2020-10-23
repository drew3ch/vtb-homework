package lesson1.homework26102020;

public class Exception {

    private static final int MAX_LENGTH = 4;
    private static String[][] arr = new String[MAX_LENGTH][MAX_LENGTH];

    public static void newArr(String[][] arr) {

        int result = 0;

        if (arr.length != MAX_LENGTH || arr[0].length != MAX_LENGTH) {
            throw new MyArraySizeException("This array is not [" + MAX_LENGTH + "x" + MAX_LENGTH + "] in size. Now array size is [" + arr.length + "x" + arr[0].length + "]");
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                try {
                    result += Integer.parseInt(arr[i][j]);
                } catch (RuntimeException e) {
                    throw new MyArrayDataException("Cell [" + i + "x" + j + "] contains a non-int type with value is '" + arr[i][j] + "'");
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