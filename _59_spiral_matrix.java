package src.Leetcode.Array;

public class _59_spiral_matrix {

    public static int[][] generateMatrix(int n){
        int[][] res = new int[n][n];
        int left = 0, right = n - 1;
        int top = 0, down = n - 1;

        int counter = 1;
        while (left <= right && top <= down){
            for (int i = top; i <= down; i++){
                res[left][i] = counter++;
            }

            left++;

            for (int i = left; i <= right; i++){
                res[i][down] = counter++;
            }

            down--;

            if (left <= right){
                for (int i = down; i >= top; i--){
                    res[right][i] = counter++;
                }
            }

            right--;

            if (top <= down){
                for (int i = right; i >= left; i--){
                    res[i][top] = counter++;
                }
            }
            top++;
        }
        return res;
    }
}
