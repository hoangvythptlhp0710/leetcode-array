package src.Leetcode.Array;


import java.util.*;

/**
 *              1695. MAXIMUM ERASURE VALUE
 *
 *      You are given an array of positive integers nums and want to erase a subarray containing
 *      unique elements. The score you get by erqsing the subarray is equal to the sum of its elements.
 *
 *      Return the maximum score you can get by erasing exactly one subarray.
 *
 *      An array be is called to be a subarray of a if it forms a contiguous subsequence of a, that is, if
 *      it is equal to a[l], a[l+1],... a[r] for some l,r;
 *
 */
public class _1695_maximum_erasure_value {

    public static int maximumUniqueSubarray(int[] nums){
            int currentSum = 0, max = 0, sum = 0;
            Map<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < nums.length; i++){
                currentSum += nums[i];
                if (map.containsKey(nums[i])){
                    sum = Math.max(sum, map.get(nums[i]));
                }
                max = Math.max(max, currentSum - sum);
                map.put(nums[i], currentSum);
            }
            return max;
    }

    //classic sliding window

    public static int maximumUniqueSubArray(int[] nums){
        boolean[] isVisited = new boolean[10001];
        int sum = 0, curSum = 0, left = 0;
        for (int right = 0; right < nums.length; ++right){
            if (isVisited[nums[right]]){
                sum = Math.max(sum, curSum);
                while(nums[left] != nums[right]){
                    isVisited[left] = false;
                    curSum -= nums[left];
                }
                left++;
            }
            else{
                isVisited[nums[right]] = true;
                curSum += nums[right];
            }
        }
        return sum = Math.max(sum, curSum);
    }


    public static void main(String[] args) {
        int[] nums = {4,2,4,5,6};
        System.out.println(maximumUniqueSubarray(nums));
        System.out.println(maximumUniqueSubArray(nums));
    }
}
