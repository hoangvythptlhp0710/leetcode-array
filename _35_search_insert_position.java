package src.Leetcode.Array;

public class _35_search_insert_position {

    public static int searchInsert(int[] nums, int target) {
        int left = 0, mid, right = nums.length;
        while(left <= right && left < nums.length){
            mid = (left + right)/2;
            if (nums[mid] == target) return mid;
            else if (nums[mid] > target) right = mid - 1;
            else {
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        int target = 4;
        System.out.println(searchInsert(arr, target));
    }
}