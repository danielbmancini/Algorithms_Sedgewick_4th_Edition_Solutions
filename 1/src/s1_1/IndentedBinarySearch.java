package s1_1;

/*
    exercise 1.1.22
 */
public class IndentedBinarySearch {
    private static int depth = 0;
    public static int rank(int key, int[] a)
    { return rank(key, a, 0, a.length - 1);
    }
    public static int rank(int key, int[] a, int lo, int hi)
    {
        depth++;
        System.out.printf("%nCurrent depth is %d. lo is %d, and hi is %d.",depth,lo,hi);
        if (lo > hi) return -1;
        int mid = lo + (hi - lo) / 2;
        if
        (key < a[mid]) return rank(key, a, lo, mid - 1);
        else if (key > a[mid]) return rank(key, a, mid + 1, hi);
        else
            return mid;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.printf("%n'3' is located at index %d.",rank(3,array));
    }
}
