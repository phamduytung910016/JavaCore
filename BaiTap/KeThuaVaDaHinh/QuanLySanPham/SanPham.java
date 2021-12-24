package BaiTap.KeThuaVaDaHinh.QuanLySanPham;

import java.util.Scanner;

public abstract class SanPham implements ISanPham {
    private int ma;
    private String ten;



    @Override
    public void nhap(){
        System.out.println("Mời nhập mã sản phẩm: ");
        setMa(new Scanner(System.in).nextInt());
        System.out.println("Mời nhập tên sản phẩm");
        setTen(new Scanner(System.in).nextLine());
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "ma=" + ma +
                ", ten='" + ten + '\'' +
                '}';
    }

    public void hien(){
        //this chính là Object hiện tại
        System.out.println(this);
    }
}
