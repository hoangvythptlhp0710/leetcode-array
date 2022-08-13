package src.Leetcode.Array;

public class _421_maximum_XOR_of_two_numbers_in_an_array {

    public static int findMaximumXOR(int[] nums){
        int result = 0;
        for (int i = 0; i < nums.length; i++){
            for (int j = nums.length - 1; j >= i; j--){
                result = nums[i] ^ nums[j];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3,10,5,25,2,8};
        System.out.println(findMaximumXOR(nums));
    }
}
