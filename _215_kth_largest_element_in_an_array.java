package src.Leetcode.Array;


import java.util.*;

/**
 *
 *                      215. Kth largest Element in an Array
 *
 *        Given an integer array numbs and an integer k, return the kth largest element in the array.
 *
 *        Note that it is the kth largest element in the sorted order, not the kth distinct order.
 *
 *
 */
public class _215_kth_largest_element_in_an_array {

    public static int partition(int[] a, int l, int r, int key){
        int pivot = a[key];
        swap(a, key, r);
        key = l;
        for (int i = l; i <= r; i++){
            if (a[i] <= pivot){
                swap(a, i, key++);
            }
        }
        return key - 1;
    }

    private static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    public static int quickSelect(int[] nums, int left, int right, int k){
        if (left == right) return nums[left];
        int pIndex = new Random().nextInt(right - left + 1) + left;
        pIndex = partition(nums, left, right, pIndex);
        if (pIndex == k) return nums[k];
        else if (pIndex < k) return quickSelect(nums, pIndex + 1, right, k);
        else{
            return quickSelect(nums, left, pIndex - 1, k);
        }
    }

    public static int findKthLargest(int[] nums, int k){
        return quickSelect(nums, 0, nums.length - 1, k);
    }

    public static void main(String[] args) {
        int[] nums = {3,2,3,1,2,4,5,5,6};
        System.out.println(findKthLargest(nums, 4));
    }
}
