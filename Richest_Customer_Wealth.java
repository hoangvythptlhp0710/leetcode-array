package src.Leetcode.Array;

public class Richest_Customer_Wealth {
    public static int maximumWealth(int[][] a) {

        int soKhachHang = a.length;
        int taiKhoan = a[0].length;
        int[] tongTaiSan = new int[soKhachHang];

        for (int i = 0; i < soKhachHang; i++) {
            int tongSoTienTrenMotHang = 0;
            for (int j = 0; j < taiKhoan; j++) {
                tongSoTienTrenMotHang += a[i][j];
            }
            tongTaiSan[i] = tongSoTienTrenMotHang;
        }
        for (int i = 0; i < soKhachHang; i++) {
            System.out.println("Tong tai san khach hang " + i + ": " + tongTaiSan[i]);
        }
        int max = 0;
        for (int i = 0; i < soKhachHang; i++) {
            if (tongTaiSan[i] > max) {
                max = tongTaiSan[i];

            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] a = { { 2, 3, 4 }, { 4, 2, 4 } };
        System.out.println(maximumWealth(a));
    }

}
