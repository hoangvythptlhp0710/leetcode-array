package src.Leetcode.Array;

public class Merge_Sort_Array {

    public static void merge(int[] n1, int m, int[] n2, int n) {

        for (int ai : n2) {
            chenPhanTuVaoMang(ai, n1, m);
            m++;
        }
    }

    private static void chenPhanTuVaoMang(int x, int[] a, int m) {
        boolean foundK = false;
        for (int k = 0; k < m; k++) {
            if (a[k] > x) {
                foundK = true;
                for (int i = m - 1; i >= k; i--) {
                    a[i + 1] = a[i];
                }
                a[k] = x;
                break;
            }

        }

        if (foundK == false) {
            a[m] = x;
        }
    }

    public static void main(String[] args) {
        int[] n1 = { 2, 9, 7, 8, 6, 0, 0, 0, 0 };
        int[] n2 = { 5, 9, 1, 3 };
        merge(n1, 3, n2, 3);
        System.out.println("DONE!");
    }

}
