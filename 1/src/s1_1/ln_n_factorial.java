package s1_1;
/*
    exercise 1.1.20
 */
public class ln_n_factorial {
    public static void main(String[] args) {
        int n = 10;
        System.out.printf("%nln(%d!) is %f.",n,log_n_fac(n));
    }
    private static double log_n_fac(int n)
    {
        if (n > 1)
            return Math.log(n) + log_n_fac(n-1);
        else
            return 0;
    }
}
