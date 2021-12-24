package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonTheoGio extends HoaDon{
    private int soGioThue;

    public int getSoGioThue() {
        return soGioThue;
    }

    public void setSoGioThue(int soGioThue) {
        this.soGioThue = soGioThue;
    }

    @Override
    public float thanhTien() {
        float thanhTien = 0;
        if(this.getSoGioThue() > 24 && this.getSoGioThue() <= 30){
            return thanhTien = 24 * this.getDonGia();
        }else {
            return thanhTien = this.getSoGioThue() * this.getDonGia();
        }
    }

    @Override
    public void hien() {
        super.hien();
        System.out.print(", số giờ thuê = " + getSoGioThue());
        System.out.printf(", thành tiền = %-20.2f}", thanhTien());
        System.out.println();
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập số giờ thuê: ");
        setSoGioThue(new Scanner(System.in).nextInt());
    }

}
