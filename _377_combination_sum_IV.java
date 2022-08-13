package Leetcode.Array;

import java.util.Arrays;

/**
 *      Given an array of distinct integers nums and a target integer, return the number
 *      of possible combinations that add up to target.
 *
 *      The test cass are gen so that the ans can fit in a 32-bit int.
 */

public class _377_combination_sum_IV {

    int[] dp;
    public int combinationSum4(int[] nums, int target){
        dp = new int[target+1];
        dp[0] = 1;
        for (int i = 1; i <= target; i++){
            for (int n: nums){
                if (i >= n){
                    dp[i] += dp[i-n];
                }
            }
        }
        return dp[target];
    }



}
