package BaiTap.KeThuaVaDaHinh.Bai2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SachGiaoKhoa extends Sach {
    private boolean tinhTrangMoi;//Tình trạng

    public SachGiaoKhoa(){}

    public boolean isTinhTrangMoi() {
        return tinhTrangMoi;
    }

    public void setTinhTrangMoi(boolean tinhTrang) {
        this.tinhTrangMoi = tinhTrang;
    }

    @Override
    public float thanhTien() {
        float thanhTien ;
        if (isTinhTrangMoi()) {
            thanhTien = (float) (this.getSoLuong() * this.getDonGia());
            return thanhTien;
        } else {
            thanhTien =  (float)(this.getSoLuong() * this.getDonGia() * 0.5);
            return thanhTien;
        }
    }

    @Override
    public void hienThi(){
        String tinhTrang = (this.isTinhTrangMoi() == true) ? "mới" : "cũ";
        super.hienThi();
        System.out.print(", tình trạng = " + tinhTrang );
        System.out.printf(", đơn giá = %-20.2f}" , this.getDonGia());
        System.out.println();
    }


}
