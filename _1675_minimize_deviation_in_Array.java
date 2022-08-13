package src.Leetcode.Array;

import java.util.Arrays;
import java.util.Stack;
import java.util.TreeSet;

//Greedy algorithm
public class _1675_minimize_deviation_in_Array {

    public static int minimumDeviation(int[] arr){
        int n = arr.length;
        TreeSet<Integer> test = new TreeSet<>();
        for (int i = 0; i < n; i++){
            if (arr[i] % 2 == 0){
                test.add(arr[i]);
            }
            else{
               test.add(arr[i] * 2);
            }
        }
        int deviation = test.last() - test.first();

        while((test.last()) % 2 == 0){

            int max = test.last();
            test.remove(max);
            test.add(max/2);

            deviation = Math.min(deviation, test.last() - test.first());
        }
        return deviation;
    }


    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        System.out.println(minimumDeviation(nums));
    }
}
