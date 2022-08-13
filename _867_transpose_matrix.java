package src.Leetcode.Array;

/*
            867. TRANSPOSE MATRIX

     Given a 2D integer array matrix, retrun the transpose of matrix.
     The transpose of a matrix is the matrix flipped over its min diagonal, switching the matrix's
     row and column indices.

 */

import java.util.*;

public class _867_transpose_matrix {

    public static String transpose(int[][] matrix){
        int c = matrix.length, r = matrix[0].length;
        int[][] cloneMatrix = new int[r][c];
        for (int i = 0; i < r; i++){
            for (int j = 0; j < c; j++){
                cloneMatrix[i][j] = matrix[j][i];
            }
        }
        String s = Arrays.deepToString(cloneMatrix);
        return s;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println(transpose(matrix));
    }
}
