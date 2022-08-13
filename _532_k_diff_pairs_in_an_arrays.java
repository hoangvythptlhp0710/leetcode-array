package src.Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class _532_k_diff_pairs_in_an_arrays {
    public static int findPairs(int[] nums, int k){
       if (k < 0) return 0;
       int res = 0;
       Map<Integer, Integer> map = new HashMap<>();
       for (int n: nums){
           map.put(n, map.getOrDefault(n,0) + 1);
       }
       for (int n: map.keySet()){
           if (k == 0){
               if (map.get(n) >= 2) res++;
           }
           else{
               if (map.containsKey(n + k)) res++;
           }
       }
       return res;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,1,5,4};
        int k = 0;
        System.out.println(findPairs(arr,k));
    }
}
