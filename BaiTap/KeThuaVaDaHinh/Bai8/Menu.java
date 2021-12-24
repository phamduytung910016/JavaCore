package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.ParseException;
import java.util.Scanner;

public class Menu {
    public int chon(){
        System.out.println("---Quản lý hàng hóa---");
        System.out.println("1.Thêm hàng hóa");
        System.out.println("2.Xuất danh các hàng hóa");
        System.out.println("3.Thoát");
        System.out.println("Chọn lựa: ");
        int n = new Scanner(System.in).nextInt();
        return n;
    }

    public int chonThemLoaiHangHoa(){
        System.out.println("1.Thêm hàng thực phẩm");
        System.out.println("2.Thêm hàng điện máy");
        System.out.println("3.Thêm hàng sành sứ");
        int n = new Scanner(System.in).nextInt();
        return n;
    }

    public void run() throws ParseException {
        System.out.println("Nhập giá trị cho mảng lưu trữ: ");
        int n = new Scanner(System.in).nextInt();
        DanhSachHangHoa danhSachHangHoa = new DanhSachHangHoa(n);
        boolean tiepTuc = true;
        do {
            int option = chon();
            switch (option){
                case 1:{
                    int khoiTaoSanPham = chonThemLoaiHangHoa();
                    danhSachHangHoa.them(danhSachHangHoa.khoiTao(khoiTaoSanPham));
                    break;
                }
                case 2:{
                    danhSachHangHoa.xuat();
                    break;
                }
                case 3:{
                    tiepTuc = false;
                    break;
                }
            }
        }while (tiepTuc);
    }
}
