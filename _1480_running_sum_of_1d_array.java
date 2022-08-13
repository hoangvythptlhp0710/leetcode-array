package src.Leetcode.Array;

import java.util.*;

/*
            1480. RUNNING SUM OF 1D ARRAY
    Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).

Return the running sum of nums.

 */
public class _1480_running_sum_of_1d_array {
    public static String runningSum(int[] num) {
        for (int i = 1; i < num.length; i++) {
            num[i] += num[i - 1];
        }
        return Arrays.toString(num);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2, 10, 1};
        System.out.println(runningSum(arr));
    }
}
