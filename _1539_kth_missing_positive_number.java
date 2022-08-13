package src.Leetcode.Array;

import java.util.*;

/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.

Find the kth positive integer that is missing from this array.



 */
public class _1539_kth_missing_positive_number {
    /*
    C1:
    cách này có runtime là 2664ms, ăn hơn 200mb bộ nhớ (Brute-force) :))))
     */
    public static int findKthPOsitive(int[] arr, int target){
        Set<Integer> set = new HashSet<>();
        for (int i = 1; i < 10000; i++){
            set.add(i);
            for (int j = 0; j < arr.length; j++){
                set.remove(arr[j]);
            }
        }
        Object[] resA = set.toArray();
        return (int) resA[target];
    }

    /*
    C2: Sử dụng tìm kiếm nhị phân Binary Search
     */

    public static  int findKthPositive(int[] arr, int k){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int mid = l + (r-l)/2;
            int midVal = arr[mid] - mid - 1;
            if (midVal >= k) r = mid - 1;
            else if (midVal < k){
                l = mid + 1;
            }
        }
        return k + l;
    }
}
