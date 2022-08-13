package src.Leetcode.Array;

import java.util.*;

public class _354_russian_doll_envelopes {

    public static int binarySearch(int[] dp, int val){
        int low = 0, high = dp.length - 1, res = 0;
        while (low < high){
            int mid = low + (high - low) / 2;
            if (dp[mid] < val){
                res = mid;
                low++;
            }
            else{
                high--;
            }
        }
        return res + 1;
    }

    public static int maxEnvelopes(int[][] envelopes){
        Arrays.sort(envelopes, (a,b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);
        int[] lis = new int[envelopes.length+1];
        Arrays.fill(lis, Integer.MAX_VALUE);
        lis[0] = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < envelopes.length; i++){
            int val = envelopes[i][1];
            int insertIND = binarySearch(lis, val);
            ans = Math.max(ans, insertIND);
            if(lis[insertIND] >= val){
                lis[insertIND] = val;
            }
        }
        return ans;
    }

}
