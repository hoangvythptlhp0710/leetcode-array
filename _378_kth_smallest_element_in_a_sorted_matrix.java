package Leetcode.Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Given an n x n matrix where each of the rows and columns is sorted in ascending order,
 * return the kth smallest element in the matrix
 *
 * Note that it is the kth smallest element in the sorted order, not the kth distinct element.
 *
 * You muse find a solution with a memory complexity better than O(n^2)
 *
 */
public class _378_kth_smallest_element_in_a_sorted_matrix {

    public static int kthSmallest(int[][] matrix, int k){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(k-1);
    }

    public static void main(String[] args) {
        int[][] matrix = {{-5}};
        System.out.println(kthSmallest(matrix, 1));
    }
}
