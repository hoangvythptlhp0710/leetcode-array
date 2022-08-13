package src.Leetcode.Array;


import java.util.*;

/*

Given an array nums which consists of non-negative integers and an integer m, you can split the array into m non-empty continuous subarrays.

Write an algorithm to minimize the largest sum among these m subarrays.


 */
public class _410_split_array_largest_sum {

    public static int splitArray(int[] arr, int k){
        int[] addArray = new int[k];
        int sum = 0, max = Integer.MIN_VALUE;
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < addArray.length; j++){
                sum = arr[i];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        System.out.println(splitArray(arr, m));
    }
}
