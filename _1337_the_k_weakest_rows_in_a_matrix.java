package src.Leetcode.Array;

import java.util.*;

public class _1337_the_k_weakest_rows_in_a_matrix {

    public static int cnt1(int [] math){
        int cnt = 0;
        for (int i = 0; i < math.length; i++){
            if (math[i] == 1) cnt++;
        }
        return cnt;
    }

    public static String kWeakestRows(int[][] mat, int k){
        int[] res = new int[k];
        int[] count = new int[mat.length];
        for (int i = 0; i < mat.length; i++) {
            count[i] = cnt1(mat[i]);
        }
        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = 0;
            for (int j = 0; j < count.length; j++) {
                if (count[j] < min){
                    min = count[j];
                    minIndex = j;
                }
            }
            res[i] = minIndex;
            count[minIndex] = Integer.MAX_VALUE;
        }
        return Arrays.toString(res);
    }


    public static void main(String[] args) {
        int[][] mat = {{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;
        System.out.println(kWeakestRows(mat, k));
    }
}
