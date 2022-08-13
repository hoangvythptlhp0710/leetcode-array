package src.Leetcode.Array;

import java.util.*;

/*
Given a non-negative integer c, decide whether there're two integers a and b such that a^^2 + b^2 = c.
 */
public class _633_sum_of_square_numbers {

    public static boolean judgeSquareSum(int c){
        boolean res = false;
        for (int i = 0; i <= (int) Math.sqrt(c); i++){
            for (int j = 0; j <= (int) Math.sqrt(c); j++){
                if (i*i + j*j == c) res =true;
            }
        }
        return res;
    }

    public static boolean optimize(int c){
        boolean res = false;
        for (long a = 0; a * a <= c; a++){
            int b = c - (int)(a*a);
            if (binarySearch(0,b,b)){
                res = true;
            }
        }
        return res;
    }

    public static boolean binarySearch(long s, long e, long n){
        if (s > e) return false;
        long mid = s + (e-s)/2;
        if (mid * mid == n) return true;
        if (mid * mid > n) return binarySearch(s, mid - 1, n);
        return binarySearch(mid+1, e, n);
    }

    public static void main(String[] args) {
        int c = 5;
        System.out.println(judgeSquareSum(c));
        System.out.println((int) Math.sqrt(c));
    }
}
