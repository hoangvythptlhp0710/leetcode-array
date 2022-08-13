package Leetcode.Array;

/**
 *              240. SEARCH 2D MATRIX II
 *
 *         Write an efficient algorithm that searches for a value target in an m x n integer matrix
 *         This matrix has the following properties:
 *
 *              * Integers in each row are sorted in ascending from L to R
 *              * Integers in each col are sorted in ascending from top to bottom.
 */


public class _240_search_in_2D_matrix_II {

    public static boolean searchInSingleMatrix(int[] res, int k){
        int l = 0, r = res.length - 1;
        while (l <= r){
            int mid = l + (r-l)/2;
            int value = res[mid];
            if (value == k) return true;
            else if (value < k){
                l = mid + 1;
            }
            else{
                r = mid - 1;
            }
        }
        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        boolean ans = false;
        for (int i = 0; i < matrix.length; i++){
            if (searchInSingleMatrix(matrix[i], target)){
                ans = true;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,4,7,11,15},{2,5,8,12,19}, {3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix, target));
    }
}
