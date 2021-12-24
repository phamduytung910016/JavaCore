package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.ParseException;
import java.util.Scanner;

public class HoaDonTheoNgay extends HoaDon{
    private int soNgayThue;

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public float thanhTien() {
        float thanhTien ;
        if (getSoNgayThue() > 7){
            return thanhTien = (float) (this.getDonGia() * 7 + this.getDonGia() * (this.getSoNgayThue() - 7) * 0.8);
        }else {
            return thanhTien = getDonGia() * getSoNgayThue();
        }
    }

    @Override
    public void hien() {
        super.hien();
        System.out.print(", số ngày thuê = " + getSoNgayThue());
        System.out.printf(", thành tiền = %-20.2f", thanhTien());

        System.out.println();
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Mời nhập số ngày thuê: ");
        setSoNgayThue(new Scanner(System.in).nextInt());
    }
}
