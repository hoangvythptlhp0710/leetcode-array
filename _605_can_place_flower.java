package src.Leetcode.Array;

import java.util.Scanner;

public class _605_can_place_flower {
    public static boolean canPlaceFlowers(int[] a, int n){
        int total = 0;
        for (int i = 0; i < a.length && total < n; i++){
            if (a[i] == 0){
                int next = (i == a.length - 1) ? 0 : a[i+1];
                int prev = (i == 0 ? 0 : a[i-1]);
                if (next == 0 && prev == 0){
                    a[i] = 1;
                    total++;
                }
            }
        }
        if (total == n){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] flowerbed = {1,0,0,0,1};
        int n = 1;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }
}
