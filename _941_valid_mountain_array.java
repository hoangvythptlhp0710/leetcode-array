package src.Leetcode.Array;

public class _941_valid_mountain_array {

    public static boolean incSeq(int [] arr){
        int a = arr.length;
        int l = 0;
        int r = arr.length - 1;
        if (a < 3) return false;
        while (l + 1 < a - 1 && arr[l] < arr[l+1]) l++;
        while (r - 1 > 0 && arr[r] < arr[r-1]) r--;
        return l == r;
    }

    public static void main(String[] args) {
        int[] arr = {2,0,2};
        System.out.println(incSeq(arr));
    }
}

