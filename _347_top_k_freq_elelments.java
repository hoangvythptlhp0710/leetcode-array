package src.Leetcode.Array;

import java.util.*;

public class _347_top_k_freq_elelments {

    public int[] topKFreq(int[] nums, int k) {
        Arrays.sort(nums);
        int[] res = new int[k];
        int[] count = new int[nums.length];
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < count.length; j++) {
                if (nums[i - 1] == nums[i]) {
                    count[j]++;
                }
            }
        }
        for(int i = 0; i < k; i++){
            res[i] = count[i];
        }
        return res;
    }
}
