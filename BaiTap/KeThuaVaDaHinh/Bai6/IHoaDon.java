package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.ParseException;
import java.util.Date;

public interface IHoaDon {
    String getMaHoaDon();
    Date getNgayLapHoaDon();
    String getTenKhachHang();
    String getMaPhong();
    float getDonGia();
    float thanhTien();
    void nhap() throws ParseException;
    void hien();
}
