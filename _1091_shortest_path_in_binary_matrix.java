package src.Leetcode.Array;

import java.util.*;

/*
Given an n x n binary matrix gric, return the length of the shortest clear path in the matrix.
if there is no clear path, return -1/

A clear path in a binary matrix is a path from top-left cell to the bottom-right cell such that:
    - All the visited cells of the path are 0.
    - All the adjacent cells of the path are 8-directionally connected (they are different and they share an edge or a corner).
The length of a clear path is the number of visited cells of this path.

 */
public class _1091_shortest_path_in_binary_matrix {

    public static int shortestPathBinaryMatrix(int[][] grid){
        int n = grid.length - 1;
        Queue<Integer> q = new ArrayDeque<>();
        q.add(0);
        if (grid[0][0] == 1 || grid[n][n] == 1) return -1;
        grid[0][0] = 1;
        while (q.size() > 0){
            int curr = q.remove(), i = curr & (1 << 7) - 1, j = curr >> 7;
            if (i == n && j == n) return grid[n][n];
            for (int a = Math.max(i - 1, 0); a <= Math.min(i + 1, n); a++) {
                for (int b = Math.max(j - 1, 0); b <= Math.min(j + 1, n); b++) {
                    if (grid[a][b] == 0) {
                        grid[a][b] = grid[i][j] + 1;
                        q.add(a + (b << 7));
                    }
                }
            }
        }
        return -1;
    }

}
