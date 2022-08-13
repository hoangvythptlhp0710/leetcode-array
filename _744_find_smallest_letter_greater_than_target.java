package src.Leetcode.Array;

/*
Given a characters array letters that is sorted in non-decreasing order and a character target, return the smallest character in the array that is larger than target.

Note that the letters wrap around.

For example, if target == 'z' and letters == ['a', 'b'], the answer is 'a'.
 */
public class _744_find_smallest_letter_greater_than_target {

    public static char nextGreatestLetter(char[] arr, char target){
        int l = 0, r = arr.length - 1;
        char res = 0;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (arr[mid] > target) res = arr[mid];
            else if (arr[mid] <= target){
                l++;
            }
            r--;
        }
        return res;
    }

}
