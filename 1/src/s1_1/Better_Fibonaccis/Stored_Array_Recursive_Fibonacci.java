package s1_1.Better_Fibonaccis;

import java.util.Arrays;

/*
* exercise 1.1.19
*/
public class Stored_Array_Recursive_Fibonacci {
    final static int N = 10;
    static long[] fibonacci = new long[N+1];
    static {
        Arrays.fill(fibonacci,-1);
        fibonacci[0] = 0;
        fibonacci[1] = 1;
    }
    public static long F(int n) //reaches base case at n = 1, 0
    {
        if (fibonacci[n] == -1) //if fibonacci[n] == null
        {
            fibonacci[n] = F(n-1) + F(n-2);
        }
        return fibonacci[n];
    }

    public static void main(String[] args) {
        System.out.println(F(N)); //N in F(N) shouldn't be changed here.
    }
}
