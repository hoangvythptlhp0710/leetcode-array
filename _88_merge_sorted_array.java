package src.Leetcode.Array;

import java.util.*;

public class _88_merge_sorted_array {

    public static void merge(int[] A, int m, int [] B, int n){
        for (int i = m+n-1, a = m-1, b = n-1; b>=0; i--) {
            if (a >= 0 && A[a] > B[b]) A[i] = A[a--];
            else A[i] = B[b--];
    }
        System.out.println(Arrays.toString(A));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
