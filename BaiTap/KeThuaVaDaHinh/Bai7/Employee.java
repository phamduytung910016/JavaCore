package BaiTap.KeThuaVaDaHinh.Bai7;

import java.util.Scanner;

public class Employee extends Person{
    private float heSoLuong;
    private int soNgayNghi;
    private int soNgayDiLam;
    private float luong1Ngay;

    public int getSoNgayDiLam() {
        return soNgayDiLam;
    }

    public void setSoNgayDiLam(int soNgayDiLam) {
        this.soNgayDiLam = soNgayDiLam;
    }

    public float getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getSoNgayNghi() {
        return soNgayNghi;
    }

    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }

    public float getLuong1Ngay() {
        return luong1Ngay;
    }

    public void setLuong1Ngay(float luong1Ngay) {
        this.luong1Ngay = luong1Ngay;
    }

    public float luong1Thang(){
        float luong = getHeSoLuong() * getLuong1Ngay() * getSoNgayDiLam();
        return luong;
    }


    @Override
    public DanhGia getDanhGia(){
        if(getSoNgayNghi() < 3){
            return DanhGia.GIOI;
        }else if(getSoNgayNghi() >= 3 && getSoNgayDiLam() <= 5){
            return DanhGia.KHA;
        }else if(getSoNgayNghi() > 5 && getSoNgayNghi() <= 8){
            return DanhGia.TRUNGBINH;
        }else {
            return DanhGia.YEU;
        }
    }

    public void nhap(){
        super.nhap();
        System.out.println("Mời nhập hệ số lương");
        setHeSoLuong(new Scanner(System.in).nextFloat());
        System.out.println("Mời nhập lương 1 ngày: ");
        setLuong1Ngay(new Scanner(System.in).nextFloat());
        System.out.println("Mời nhập số ngày đi làm: ");
        setSoNgayDiLam(new Scanner(System.in).nextInt());
        System.out.println("Mời nhập số ngày nghỉ: ");
        setSoNgayNghi(new Scanner(System.in).nextInt());
    }

    public void hien(){
        System.out.println("Employee");
        super.hien();
        System.out.print(", số ngày đi làm = " + getSoNgayDiLam() + ", số ngày nghỉ = " + getSoNgayNghi()
        + ", đánh giá = " + getDanhGia().toString());
        System.out.printf(", hệ số lương = %-2.3f" , getHeSoLuong());
        System.out.printf(", lương 1 ngày = %-10.2f", getLuong1Ngay());
        System.out.printf(", lương 1 tháng = %-20.2f" , luong1Thang());
        System.out.println("}");
    }


}
