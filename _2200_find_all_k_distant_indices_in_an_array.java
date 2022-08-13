package src.Leetcode.Array;

import java.util.*;

public class _2200_find_all_k_distant_indices_in_an_array {

    public static List<Integer> findKIndices(int[] nums, int key, int k){
        List<Integer> res = new ArrayList<Integer>();
        int n = nums.length;
        for(int j = 0; j < n; j++){
            if(res.size() == n){
                break;
            }

            if(nums[j] == key){
                for(int i = 0; i<n; i++){
                    if((Math.abs(i-j) <= k)){
                        if(!res.contains(i)){
                            res.add(i);
                        }
                    }
                }
            }
        }

        return res;
    }

}
