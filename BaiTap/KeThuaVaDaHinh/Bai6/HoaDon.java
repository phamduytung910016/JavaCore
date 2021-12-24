package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class HoaDon implements IHoaDon {
    private String maHoaDon;
    private Date ngayLapHoaDon;
    private String tenKhachHang;
    private String maPhong;
    private float donGia;

    @Override
    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public Date getNgayLapHoaDon() {
        return ngayLapHoaDon;
    }

    public void setNgayLapHoaDon(Date ngayLapHoaDon) {
        this.ngayLapHoaDon = ngayLapHoaDon;
    }

    @Override
    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    @Override
    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
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
        System.out.println("Mời nhập mã hóa đơn: ");
        setMaHoaDon(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày lập hóa đơn: ");
        String ngayLHD = new Scanner(System.in).nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(ngayLHD);
        setNgayLapHoaDon(date1);
        System.out.println("Nhập tên khách hàng: ");
        setTenKhachHang(new Scanner(System.in).nextLine());
        System.out.println("Nhập mã phòng: ");
        setMaPhong(new Scanner(System.in).nextLine());
        System.out.println("Nhập đơn giá: ");
        setDonGia(new Scanner(System.in).nextFloat());
    }

    @Override
    public void hien() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String ngayLHD = formatter.format(this.getNgayLapHoaDon());
        System.out.print("{Mã hóa đơn = " + getMaHoaDon() + ", ngày lập hóa đơn = " + ngayLHD + ", tên khách hàng = "
        + getTenKhachHang() + ", mã phòng = " + getMaPhong());
        System.out.printf(", đơn giá = %-10.2f", getDonGia());
    }
}
