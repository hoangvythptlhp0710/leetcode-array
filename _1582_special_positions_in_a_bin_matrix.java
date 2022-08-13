package src.Leetcode.Array;

public class _1582_special_positions_in_a_bin_matrix {

    public static boolean isSpecial(int[][] mat, int ki, int kj){
        for (int i = 0; i < mat.length; i++){
            if (mat[i][kj] == 1 && i != ki){
                return false;
            }
        }
        for (int j = 0; j < mat[0].length; j++){
            if (mat[ki][j] == 1 && j != kj){
                return false;
            }
        }
        return true;
    }

    public static int numSpecial(int[][] mat) {
        int count = 0;
        for (int i = 0; i < mat.length; i++){
            for (int j = 0; j < mat[0].length; j++){
                if (mat[i][j] == 1){
                    if (isSpecial(mat, i, j)){
                        count++;
                    }
                }
            }
        }
        return count;
    }

}
