package src.Leetcode.Array;

public class _704_binary_search {
    public static int binarySearch(int[] a, int target){

        int n = a.length;
        int iLeft = 0;
        int iRight = n-1;
        while (iLeft <= iRight){

            int iMid = (iLeft+iRight)/2;

            //nếu Giá trị ở giữa mảng bằng target thì trả về luôn target
            if (target == a[iMid]){
                return iMid;
            }

            // Nếu giá trị ở giữa > target => xét mảng bên trái
            else if (a[iMid] > target){
                iRight = iMid - 1;
            }

            // Nếu giá trị ở giữa < target => xét mảng bên phải
            else if (a[iMid] < target){
                iLeft = iMid + 1;

            }
        }
        return -1;
    }
    public int search(int[] a, int key) {
        int n = a.length;
        return bSearch(a,key,0,n-1);
    }
    public static int bSearch(int[]a, int key, int iLeft, int iRight){
        if (iLeft > iRight){
            return -1;
        }
        int iMid = (iLeft + iRight) / 2;
        if (key == a[iMid]){
            return iMid;
        }
        else if (key > a[iMid]){
            return bSearch(a,key,iMid+1, iRight);
        }
        else{
            return bSearch(a,key, iLeft, iMid-1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,4,9,12,19,25,31,46,50,57,72};
        System.out.println(binarySearch(arr,19));

    }
}
