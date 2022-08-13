package src.Leetcode.Array;

import java.util.*;

public class _169_majority_element {

    public static int majorityElement(int[] a){
        Arrays.sort(a);
        int n = a.length, left = 0, right = n - 1;
        int mid = (left + (right - left))/2;
        return a[mid];
    }

    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));

    }
}
