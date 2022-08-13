package src.Leetcode.Array;

import java.util.Scanner;

public class _567_permutation_in_string {

    public static boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] count = new int[26];
        for (int i = 0; i < s1.length();i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) return true;

        for (int i = s1.length(); i < s2.length(); i++){
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - s1.length()) - 'a']++;
        }
        return false;
    }

    private static boolean allZero(int[] counts){
        for (int i = 0; i < 26; i++){
            if (counts[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eudbaooo";
        System.out.println(checkInclusion(s1, s2));
    }
}

