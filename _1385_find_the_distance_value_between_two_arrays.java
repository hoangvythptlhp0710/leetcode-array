package src.Leetcode.Array;

import java.util.*;

public class _1385_find_the_distance_value_between_two_arrays {

    public static int findtheDistanceValueUsingBinSearch(int[] a1, int[] a2, int d){
        int count = 0;
        Arrays.sort(a2);
        for (int i = 0; i < a1.length; i++){
            if (!findDistfromArray(a2, a1[i] + d, a1[i] - d)){
                count++;
            }
        }
        return count;
    }

    public static boolean findDistfromArray(int[] arr, int top, int bottom){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = l+ (r-l)/2;
            if (arr[mid] >= bottom && arr[mid] <= top) return true;
            else if (arr[mid] < bottom) l = mid + 1;
            else{
                r= mid - 1;
            }
        }
        return false;
    }

    public static int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int dist = 0;
        for (int i = 0; i < arr1.length; i++){
            int count = 0;
            for (int j = 0; j < arr2.length; j++){
                if (Math.abs(arr1[i]-arr2[j]) > d){
                    count++;
                }
            }
            if (count == arr2.length){
                dist++;
            }
        }

        return dist;
    }

    public static void main(String[] args) {
        int[] arr1 = {4,5,8};
        int[] arr2 = {10,8,9,1};
        int d = 2;
        System.out.println(findTheDistanceValue(arr1, arr2, d));
        System.out.println(findtheDistanceValueUsingBinSearch(arr1, arr2, d));
    }

}
