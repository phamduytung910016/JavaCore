package BaiTap.KeThuaVaDaHinh.QuanLySanPham;

import java.util.Scanner;

public class Menu {
    public int hienMenu() {
        System.out.println("1. Nhập");
        System.out.println("2. Hiện");
        System.out.println("3. Tìm giá lớn nhất");
        System.out.println("4. Thoát");
        int chon = new Scanner(System.in).nextInt();

        return chon;
    }

    public int hienChonLoaiSanPham() {
        System.out.println("1. Sản phẩm số");
        System.out.println("2. Sản phẩm nông nghiệp");
        int chon = new Scanner(System.in).nextInt();
        if (chon > 2 || chon < 1) {
            System.out.println("Chỉ được chọn 1 hoặc 2");
            System.out.println("Mời chọn lại");
            return hienChonLoaiSanPham();
        }
        return chon;
    }

    public ISanPham[] taoDanhSach() {
        ISanPham[] danhSach = null;
        int soPhanTu;
        System.out.println("Mời bạn nhập vào số phần tử: ");
        soPhanTu = new Scanner(System.in).nextInt();
        if (soPhanTu < 0) {
            System.out.println("Số phần tử không hợp lệ");
            return taoDanhSach();
        }
        return danhSach = new ISanPham[soPhanTu];
    }

    public void chay() {
        ISanPham[] danhSach = null;
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        while (true) {
            int chon = hienMenu();
            switch (chon) {
                case 1: {
                    danhSach = taoDanhSach();
                    for (int i = 0; i < danhSach.length; i++) {
                        danhSach[i] = quanLySanPham.taoSanPham(hienChonLoaiSanPham());
                    }
                    quanLySanPham.nhapThongTinSanPham(danhSach);
                    break;
                }
                case 2: {
                    quanLySanPham.hienThongTinSanPham(danhSach);
                    break;
                }
                case 3:{
                    ISanPham priceMax = quanLySanPham.timGiaLonNhat(danhSach);
                    System.out.println("Sản phẩm giá lớn nhất: \n" + priceMax );
                    break ;
                }
               case 4:{
                   break;

                }
            }
        }
    }
}
