package Leetcode.Array;

import java.util.*;

public class _350_intersection_of_two_arrays_ii {

    //Idea: Iterate the longer array to count the appearance of the number, then we check in the remaining array
    public static String intersect(int[] a1, int[] a2){
        // From the example, we see that the length of a1 > a2 => if length a2 > a1, we only need return the function intersect(a2,a1) instead of computing again (avoid iterate many steps in one function)
        if (a1.length > a2.length) return intersect(a2, a1);
        // create an array of size 1001 (:))) depend on the constraint)
        int[] list = new int[1_001];
        for (int i: a2){
            //first, iterate all over a2 array and increase list[i] by 1
            list[i]++;
        }
        //declare a variable j
        int j = 0;
        for (int i = 0; i < a1.length; i++){
            if (list[a1[i]]-- > 0){
                //Try to find the number that appear in both 2 array by increase j (j always < a1.length)
                a1[j++] = a1[i];
            }
        }
        // If j equals a1.length, it means all elements in a1 appear in a2 => return a1 immediately
        if (j == a1.length) return Arrays.toString(a1);
        // else, we create an result array of size j (the number of appearance of 2 elements in 2 array)
        int[] res = new int[j];
        for (int i = 0; i < j; i++){
            res[i] = a1[i];
        }
        return Arrays.toString(res);
    }

    public static String optimize(int[] a1, int[] a2){
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(a1);Arrays.sort(a2);
        int i = 0, j = 0;
        while (i < a1.length && j < a2.length){
            if (a1[i] == a2[j]){
                arrayList.add(a1[i]);
                i++;
                j++;
            }
            else if (a1[i] < a2[j]){
                i++;
            }
            else{
                j++;
            }
        }
        return Arrays.toString(arrayList.toArray());
    }

    public static void main(String[] args) {
        int[] a1 = {4,9,5,4,9,5};
        int[] a2 = {9,4,9,8,4};
        System.out.println(intersect(a1, a2));
        System.out.println(optimize(a1, a2));
    }
}
