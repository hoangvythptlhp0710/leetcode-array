package src.Leetcode.Array;

import java.util.Arrays;
import java.util.Scanner;

public class _1094_car_pooling {

    public static boolean carPooling(int[][] trips, int capacity) {
        int total = 0;
        int [] arr = new int[1001];
        for (int i =0; i < trips.length; i++){
            arr[trips[i][1]] += trips[i][0];
            arr[trips[i][2]] -= trips[i][0];
        }
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
            if (total > capacity){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] trips = {{2, 1, 5}, {3, 3, 7}};
        int capacity = 5;
        System.out.println(carPooling(trips, capacity));
    }
}
