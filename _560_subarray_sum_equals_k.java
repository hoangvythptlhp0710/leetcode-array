package src.Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class _560_subarray_sum_equals_k {

    public static int subarraySum(int[] nums, int k){
        int count = 0, sum = 0;
        Map<Integer, Integer> hash = new HashMap<>();
        hash.put(0,1);
        for (int i = 0; i < nums.length; i++){
            sum += nums[i];
            if (hash.containsKey(sum - k)){
                count += hash.get(sum-k);
            }
            hash.put(sum, hash.getOrDefault(sum, 0) + 1);
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr ={1,1,1};
        int k = 2;
        System.out.println(subarraySum(arr,k));
    }
}
