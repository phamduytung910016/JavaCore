package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.ParseException;
import java.util.Scanner;

public abstract class HangHoa implements IHangHoa {
    private String maHang;
    private String tenHang;
    private int soLuong;
    private float donGia;

    @Override
    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    @Override
    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    @Override
    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    @Override
    public void nhap() throws ParseException {
        System.out.println("Nhập mã hàng: ");
        setMaHang(new Scanner(System.in).nextLine());
        if (getMaHang() == "") {
            setMaHang(null);
        }
        System.out.println("Nhập tên hàng: ");
        setTenHang(new Scanner(System.in).nextLine());
        if (getTenHang() == "") {
            setTenHang(null);
        }
        System.out.println("Nhập số lượng: ");
        do {
            Scanner sc = new Scanner(System.in);
            int soLuong = sc.nextInt();
            setSoLuong(soLuong);
            if (soLuong < 0) {
                System.out.println("Số lượng không hợp lệ, mời bạn nhập lại");
            }
        }
        while (getSoLuong() < 0);

        System.out.println("Nhập đơn giá: ");
        do {
            Scanner sc = new Scanner(System.in);
            float donGia = sc.nextFloat();
            setDonGia(donGia);
            if (donGia < 0) {
                System.out.println("Đơn giá không hợp lệ, mời bạn nhập lại");
            }
        }
        while (getDonGia() < 0);
    }


    @Override
    public void hien() {
        System.out.print("{Tên hàng = " + getTenHang() +
                ", mã hàng = " + getMaHang() + ", số lượng = " +getSoLuong());
        System.out.printf(", đơn giá = %-20.2f" , getDonGia());
    }

    public abstract DanhGia danhGia();

}
