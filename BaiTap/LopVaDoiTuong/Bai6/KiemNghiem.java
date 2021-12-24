package BaiTap.LopVaDoiTuong.Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class KiemNghiem {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws ParseException {
        HangThucPham hangThucPham = null;
        String maHang;
        do {
            System.out.println("Nhập mã hàng (Mã hàng không được để trống): ");
            maHang = sc.nextLine();
            if (maHang == "") {
                System.out.println("Mã hàng không được để trống, mời bạn nhập lại");
            }
        } while (maHang == "");
        hangThucPham = new HangThucPham(maHang);
        System.out.println("Nhập tên hàng : ");
        String tenHang = sc.nextLine();
        if (tenHang == "") {
            tenHang = null;
        }
        double donGia;
        do {
            hangThucPham.setTenHang(tenHang);
            System.out.println("Nhập đơn giá (đơn giá > 0): ");
            donGia = sc.nextDouble();
            if (donGia <= 0) {
                System.out.println("Đơn giá không hợp lệ , mời bạn nhập lại");
            }
        } while (donGia <= 0);
        hangThucPham.setDonGia(donGia);
        System.out.println("Nhập ngày sản xuất(dd/MM/yyyy) : ");
        String ngaySanXuat = sc.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(ngaySanXuat);
        hangThucPham.setNgaySanXuat(date1);
//
        System.out.println("Nhập ngày hết hạn(dd/MM/yyyy): ");
        String ngayHetHan = sc.next();
        Date date2 = dateFormat.parse(ngaySanXuat);
        hangThucPham.setNgayHetHan(date2);

        System.out.println(hangThucPham);

        Date now = dateFormat.parse("12/12/2021");
        hangThucPham.kiemTrahan(now);

    }
}
