package BaiTap.LopVaDoiTuong.Bai7;

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
    public void nhap(SinhVien[] danhSach){
        int i = 1;
        for (SinhVien s: danhSach
        ) {
            System.out.println("Nhập thông tin sinh viên thứ " + i);
            System.out.println("Nhập mã số sinh viên: ");
            int msv = sc.nextInt();
            s.setMsv(msv);

            String hoTen;
            System.out.println("Nhập họ và tên: ");
            hoTen = sc.nextLine();
            s.setHoTen(hoTen);
            sc.nextLine();

            System.out.println("Nhập địa chỉ: ");
            String diaChi = sc.nextLine();
            s.setDiaChi(diaChi);

            System.out.println("Nhập số điện thoại (7 chữ số): ");
            String soDienThoai = sc.nextLine();
            s.setSoDienThoai(soDienThoai);
            i++;
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Nhập số lượng sinh viên: ");
        int n = sc.nextInt();
        QuanLySinhVien quanLySinhVien = new QuanLySinhVien(n);

        quanLySinhVien.nhap();
        quanLySinhVien.xuat();
    }
}
