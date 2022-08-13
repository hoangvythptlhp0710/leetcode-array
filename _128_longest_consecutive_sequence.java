package Leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;

/**
 *
 *
 *      128. LONGEST CONSECUTIVE SEQUENCE
 *     Given an unsorted array of integers nums, return the
 *     length of the longest consecutive elements sequence.
 *
 *     You must write an algo that runs in O(n) times.
 *
 *     Eg:
 *     Input: nums = [100,4,200,1,3,2]
 *     Output: 4
 *
 */


public class _128_longest_consecutive_sequence {

    public static int longestConsecutive(int[] nums){
        HashSet<Integer> hash = new HashSet<>();
        for (int i = 0; i < nums.length; i++){
            hash.add(nums[i]);
        }
        int ans = 0, max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++){
            if (!hash.contains(nums[i] - 1)){
                int j = nums[i];
                while (hash.contains(j)){
                    j++;
                }
                if (ans < j - nums[i]){
                    ans = j - nums[i];
                }
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[] {9,1,4,7,3,-1,0,5,8,-1,6}));
    }
}
