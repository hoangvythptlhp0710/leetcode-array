package src.Leetcode.Array;

/*
            322. COIN CHANGE

     You are given an integer array coins representing coins of different denominations and an integer
     amount representing a total amount of money.

     Return the fewest number of coins that you need to make up that amount. If that amount of money cannot be
     made up by any combination of the coins, return -1

     You may assume that you have an infinite number of each kind of coin.

 */


import java.util.*;

public class _322_coin_change {

    public static int coinChange(int[] coin, int amount){
        int[] dp = new int[amount +1];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int x: coin){
            for (int j = x; j < dp.length; j++){
                if (dp[j-x] != Integer.MAX_VALUE){
                    dp[j] = Math.min(dp[j], dp[j-x] + 1);
                }
            }
        }
        return dp[dp.length - 1] == Integer.MAX_VALUE ? -1 : dp[dp.length - 1];
    }


    public static void main(String[] args) {
        int[] coin = {1,2,5};
        int amount = 11;
        System.out.println(coinChange(coin, amount));
    }
}
