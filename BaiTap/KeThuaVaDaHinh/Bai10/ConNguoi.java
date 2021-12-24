package BaiTap.KeThuaVaDaHinh.Bai10;

import java.util.Scanner;

public class ConNguoi implements IConNguoi{
    private String ten;
    private String diaChi;


    @Override
    public String getTen() {
        return ten;
    }

    @Override
    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String getDiaChi() {
        return diaChi;
    }

    @Override
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public void nhap(){
        System.out.println("Nhập tên: ");
        setTen(new Scanner(System.in).nextLine());
        System.out.println("Nhập địa chỉ: ");
        setDiaChi(new Scanner(System.in).nextLine());
    }

    @Override
    public void hien() {
        System.out.print("{Tên = " +getTen() + ", địa chỉ = " +getDiaChi());
    }
}
