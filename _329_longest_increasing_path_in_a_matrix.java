package src.Leetcode.Array;

/*
        329. LONGEST INCREASING PATH IN A MATRIX

  Given an m x n integer matrix, return the length of the longest increasing path
  in matrix.

  From each cell, you can either move in four direction: left, right, up, or down. YOu may not move diagonally or move
  outside the boundary.

 */
public class _329_longest_increasing_path_in_a_matrix {
    static int[][] matrix, helper;
    static int[][] directions = {{0,1},{1,0},{0,-1},{-1,0}};
    public static int longestIncreasingPath(int[][] matrix) {
        helper = new int[matrix.length][matrix[0].length];
        _329_longest_increasing_path_in_a_matrix.matrix = matrix;
        int path = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                path = Math.max(path, dfs(i, j));
            }
        }
        return path;
    }

    private static int dfs(int x, int y){
        if (helper[x][y] != 0)  return helper[x][y];
        for (int d = 0; d < directions.length; d++){
            int i = directions[d][0] + x, j = directions[d][1] + y;
            if (i >= 0 && i < matrix.length && j >= 0 && j < matrix[0].length && matrix[x][y] < matrix[i][j]){
                helper[x][y] = Math.max(helper[x][y], dfs(i,j));
            }
        }
        return ++helper[x][
                y];
    }

    public static void main(String[] args) {
        int[][] matrix = {{9,9,4},{6,6,8},{2,1,1}};
        System.out.println(longestIncreasingPath(matrix));
    }
}
