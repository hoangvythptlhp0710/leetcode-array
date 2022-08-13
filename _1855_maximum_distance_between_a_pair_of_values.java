package src.Leetcode.Array;

import java.util.*;

/*
You are given two non-increasing 0-indexed integer arrays nums1 and nums2.

A pair of indices (i, j), where 0 <= i < nums1.length and 0 <= j < nums2.length, is valid if both i <= j and nums1[i] <= nums2[j]. The distance of the pair is j - i​​​​.

Return the maximum distance of any valid pair (i, j). If there are no valid pairs, return 0.

An array arr is non-increasing if arr[i-1] >= arr[i] for every 1 <= i < arr.length.
 */
public class _1855_maximum_distance_between_a_pair_of_values {

    public static int maxDistance(int[] arr1, int[] arr2){
        int distance = 0, i = 0, j = 0;
        while (i < arr1.length && j < arr2.length){
            if (i <= j){
                if (arr1[i] <= arr2[j]){
                    distance = Math.max(distance, j - i);
                    j++;
                }
                else{
                    i++;
                }
            }
            else{
                j++;
            }
        }
        return distance;
    }

    public static void main(String[] args) {
        int[] arr1 = {55,30,5,4,2};
        int[] arr2 = {100,20,10,10,5};
        System.out.println(maxDistance(arr1, arr2));
    }
}
