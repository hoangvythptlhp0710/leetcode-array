package src.Leetcode.Array;

/*

You are given an array of integers stones where stones[i] is the weight of the ith stone.

We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:

        If x == y, both stones are destroyed, and
        If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
        At the end of the game, there is at most one stone left.

Return the smallest possible weight of the left stone. If there are no stones left, return 0.


 */
import java.util.*;

public class _1046_last_stone_weight {

    public static int lastStoneWeight(int[] stones){
        PriorityQueue<Integer> max_heap = new PriorityQueue<Integer>(stones.length,(a,b) -> b-a);
        for (int i: stones){
            max_heap.offer(i);
        }
        while(max_heap.size() > 1){
            int a = max_heap.peek();
            max_heap.poll();
            int b = max_heap.peek();
            max_heap.poll();
            if (a != b){
                max_heap.offer(a-b);
            }
        }
        return max_heap.isEmpty() ? 0 : max_heap.peek();
    }
}
