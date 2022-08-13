package Leetcode.Array;

import java.util.LinkedList;

/**
 *          1696. JUMP GAME VI
 *
 *      You are give a 0-indexed integer array nums and an integer k.
 *
 *      You are initially standing at index 0. In one move, you can jup at most k steps
 *      forward without going outside the boundaries of the array. That is, you can jump
 *      from index i to any index in the range [i+1, min(n-1, i+k)] inclusive.
 *
 *      You want to reach the las index of the array (index n - 1). Your score is the sum of
 *      all nums[j] for each index j you visited in the array.
 *
 *      Return the maximum score you can get.
 *
 */

public class _1696_jump_game_VI {

    public static int maxRes(int[] nums, int k){
        LinkedList<Integer> list = new LinkedList<>();
        list.add(0);
        for (int i = 1; i < nums.length; i++){
            //checking if the value lies between the range of last k values, if not "bye-bye"
            if(list.getFirst() < i-k) list.removeFirst();
            // setting nums[i] equal to curr. value and curr. max value
            nums[i] += nums[list.getFirst()];
            //if index not between last k values, remove it.
            while(!list.isEmpty() && nums[list.getLast()] <= nums[i]) list.removeLast();
            list.addLast(i);
        }
        return nums[nums.length -1];
    }

    public static void main(String[] args) {
        System.out.println(maxRes(new int[] {1,-1,-2,4,-7,3}, 2));
    }

}
