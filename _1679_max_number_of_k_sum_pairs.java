package src.Leetcode.Array;

import java.util.*;

/*
You are given an integer array nums and an integer k.

In one operation, you can pick two numbers from the array whose sum equals k and remove
them from the array.

Return the maximum number of ops you can perform on the array.

 */
public class _1679_max_number_of_k_sum_pairs {


    public static int maxOps(int[] nums, int k) {
        int count = 0;
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        while (l < r){
            if (nums[l] + nums[r] == k){
                count++;
                l++;
                r--;
            }
            else if (nums[l] + nums[r] < k){
                l++;
            }
            else{
                r--;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxOps(new int[]{1, 2, 3, 4}, 5));
    }
}
