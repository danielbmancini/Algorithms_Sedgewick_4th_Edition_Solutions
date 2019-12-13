package s1_1;

/*
* exercise 1.1.14
*/
public class lgApproximation {
    static int lg(int N)
    {
        int log2 = 0;
        while(N >= 2)
        {
            log2++;
            N /= 2;
        }
        return log2;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("N is " + n);
        System.out.println("Approximate lg(N) is " + lg(n));
    }
}
