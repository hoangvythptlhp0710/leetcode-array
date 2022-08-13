package src.Leetcode.Array;

public class Merge_Sort_Array2 {

    public static void merge(int[] n1, int m, int[] n2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = (m + n) - 1;

        while (k >= 0) {
            if (j < 0) {
                n1[k] = n1[i];
                i--;
            } else if (i < 0) {
                n1[k] = n2[j];
                j--;
            } else if (n1[i] > n2[j]) {
                n1[k] = n1[i];
                i--;
            } else if (n1[i] <= n2[j]) {
                n1[k] = n2[j];
                j--;
            }
            k--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 0, 0, 0 };
        int[] arr2 = { 2, 6, 8 };
        merge(arr, 3, arr2, 3);
        System.out.println("DONE1");

    }
}
