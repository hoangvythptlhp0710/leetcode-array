package src.Leetcode.Array;

public class remove_element {
    public static int removeElement(int[] a, int v) {
        int n = a.length;

        for (int i = 0; i < n;) {
            if (a[i] == v) {
                for (int j = i; j <= (n - 2); j++) {
                    a[j] = a[j + 1];
                }
                n--;
            } else {
                i++;
            }
        }
        return n;
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 5 };
        System.out.println(removeElement(a, 2));
        System.out.println("done~");
    }
}
