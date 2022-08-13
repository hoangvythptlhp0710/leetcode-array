package src.Leetcode.Array;

public class _80_remove_Duplicate_from_sorted_array_II {

    public static int removeDuplicates(int[] nums){
        if (nums.length < 3) return nums.length;
        int index = 2;
        for (int i = 2; i < nums.length; i++){
            if (nums[i] != nums[index-2]){
                nums[index++] = nums[i];
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,3};
        System.out.println(removeDuplicates(arr));
    }
}
