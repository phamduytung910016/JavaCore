package BaiTap.KeThuaVaDaHinh.Bai2;

import java.text.ParseException;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void menu() {
        System.out.println("1.Nhập danh sách các loại sách");
        System.out.println("2.Xuất danh sách các sách giáo khoa");
        System.out.println("3.Xuất danh sách các sách tham khảo");
        System.out.println("4.Tính tổng thành tiền các sách giáo khoa");
        System.out.println("5.Tính tổng thành tiền các sách tham khảo");
        System.out.println("6.Tính trung bình cộng đơn giá của các sách tham khảo");
        System.out.println("7.Hiển thị các sách giáo khoa theo nhà xuất bản");
        System.out.println("8.Thoát");
    }

    public static void main(String[] args) throws ParseException {
        boolean tiepTuc = true;
        QuanLySach quanLySach = new QuanLySach();
        do {
            System.out.println("Mời chọn chức năng");
            menu();
            System.out.println("Chức năng chọn: ");
            int n = scanner.nextInt();
            scanner.nextLine();

            switch (n) {
                case 1: {
                    System.out.println("Nhập sgk nếu muốn thêm sách giáo khoa");
                    System.out.println("Nhập stk nếu muốn thêm sách tham khảo");
                    scanner = new Scanner(System.in);
                    String choice = scanner.next();

                    if (choice.equals("sgk")) {
                        quanLySach.nhapSGK();
                    } else if (choice.equals("stk")) {
                        quanLySach.nhapSTK();
                    }
                    break;
                }

                case 2: {
                    quanLySach.xuatSGK();
                    break;
                }

                case 3: {
                    quanLySach.xuatSTK();
                    break;
                }

                case 4: {
                    quanLySach.tongThanhTienSGK();
                    break;
                }
                case 5: {
                    quanLySach.tongThanhTienSTK();
                    break;
                }
                case 6:{
                    quanLySach.tbcDGSTK();
                    break;
                }
                case 7:{
                    System.out.println("Nhập tên nhà xuất bản: ");
                    scanner = new Scanner(System.in);
                    String nxb = scanner.nextLine();
                    quanLySach.xuatSGKTheoNXB(nxb);
                    break;
                }
                case 8: {
                    tiepTuc = false;
                    break;
                }
            }
        } while (tiepTuc);


    }
}
