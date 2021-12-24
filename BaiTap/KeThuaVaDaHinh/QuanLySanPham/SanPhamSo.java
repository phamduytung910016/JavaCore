package BaiTap.KeThuaVaDaHinh.QuanLySanPham;

import java.util.Scanner;

public class SanPhamSo extends SanPham{


    public SanPhamSo() {
    }

    private float giaBan;
    private static final int HESO = 1000;
    private int dungLuong;

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    @Override
    public float getGiaBan() {
        return this.getDungLuong() * HESO;
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập dung lượng: ");
        setDungLuong(new Scanner(System.in).nextInt());
    }

    @Override
    public String toString() {
        return super.toString() +" - SanPhamSo{" +
                "giaBan=" + giaBan +
                ", dungLuong=" + dungLuong +
                '}';
    }
}
