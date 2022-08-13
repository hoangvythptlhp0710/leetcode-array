package src.Leetcode.Array;

public class _33_search_in_sorted_array {
    public static int search(int[] nums, int target) {
        int len = nums.length;
        if (len == 0) return -1;
        if (len == 1) return nums[0] == target ? 0 : -1;
        int l = 0, r = nums.length-1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == target) return mid;
            else if (nums[0] <= nums[mid]){
                if (nums[0] <= target && target < nums[mid]){
                    r = mid - 1;
                }
                else{
                    l = mid + 1;
                }
            }
            else{
                if (nums[mid] < target && target <= nums[len-1]){
                    l = mid + 1;
                }
                else{
                    r = mid - 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {5,6,7,8,0,1,2,3};
        int target = 8;
        System.out.println(search(nums,target));
    }
}
