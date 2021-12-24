package BaiTap.KeThuaVaDaHinh.Bai7;

import java.util.Scanner;

public class Menu {
    public int menu() {
        System.out.println("-------Quản lý người dùng-------");
        System.out.println("1.Thêm 1 người vào danh sách");
        System.out.println("2.Xuất danh sách");
        System.out.println("3.Xóa 1 người trong danh sách");
        System.out.println("4.Sắp xếp danh sách theo thứ tự họ tên");
        System.out.println("5.Thoát");
        System.out.println("Chọn chức năng: ");
        int n = new Scanner(System.in).nextInt();
        return n;
    }

    public double them1Nguoi() {
        System.out.println("1.1 Thêm Student");
        System.out.println("1.2 Thêm Employee");
        System.out.println("1.3 Them Customer");
        System.out.println("Lựa chọn thêm người dùng: ");
        double n = new Scanner(System.in).nextDouble();
        return n;
    }

    public void run() {
        System.out.println("Mời nhập dung lượng ban đầu: ");
        int n = new Scanner(System.in).nextInt();
        QuanLy quanLy = new QuanLy(n);
        boolean tiepTuc = true;
        do{
            int choice = menu();
            switch (choice){
                case 1:{
                    double add = them1Nguoi();
                    if(add == 1.1){
                        quanLy.themStudent();
                        break;
                    }else if(add == 1.2){
                        quanLy.themEmployee();
                        break;
                    }else {
                        quanLy.themCustomer();
                        break;
                    }
                }
                case 2:{
                    quanLy.xuat();
                    break;
                }
                case 3:{
                    System.out.println("Mời nhập tên người dung cần xóa: ");
                    String hoTen = new Scanner(System.in).nextLine();
                    quanLy.xoaTheoTen(hoTen);
                    break;
                }
                case 4:{
                    quanLy.sapXeptheoHoTen();
                    break;
                }
                case 5:{
                    tiepTuc = false;
                    break;
                }

            }
        }while (tiepTuc);
    }
}
