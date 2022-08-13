package src.Leetcode.Array;
/*
According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."

The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):

Any live cell with fewer than two live neighbors dies as if caused by under-population.
Any live cell with two or three live neighbors lives on to the next generation.
Any live cell with more than three live neighbors dies, as if by over-population.
Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.
The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 */
public class _289_game_of_life {

    public static void gameOfLife(int[][] board){
        int m = board.length;
        int n = board[0].length;
        int[][] temp = new int[m][n];
        int[][] dirs = new int[][]{{-1,0},{-1,1},{0,1},{1,1},{1,0},{1,-1},{0,-1},{-1,-1}};

        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                int liveCount = 0;
                for (int[] dir: dirs){
                    int x = dir[0] + i;
                    int y = dir[1] + j;
                    if (x >= 0 && x < m && y >= 0 && y < n && board[x][y] == 1){
                        liveCount++;
                    }
                }
                if (board[i][j] == 0 && liveCount == 3){
                    temp[i][j] = 1;
                }
                else if (board[i][j] == 1){
                    if (liveCount == 2 || liveCount == 3){
                        temp[i][j] = 1;
                    }
                }
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                board[i][j] = temp[i][j];
            }
        }
    }

    public static void main(String[] args) {

    }
}
