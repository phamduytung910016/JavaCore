package BaiTap.KeThuaVaDaHinh.Bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Sach {
    private String maSach;// Mã sách
    private Date ngayNhap; // Ngày nhập
    private float donGia;// Đơn giá
    private int soLuong;// số lượng
    private String nhaXuatBan; // Nhà xuất bản



    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public Date getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(Date ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(long donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public abstract float thanhTien();
    public  void hienThi(){
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String ngayNhap = df.format(this.getNgayNhap());
        System.out.print("{mã sách = " + this.getMaSach() + ", ngày nhập = " + ngayNhap +
                ", nhà xuất bản = " + this.getNhaXuatBan() + ", số lượng = " + this.getSoLuong());
    };
}
