package Leetcode.Array;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *              300. LONGEST INCREASING SUBSEQUENCE
 *
 *       Given an integer array nums, return the length of the longest strictly subsequence.
 *       A subsequence is a sequence that can be derived from an array by deleting some or no
 *       elements without changing the order of the remaining elements. For example, [3,6,2,7]
 *       is a subsequence of the array [0,3,1,6,2,2,7]
 */

public class _300_longest_increasing_subsequence {
    public static int lengthOfLTS(int[] arr){
        if (arr.length == 1) {
            return 1;
        }
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int[] dp = new int[arr.length];
        for (int i = n - 1; i >= 0; i--){
            dp[i] = 1;
            for (int j = i + 1; j < n; j++){
                if (arr[i] < arr[j]){
                    dp[i] = Math.max(dp[i], dp[i+1]);
                }
            }
            max = Math.max(max, dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLTS(new int[] {10,9,2,5,3,7,101,18}));
    }
}
