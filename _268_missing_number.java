package src.Leetcode.Array;

import java.util.*;

public class _268_missing_number {

    /*
                268. MISSING NUMBER
         Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range
         that is missing from the array.

     */

    public static int missingNumber(int[] nums){
        Set<Integer> hs = new HashSet<>();
        int res = 0;
        Arrays.sort(nums);
        int l = 0, r = nums.length - 1;
        for (int i = 0; i < nums.length; i++){
            hs.add(nums[i]);
        }
        while (l < r){
            
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3,0,1};
        System.out.println(missingNumber(arr));
    }

}
