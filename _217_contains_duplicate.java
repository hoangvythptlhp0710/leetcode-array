package src.Leetcode.Array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class _217_contains_duplicate {

    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++){
            if (nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }

    public static boolean containsDuplicate2(int[] nums){
        HashSet<Integer> test = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (test.contains(nums[i])) {
                return true;
            }
            else{
                test.add(nums[i]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(containsDuplicate(nums));
        System.out.println(containsDuplicate2(nums));
    }
}
