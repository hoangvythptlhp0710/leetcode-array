package src.Leetcode.Array;

public class _121_best_time_to_buy_and_sell_stock {

    public static int maxProfit(int[] arr) {
        int max = 0, l = 0, r = 1;
        int [] profit = new int[1001];
        while (r < arr.length){
            if (arr[l] < arr[r]) {
                profit[r] = arr[r] - arr[l];
            }
            else{
                l = r;
            }
            r++;
        }
        for (int i = 0; i < profit.length; i++){
            if (profit[i] > max) {
                max = profit[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,7,2,4,9,0,9};
        System.out.println(maxProfit(arr));
    }
}
