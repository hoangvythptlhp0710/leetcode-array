package src.Leetcode.Array;

public class remove_element2 {
    public static int removeElement(int[] a, int x) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != x) {
                a[k] = a[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 1, 2, 3 };
        removeElement(arr, 4);
    }

}
