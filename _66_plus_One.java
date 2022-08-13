package src.Leetcode.Array;

import java.util.Arrays;
import java.util.Scanner;


public class _66_plus_One {

    public static int[] plusOne(int[] digits){

        int n = digits.length;
        for (int i = digits.length - 1; i >= 0; i--){
            if (digits[i] < 9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newArray = new int[digits.length+1];
        newArray[0] = 1;
        return newArray;
    }

    public static void main(String[] args) {
        int[] digits = {9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
