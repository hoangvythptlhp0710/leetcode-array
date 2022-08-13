package src.Leetcode.Array;

import java.util.*;

/*
Given an integer array nums, you need to find one continuous subarray that if
you only sort this subarray in ascending order, then the whole array will be sorted
in ascending order.

Return the shortest such subarray and output its length.
 */
public class _581_sshortest_unsorted_continuous_subarray {

    public static int findUnsortedArray(int[] arr) {
        int[] nums = arr.clone();
        Arrays.sort(nums);
        int r = nums.length, l = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] != arr[i]){
                r = Math.max(r, i);
                l = Math.min(l, i);
            }
        }
        return r - l + 1;
    }

    public static void main(String[] args) {
        int[] nums = {2, 6, 5, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedArray(nums));
    }
}
