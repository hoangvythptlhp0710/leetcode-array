package src.Leetcode.Array;

/*

Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

[4,5,6,7,0,1,2] if it was rotated 4 times.
[0,1,2,4,5,6,7] if it was rotated 7 times.
Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

Given the sorted rotated array nums of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.
 */
import java.util.*;

public class _153_find_minimum_in_rotated_sorted_array {

    public static int findMin(int[] nums){
        int res = 0;
        if (nums.length == 1) return nums[0];
        int l = 0, r = nums.length - 1;
        if (nums[r] > nums[0]) return nums[0];
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] > nums[mid+1]) return nums[mid+1];
            if (nums[mid] > nums[0])
                l= mid + 1;
            else{
                r = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11,12,13,4,5,6,7,8,9,10};
        System.out.println(findMin(arr));
    }
}
