package src.Leetcode.Array;

import java.util.*;

public class _852_peak_index_in_a_mountain_array {
    public static int peakIndexInMountainArray1(int[] arr) {
        TreeSet<Integer> tree = new TreeSet<>();
        int n = arr.length;
        for (int i = 0; i < n; i++){
            tree.add(arr[i]);
        }
        Integer[] res = tree.toArray(new Integer[0]);
        return res[res.length-1];
    }

    public static int peakIndexInMountainArray(int[] arr){
        int l = 0, r = arr.length - 1;
        while (l <= r){
            int mid = l + (r - l)/2;
            if (arr[mid] >= arr[mid+1]){
                r = mid - 1;
            }
            else{
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3,4,5,6,9,8,7,1,0};
        System.out.println(peakIndexInMountainArray(arr));
    }
}
