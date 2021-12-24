package BaiTap.KeThuaVaDaHinh.Bai3;

import BaiTap.KeThuaVaDaHinh.QuanLySanPham.QuanLySanPham;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public int luaChon(){
        System.out.println("---Quản lý danh sách giao dịch---");
        System.out.println("1.Thêm giao dịch vàng");
        System.out.println("2.Thêm giao dịch tiền tệ");
        System.out.println("3.Hiển thị các giao dịch vàng");
        System.out.println("4.Hiển thị các giao dịch tiền tệ");
        System.out.println("5.Tổng số lượng giao dịch vàng");
        System.out.println("6.Tổng số lượng giao dịch tiền tệ");
        System.out.println("7.Trung bình thành tiền của giao dịch tiền tệ");
        System.out.println("8.Các giao dịch có đơn giá lớn hơn 1 tỷ");
        System.out.println("9.Các giao dịch vàng trong tháng 9 năm 2013");
        System.out.println("10.Các giao dịch tiền tệ trong tháng 9 năm 2013");
        System.out.println("11.Thoát");
        System.out.println("Chọn yêu cầu: ");
        int chon = new Scanner(System.in).nextInt();
        return chon;
    }

    public void chay() throws Exception {
        DanhSachGiaoDich danhSachGiaoDich = new DanhSachGiaoDich();
        boolean tiepTuc = true;
        do{
            int chon = luaChon();
            switch (chon){
                case 1:{
                    danhSachGiaoDich.themGDV();
                    break;
                }
                case 2:{
                    danhSachGiaoDich.themGDTT();
                    break;
                }
                case 3:{
                    danhSachGiaoDich.hienGDV();
                    break;
                }
                case 4:{
                    danhSachGiaoDich.hienGDTT();
                    break;
                }
                case 5:{
                    System.out.println("Tổng số lượng giao dịch vàng: " + danhSachGiaoDich.tongSoLuongGDV());
                    break;
                }
                case 6:{
                    System.out.println("Tổng số lượng giao dịch tiền tệ " + danhSachGiaoDich.tongSoLuongGDTT());
                    break;
                }
                case 7:{
                    danhSachGiaoDich.trungBinhTienGDTT();
                    break;
                }
                case 8:{
                    danhSachGiaoDich.giaoDichCoDonGiaHon1Ty();
                    break;
                }
                case 9:{
                    danhSachGiaoDich.giaoDichTrong9Nam2013GDV();
                    break;
                }
                case 10:{
                    danhSachGiaoDich.getDanhSachGDTT();
                    break;
                }
                case 11:{
                    tiepTuc = false;
                    break;
                }
            }
        }while (tiepTuc);
        return;
    }

}
