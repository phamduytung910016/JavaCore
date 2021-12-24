package BaiTap.KeThuaVaDaHinh.Bai7;

import java.util.Scanner;

public class Customer extends Person {
    private String tenCongTy;
    private float triGiaHoaDon;

    public String getTenCongTy() {
        return tenCongTy;
    }

    public void setTenCongTy(String tenCongTy) {
        this.tenCongTy = tenCongTy;
    }

    public float getTriGiaHoaDon() {
        return triGiaHoaDon;
    }

    public void setTriGiaHoaDon(float triGiaHoaDon) {
        this.triGiaHoaDon = triGiaHoaDon;
    }

    @Override
    public DanhGia getDanhGia() {
        if(getTriGiaHoaDon() > 10000000){
            return DanhGia.KIMCUONG;
        }else if(getTriGiaHoaDon() <= 10000000 && getTriGiaHoaDon() > 5000000){
            return DanhGia.VANG;
        }else {
            return DanhGia.BAC;
        }
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập tên công ty: ");
        setTenCongTy(new Scanner(System.in).nextLine());
        System.out.println("Nhập giá hóa đơn: ");
        setTriGiaHoaDon(new Scanner(System.in).nextFloat());
    }

    @Override
    public void hien() {
        System.out.print("Customer");
        super.hien();
        System.out.print(", tên công ty = " + getTenCongTy());
        System.out.printf(", trị giá hóa đơn = %-20.2f", getTriGiaHoaDon());
        System.out.println(", đánh giá = " + getDanhGia() + "}");
    }
}
