package src.Leetcode.Array;

import java.util.*;

public class _821_shortest_distance_to_a_character {
    public static int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] out = new int[s.length()];
        int c_pos = -n;

        for (int i = 0; i  < n; i++){
            if (s.charAt(i) == c){
                c_pos = i;
            }
            out[i] = i - c_pos;
        }

        for (int i = n - 1; i >= 0; i--){
            if (s.charAt(i) == c){
                c_pos = i;
            }
            out[i] = Math.min(out[i], Math.abs(i - c_pos));
        }
        return out;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        char c = 'v';
        System.out.println(Arrays.toString(shortestToChar(s, c)));
    }
}
