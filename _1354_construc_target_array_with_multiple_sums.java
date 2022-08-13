package src.Leetcode.Array;


import java.util.*;

/**
 *              1354. CONSTRUCT TARGET ARRAY WITH MULTIPLE SUMS
 *
 *         You are given an array target of n integers. from a starting array arr consisting of n 1's, you may perform
 *         the following procedure:
 *         - let x be the sum of all elements currently in your array.
 *         - choose index i, such that 0 <= i < n and set the value of arr at index i to x.
 *         - You may repeat this procedure as many times as needed.
 *         Return true if it is possible to construct the target array from arr, otherwise, return false.
 *
 */

public class _1354_construc_target_array_with_multiple_sums {

    public boolean isPossible(int[] target){
        Queue<Integer> target1 = new PriorityQueue<>((a,b) -> b - a);
        int sum  = 0;
        for (int num: target){
            sum += num;
            target1.add(num);
        }
        while(target1.peek() != 1){
            int num = target1.poll();
            sum -= num;
            if (num <= sum || sum < 1) return false;
            num %= sum;
            sum += num;
            target1.add(num > 0 ? num : sum);
        }
        return true;
    }
}
