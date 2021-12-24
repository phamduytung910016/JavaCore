package BaiTap.LopVaDoiTuong.Bai8;

import java.util.*;

public class Main {

    public static void menu() {
        System.out.println("Chọn yêu cầu");
        System.out.println("1.Thêm một 1 CD");
        System.out.println("2.Tính số lượng CD có trong danh sách");
        System.out.println("3.Tính tổng giá thành của các CD");
        System.out.println("4.Sắp xếp theo danh sách giảm dần theo giá thành");
        System.out.println("5.Sắp xếp theo danh sách tăng dần theo tựa CD");
        System.out.println("6.Hiển thị toàn bọ danh sách");
        System.out.println("7.Thoát");
        System.out.println("Nhập yêu cầu: ");
    }

    static Scanner sc = new Scanner(System.in);

        public static void main(String[] args) {
        System.out.println("Nhập số lượng cho danh sách lưu trữ: ");
        int n = sc.nextInt();
        QuanLyCD quanLyCD = new QuanLyCD(n);
        boolean tiepTuc = true;
        do {
            menu();
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1: {
                    CD cd = new CD();
                    System.out.println("Nhập thông tin cho đĩa CD ");
                    System.out.println("Nhập mã CD: ");
                    cd.setMaCD(sc.nextInt());
                    sc.nextLine();

                    System.out.println("Nhập tựa CD: ");
                    cd.setTuaCD(sc.nextLine());

                    System.out.println("Nhập ca sỹ: ");
                    cd.setCaSi(sc.nextLine());

                    System.out.println("Nhập số bài hát: ");
                    cd.setSoBaiHat(sc.nextInt());

                    System.out.println("Nhập giá thành: ");
                    cd.setGiaThanh(sc.nextFloat());

                    quanLyCD.them(cd);
                    break;
                }

                case 2: {
                    System.out.println("Số lượng CD có trong danh sách: " + quanLyCD.getIndex());
                    break;
                }

                case 3: {
                    quanLyCD.tongGiaThanh();
                    break;
                }

                case 4: {
                    quanLyCD.sapXepTheoGiaGiamDan();
                    quanLyCD.xuat();
                    break;
                }

                case 5: {
                    quanLyCD.sapXepTheoTuaCD();
                    quanLyCD.xuat();
                    break;
                }

                case 6: {
                    quanLyCD.xuat();
                    break;
                }
                case 7: {
                    tiepTuc = false;
                    break;
                }
            }
        } while (tiepTuc);
    }
}
