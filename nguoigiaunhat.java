package src.Leetcode.Array;

public class nguoigiaunhat {
    public static int maximumWealth(int[][] a) {

        int rows = a.length;
        int column = a[0].length;
        int max = 0;
        int[] tongtaisan = new int[rows];
        for (int i = 0; i < a.length; i++) {
            int tongSoTienTrenMotHang = 0;
            for (int j = 0; j < a[0].length; j++) {
                tongSoTienTrenMotHang += a[i][j];

            }
            System.out.println("tong tai san kh " + tongSoTienTrenMotHang);
            if (tongSoTienTrenMotHang > max) {
                max = tongSoTienTrenMotHang;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = { { 32, 4, 123 }, { 24, 123, 55 } };
        // int[][] b = new int[2][3];
        System.out.println(maximumWealth(a));
    }
}
