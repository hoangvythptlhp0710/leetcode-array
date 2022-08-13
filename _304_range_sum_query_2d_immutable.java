package src.Leetcode.Array;

public class _304_range_sum_query_2d_immutable {

    private static int[][] data;

    public _304_range_sum_query_2d_immutable(int[][] matrix){
        data = matrix;
    }

    public static int sumRegion(int row1, int col1, int row2, int col2){
        int sum = 0;
        for (int i = row1; i < row2; i++){
            for (int j = col1; j < col2; j++){
                sum += data[i][j];
            }
        }
        return sum;
    }

}
