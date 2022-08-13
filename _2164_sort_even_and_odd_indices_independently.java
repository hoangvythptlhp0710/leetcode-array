package src.Leetcode.Array;

import java.util.*;

public class _2164_sort_even_and_odd_indices_independently {

    public static String sortEvenOdd(int[] nums){
        int n = nums.length;
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();
        for (int i = 0; i < nums.length; i+=2){
            even.add(nums[i]);
        }
        for (int i = 1; i < nums.length; i+=2){
            odd.add(nums[i]);
        }
        Collections.sort(even);Collections.sort(odd);
        int indexForarrayList = 0;
        for (int i = 0; i < n; i+=2){
            nums[i] = even.get(indexForarrayList++);
        }
        indexForarrayList = odd.size() - 1;
        for (int i = 1; i < n; i+=2){
            nums[i] = odd.get(indexForarrayList--);
        }
        return Arrays.toString(nums);
    }

    public static void main(String[] args) {
        int[] nums = {6,16,26,32,34,36,36,33,41,31,31,27,44,45,15,15,9,46};
        System.out.println(sortEvenOdd(nums));
    }
}
