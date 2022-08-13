package src.Leetcode.Array;

import java.util.*;

public class _1461_check_if_string_contains_all_binary_codes_of_size_k {

    public static boolean hasAllCodes(String s, int k){
        Set<String> set = new HashSet<>();
        int l = 0, r = k - 1;
        while (r < s.length()){
            String ss = s.substring(l, r+1);
            set.add(ss);
            l++;
            r++;
        }
        for (var v: set){
            System.out.println(v);
        }
        return (set.size() == Math.pow(2, k));
    }

}
