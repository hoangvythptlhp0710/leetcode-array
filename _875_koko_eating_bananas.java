package src.Leetcode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class _875_koko_eating_bananas {

    public static int minEatingSpeed(int[] arr, int h) {
        long sum = 0;
        for (int i: arr) sum += i;
        long speed = (sum - 1)/ h + 1L;
        while (true){
            if (canFinish(arr, speed, h)) return (int) speed;
            else speed++;
        }
    }

    private static boolean canFinish(int[] arr, long k, int h){
        int hour = 0;
        for (int i: arr){
            hour += (i - 1) / k+1;
        }
        return hour <= h;
    }


    public static void main(String[] args) {
        int[] arr= {3,6,7,11};
        int h = 8;
        System.out.println(minEatingSpeed(arr, h));
    }
}
