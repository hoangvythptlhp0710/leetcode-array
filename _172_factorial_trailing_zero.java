package src.Leetcode.Array;

import java.util.*;

public class _172_factorial_trailing_zero {

    public static int trailingZeroes(int n) {
        int count = 0;
        for (int i = 5; n / i >= 1; i *=5){
            count += n/i;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(trailingZeroes(n));
    }
}
