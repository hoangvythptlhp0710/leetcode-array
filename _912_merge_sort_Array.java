package src.Leetcode.Array;

import java.util.Arrays;

public class _912_merge_sort_Array {

    public static int[] mergeSort(int[] result, int L, int R){

        if (L > R){
            return new int[0];
        }
        if (L == R){
            int[] singleElement = {result[L]};
            return singleElement;
        }
        //chia ra
        int k = (L+R)/2;
        int[] a1 = mergeSort(result,L,k);
        int[] a2 = mergeSort(result,k+1, R);

        //trộn vào 2 mangr a1, a2
        int i = 0, i1 = 0, i2 = 0;
        int [] mergeArray = new int[a1.length + a2.length];
        while (i < (a1.length + a2.length)){
            if (i1 < a1.length && i2 < a2.length){
                if (a1[i1] <= a2[i2]){
                    mergeArray[i] = a1[i1];
                    i++;i1++;
                }
                else {
                    mergeArray[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
            else{
                if(i1 < a1.length){
                    mergeArray[i] = a1[i1];
                    i++;
                    i1++;
                }
                else{
                    mergeArray[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }


    return mergeArray;

    }

    public static int[] sortArray(int[] nums){

        return mergeSort(nums,0,nums.length-1);


    }

    public static void main(String[] args) {
        int [] mangTest = {1,23,4,123,53,745,233};
        System.out.println(Arrays.toString(sortArray(mangTest)));
    }
}
