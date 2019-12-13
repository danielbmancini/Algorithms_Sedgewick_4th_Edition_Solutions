package s1_1;

import java.util.Arrays;

/*
* exercise 1.1.15
*/
public class HistogramArray {
    static int countAppearances(int[] a,int k)//used variation of linear search because reasons
    {
        int appearances = 0;
        for (int i = 0; i < a.length ; i++) {
           if(appearances > 0 && a[i] != k) //breaks loop if k doesn't appear anymore in the sorted array
                break;
            if(a[i] == k)
                appearances++;
        }
        return appearances;
    }
    static int[] histogram(int[] a,int M) //it's in the exercise, but this count how many times each entry of {0,1....,M-1} is in the argument array
    {
        Arrays.sort(a);
        int[] array = new int[M];
        for (int i = 0; i < M; i++) //fills histogram array
            array[i] = countAppearances(a,i);
        return array;
    }

    public static void main(String[] args) {
        int[] a = {0,1,2,2,5,4};
        System.out.printf("%nArgument array: %s",Arrays.toString(a));
        System.out.printf("%nHistogram array: %s",Arrays.toString(histogram(a,5)));
    }
}
