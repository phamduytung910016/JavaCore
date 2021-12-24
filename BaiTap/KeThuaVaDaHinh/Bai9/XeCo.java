package BaiTap.KeThuaVaDaHinh.Bai9;

import java.util.Scanner;

public abstract class XeCo implements IXeCo {
    private String tenXe;
    private String tenChuXe;
    private String nhaSanXuat;
    private float giaXe;

    @Override
    public String getTenXe() {
        return tenXe;
    }

    public void setTenXe(String tenXe) {
        this.tenXe = tenXe;
    }

    @Override
    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    @Override
    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public float getGiaXe() {
        return giaXe;
    }

    public void setGiaXe(float giaXe) {
        this.giaXe = giaXe;
    }

    public void nhap() {
        System.out.println("Tên xe: ");
        setTenXe(new Scanner(System.in).nextLine());
        System.out.println("Nhà sản xuất: ");
        setNhaSanXuat(new Scanner(System.in).nextLine());
        System.out.println("Giá thành: ");
        setGiaXe(new Scanner(System.in).nextFloat());
        System.out.println("Tên chủ xe: ");
        setTenChuXe(new Scanner(System.in).nextLine());
    }

    public void hien() {
        System.out.print("{Tên xe = " + getTenXe() + ", nhà sản xuất = " +
                getNhaSanXuat() + ", tên chủ xe = " + getTenChuXe());
        System.out.printf(", giá thành = %-20.2f", getGiaXe());
    }

    public abstract float thue();
    public abstract float thueVAT();
    public abstract float thueTruocBa();
}
