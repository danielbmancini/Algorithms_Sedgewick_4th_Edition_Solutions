package s1_1.Better_Fibonaccis;
/*
* exercise 1.1.19
*/
public class Matrix_Fibonacci {
    final static long[][] fibonacciMatrix = {{1, 1}, {1, 0}}; //F(n) = fibonacciMatrix^n
    static long[][] matrix = {{1, 1}, {1, 0}};

    public static long F(int N) {
        if (N < 3)
            return fibonacciMatrix[0][0];
        else {
            for (int i = 0; i < N - 2; i++)
                multiply();
            return matrix[0][0];
        }

    }

    private static void multiply() //increase n by 1
    {
        long[][] temp = fillTemp();

        matrix[0][0] = temp[0][0] * fibonacciMatrix[0][0] + temp[0][1] * fibonacciMatrix[1][0];
        matrix[0][1] = temp[0][0] * fibonacciMatrix[0][1] + temp[0][1] * fibonacciMatrix[1][1];
        matrix[1][0] = temp[1][0] * fibonacciMatrix[0][0] + temp[1][1] * fibonacciMatrix[1][0];
        matrix[1][1] = temp[1][0] * fibonacciMatrix[0][1] + temp[1][1] * fibonacciMatrix[1][1];
    }

    private static long[][] fillTemp() { //"temp = matrix" just can't be used
        return new long[][]{{matrix[0][0], matrix[0][1]},
                {matrix[1][0], matrix[1][1]}};
    }

    public static void main(String[] args) {
        System.out.println(F(10));
    }
}
