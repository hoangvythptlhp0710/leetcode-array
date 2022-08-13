package src.Leetcode.Array;

import java.util.*;

public class _1346_check_if_n_and_its_double_exists {

    public static boolean checkIfExist(int[] arr){
        boolean res = false;
        Set<Integer> set = new HashSet<>();
        for (int i : arr){
            if (set.contains(2*i) || (i%2 == 0) && set.contains(i/2)){
                res = true;
            }
            set.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {10, 2, 5, 3};
        System.out.println(checkIfExist(arr));
    }
}
