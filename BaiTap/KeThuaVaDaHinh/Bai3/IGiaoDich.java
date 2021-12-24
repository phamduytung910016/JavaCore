package BaiTap.KeThuaVaDaHinh.Bai3;

import java.text.ParseException;
import java.util.Date;

public interface IGiaoDich {
    float thanhTien();
    void nhap() throws ParseException, Exception;
    void hien();

    float getDonGia();

    long getMaGiaoDich();

    Date getNgayGiaoDich();


}
