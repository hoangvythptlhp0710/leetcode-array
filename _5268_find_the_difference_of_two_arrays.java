package src.Leetcode.Array;

import java.util.*;

/*
Given two 0-indexed integer arrays nums1 and nums2, return a list answer of size 2 where:

        * answer[0] is a list of all distinct integers in nums1 which are not present in nums2.
        * answer[1] is a list of all distinct integers in nums2 which are not present in nums1.

Note that the integers in the lists may be returned in any order.
 */
public class _5268_find_the_difference_of_two_arrays {

    public static List<List<Integer>> findDiff(int[] nums1, int[] nums2){
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();
        for (int i = 0; i < nums1.length; i++){
            h1.add(nums1[i]);
        }
        for (int j = 0;j < nums2.length; j++){
            h2.add(nums2[j]);
        }
        List<Integer> a = new ArrayList<>();
        for (int num: h1){
            if (!h2.contains(num)){
                a.add(num);
            }
        }
        List<Integer> b = new ArrayList<>();
        for (int num: h2){
            if (!h1.contains(num)) {

                b.add(num);
            }
        }
        res.add(a);
        res.add(b);
        return res;
    }
}
