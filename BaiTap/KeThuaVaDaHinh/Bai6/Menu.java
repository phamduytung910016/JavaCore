package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public int menu(){
        System.out.println("------Quản lý hóa đơn------");
        System.out.println("1.Nhập hóa đơn theo giờ thuê");
        System.out.println("2.Nhập hóa đơn theo ngày thuê");
        System.out.println("3.Xuất danh sách hóa đơn theo giờ thuê");
        System.out.println("4.Xuất danh sách hóa đơn theo ngày thuê");
        System.out.println("5.Tổng số hóa đơn thuê theo giờ");
        System.out.println("6.Tổng số hóa đơn thuê theo ngày");
        System.out.println("7.Trung bình tiền của hóa đơn trong tháng 9/2013");
        System.out.println("8.Thoát");
        int choice = new Scanner(System.in).nextInt();
        return choice;
    }

    public void run() throws ParseException {
       DanhSachHoaDon danhSachHoaDon = new DanhSachHoaDon();
        boolean tiepTuc = true;
        do{
            int n = menu();
            switch (n){
                case 1:{
                    danhSachHoaDon.lapHDTG();
                    break;
                }
                case 2:{
                    danhSachHoaDon.lapHDTN();
                    break;
                }
                case 3:{
                    danhSachHoaDon.xuatHDTG();
                    break;
                }
                case 4:{
                    danhSachHoaDon.xuatHDTN();
                    break;
                }
                case 5:{
                    danhSachHoaDon.soLuongHDTG();
                    break;
                }
                case 6:{
                    danhSachHoaDon.soLuongHDTN();
                    break;
                }
                case 7:{
                    danhSachHoaDon.trungBinhThang9_2013();
                    break;
                }
                case 8:{
                    tiepTuc = false;
                    break;
                }
            }
        }while (tiepTuc);
    }
}
