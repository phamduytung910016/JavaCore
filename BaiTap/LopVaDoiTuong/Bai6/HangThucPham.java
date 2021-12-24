package BaiTap.LopVaDoiTuong.Bai6;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HangThucPham {
    private String maHang;//Mã hàng
    private String tenHang;//Tên hàng
    private double donGia;//Đơn giá
    private Date ngayHetHan;
    private Date ngaySanXuat;

    public HangThucPham() {
    }

    public HangThucPham(String maHang, String tenHang, double donGia,
                        Date ngayHetHan, Date ngaySanXuat) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.donGia = donGia;
        this.ngayHetHan = ngayHetHan;
        this.ngaySanXuat = ngaySanXuat;
    }

    public HangThucPham(String maHang) {
        this.maHang = maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getMaHang() {
        return maHang;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public void kiemTrahan(Date ngayDangDung){
        if(this.getNgayHetHan() != null){
            if(ngayDangDung.compareTo(this.getNgayHetHan()) >= 0){
                System.out.println("Còn hạn");
            }else {
                System.out.println("Hết hạn");
            }
        }
    }

    @Override
    public String toString() {
        String pattern = "dd/MM/yyyy";
        DateFormat df = new SimpleDateFormat(pattern);
        String date1 = df.format(this.ngaySanXuat);
        String date2 = df.format(this.ngayHetHan);
        return "HangThucPham{" +
                "maHang='" + maHang + '\'' +
                ", tenHang='" + tenHang + '\'' +
                ", donGia=" + donGia +
                ", ngayHetHan=" + date2+
                ", ngaySanXuat=" + date1 +
                '}';
    }
}
