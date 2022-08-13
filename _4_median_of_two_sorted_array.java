package src.Leetcode.Array;
/*
Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

The overall run time complexity should be O(log (m+n)).
 */

import java.util.*;

public class _4_median_of_two_sorted_array {

    public static double findMedianSortedArrays(int[] a, int[] b){
        double res = 0;
        int aIndex = a.length - 1;
        int bIndex = b.length - 1;
        int cIndex = a.length + b.length - 1;
        int[] c = new int[cIndex + 1];

        // trộn mảng a và b thành c
        for (int i = cIndex; i > -1; i--) {
            if (aIndex > -1 && bIndex > -1) {
                if (a[aIndex] > b[bIndex]) {
                    c[i] = a[aIndex--];
                } else {
                    c[i] = b[bIndex--];
                }
            } else if (bIndex == -1) {
                c[i] = a[aIndex--];
            } else if (aIndex == -1) {
                c[i] = b[bIndex--];
            }
        }
        if (c.length % 2 != 0){
            int k = c.length/2;
            res = c[k];
        }
        else{
            int k1 = c.length/2;
            int k2 = (c.length/2) - 1;
            res = (double) (c[k1] + c[k2])/2;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};int[] num2 = {3,4};
        System.out.println(findMedianSortedArrays(num1, num2));

    }
}
