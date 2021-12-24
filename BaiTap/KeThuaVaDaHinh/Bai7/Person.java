package BaiTap.KeThuaVaDaHinh.Bai7;

import java.util.Scanner;

public abstract class Person implements IPerson  {
    private String hoTen;
    private String diaChi;
    private DanhGia danhGia;

    public abstract DanhGia getDanhGia();

    @Override
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap(){
        System.out.println("Mời nhập họ và tên: ");
        setHoTen(new Scanner(System.in).nextLine());
        System.out.println("Mời nhập địa chỉ: ");
        setDiaChi(new Scanner(System.in).nextLine());
    }

    public void hien(){
        System.out.print("{Họ và tên = " + getHoTen() + ", địa chỉ = " + getDiaChi());
    }

}
