package src.Leetcode.Array;

import java.util.Scanner;

public class _9_palindrome_number {
    public static boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        char[] arr = s.toCharArray();
        for (int i = 0; i < arr.length/2; i++){
            if (arr[i] != arr[arr.length-i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
    }
}
