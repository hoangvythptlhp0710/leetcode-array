package src.Leetcode.Array;

import java.util.Arrays;

public class _1288_remove_covered_interval {

    public static int removeCoveredIntervals(int[][] intervals){
        int count = intervals.length;
        Arrays.sort(intervals, (a,b) -> (a[0] != b[0] ? a[0] - b[0] : b[1] - a[1]));
        int i = 0;
        int cnt = 0;
        for (int j = 1; j < count; j++){
            if ((intervals[i][0] <= intervals[j][0]) && (intervals[j][i] <= intervals[i][i])){
                cnt++;
            }
            else{
                i = j;
            }
        }
        return count - cnt;
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,4},{3,6},{2,8}};
        System.out.println(removeCoveredIntervals(intervals));
    }
}
