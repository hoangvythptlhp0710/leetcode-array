package src.Leetcode.Array;

public class _74_search_a_2d_matrix {

    public static boolean findtar(int[] matrix, int target){
        boolean found = false;
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i] == target) found = true;
        }
        return found;
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        boolean right = false;
        for (int i = 0; i < matrix.length; i++){
            if (findtar(matrix[i], target)){
                right = true;
            }
        }
        return right;
    }

}
