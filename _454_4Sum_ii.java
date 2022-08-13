package src.Leetcode.Array;

import java.util.HashMap;
import java.util.Map;

public class _454_4Sum_ii {

    public static int fourSumCount(int[] num1, int[] num2, int[] num3, int[] num4){
        var pairCountBySum = new HashMap<Integer, Integer>();
        for (var num1s: num1){
            for (var num2s: num2){
                pairCountBySum.compute(num1s + num2s, (k, sumCount) -> sumCount == null ? 1 : sumCount+1);
            }
        }
        var fourSumCount = 0;
        for (var num3s: num3){
            for (var num4s: num4){
                fourSumCount += pairCountBySum.getOrDefault(-(num3s + num4s), 0);
            }
        }

        return fourSumCount;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2};
        int[] num2 = {-2,-1};
        int[] num3 = {-1,2};
        int[] num4 = {0,2};
        System.out.println(fourSumCount(num1,num2, num3, num4));
    }
}
