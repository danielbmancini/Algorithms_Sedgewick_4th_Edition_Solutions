package s1_1.Better_Fibonaccis;

/*
* exercise 1.1.19
*/
public class Doubling_Fibonacci {


    public static long F(int N)//F(2a+1) + F²(a) + F²(a+1)
    {
        if(N == 1 || N == 2) return 1;
        if(N == 0) return 0;
        int k = N % 2;
        if(k != 1)
            return F(N +1) - F(N-1); //for even numbers; from F(n) = F(n+1) - F(n-1).
        int use = (N-1)/2; //inverse function of 2a+1
        long term1 = F(use);
        long term2 = F(use+1);
        term1 *= term1;
        term2 *= term2;
        return term1 + term2;
    }

    public static void main(String[] args) {
        System.out.println(F(10));
    }
}
