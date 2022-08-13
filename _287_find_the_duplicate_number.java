package src.Leetcode.Array;

import java.util.*;


/*

Given an array of integers nums containing n + 1 integers where
each integer is in the range [1, n] inclusive.

There is only one repeated number in nums, return this repeated number.

You must solve the problem without modifying the array nums and uses only constant extra space.

 */
public class _287_find_the_duplicate_number {

    public static int findDuplicate(int[] nums){
        int duplicateElement = 0;
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++){
            if (nums[i-1] == nums[i]){
                duplicateElement = nums[i];
            }
        }
        return duplicateElement;
    }

    public static int optimize(int[] nums){
        boolean[] numsi = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++){
            if (numsi[nums[i]]){
                return nums[i];
            }
            numsi[nums[i]] = true;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums));
        System.out.println(optimize(nums));
    }

}
