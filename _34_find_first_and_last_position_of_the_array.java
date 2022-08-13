package Leetcode.Array;

public class _34_find_first_and_last_position_of_the_array {

    public static int[] searchRange(int[] nums, int target){
        int firstOccurence = findBound(nums,target, true);
        if (firstOccurence == -1){
            return new int[] {-1, -1};
        }
        int lastOccurrence = findBound(nums,target, false);
        return new int[]{firstOccurence, lastOccurrence};
    }

    private static int findBound(int[] nums, int tar, boolean isFirst){
        int len = nums.length;
        int l = 0, r = len - 1;
        while (l <= r){
            int mid = l + (r-l)/2;
            if (nums[mid] == tar){
                if (isFirst){
                    if (mid == l || nums[mid-1] != tar){
                        return mid;
                    }
                    r = mid - 1;
                }
                else{
                    if (mid == r || nums[mid+1] != tar){
                        return mid;
                    }
                    l = mid + 1;
                }
            }
            else if (nums[mid] < tar){
                l = mid + 1;
            }
            else {
                r = mid - 1;
            }
        }
        return -1;
    }
}
