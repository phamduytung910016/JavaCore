package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.ParseException;

public interface IHangHoa {
    void nhap() throws ParseException;
    void hien();
    String getMaHang();
    String getTenHang();
    int getSoLuong();
    float getDonGia();
    DanhGia danhGia();
}
