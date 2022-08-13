package src.Leetcode.Array;

/**
 *                  1658. MINIMUM OPERATIONS TO REDUCE X TO ZERO
 *
 *         You are given an integer array nums and an integer x. In one operation, you can either remove
 *         the leftmost or the rightmost element from the array nums and subtract its value from x. Note that
 *         this modifies the array for future operations.
 *
 *         Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
 *
 *
 *      Key observation: The number of elements remove equals n minus the number of elements aren't removed
 *      Therefore, to find the minimum number of elements to remove, we can find the maximum number that are not removed.
 *
 */
public class _1658_minimum_ops_to_reduce_x_to_zero {

    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int i: nums){
            sum += i;
        }
        int maxLen = -1, curSum = 0;
        for (int l = 0, r= 0; r < nums.length; r++){
            curSum += nums[r];
            while (l <= r && curSum > sum - x){
                curSum -= nums[l++];
            }
            if (curSum == sum - x){
                maxLen = Math.max(maxLen, r- l + 1);
            }
        }
        return maxLen == -1 ? -1 : nums.length - maxLen;
    }

    public static void main(String[] args) {

    }
}
