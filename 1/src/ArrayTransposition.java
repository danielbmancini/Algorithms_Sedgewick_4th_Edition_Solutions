/*
 * exercise 1.1.13
 * transposes an M*N array
 */
public class ArrayTransposition {
    public static final int M = 9;
    public static final int N = M;
    public static String[][] array = new String[M][N];
    public static String[][] transposedArray = new String[M][N];

    static {
        int row = 0;
        for (String[] arr : array) {
            row++;
            for (int i = 1; i <= arr.length; i++) {//i = column
                arr[i - 1] = "a" +
                        String.format("%c%c", (char) ('\u2080' + row), (char) ('\u2080' + i)); //appends matrix-like index subscripts to 'a'
            }
        }
    }

    public static void transpose() {
        int row = 0;
        for (String[] arr : array) {
            for (int i = 0; i < N; i++) {
                transposedArray[i][row] = arr[i]; //arr row is transposedArray's column
            }
            row++;
        }
    }

    public static String printArray(String[][] a) {
        StringBuilder array = new StringBuilder();
        for (String[] arr : a) {
            for (int i = 0; i < arr.length; i++) {
                array.append(arr[i]).append(" ");
            }
            array.append("\n");
        }
        return array.toString();
    }

    public static void main(String[] args) {
        System.out.printf("Non transposed array:%n%s", printArray(array));
        transpose();
        System.out.printf("%nTransposed array:%n%s", printArray(transposedArray));
    }
}
