package src.Leetcode.Array;

import java.util.*;

public class _1007_minimum_domino_rotations_for_equai_row {

    public static int minDominoRotations(int[] top, int[] bottom) {
        int[] countA = new int[7];
        int[] countB = new int[7];
        int[] sameI = new int[7];
        for (int i = 0; i < top.length; i++){
            ++countA[top[i]];
            ++countB[bottom[i]];
            if (top[i] == bottom[i]){
                ++sameI[top[i]];
            }
        }
        for(int i = 1; i < 7; i++){
            if (countA[i] + countB[i] - sameI[i] >= top.length){
                return Math.min(countA[i], countB[i]) - sameI[i];
            }
        }
        return -1;

    }


    public static void main(String[] args) {
        int[] n1 = {2,1,2,4,2,2};
        int[] n2 = {5,2,6,2,3,2};
        System.out.println(minDominoRotations(n1, n2));
    }

}
