package BaiTap.KeThuaVaDaHinh.Bai3;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichTienTe extends GiaoDich{
    private float tiGia;
    private LoaiTien loaiTien;


    public float getTiGia() {
        return tiGia;
    }

    public void setTiGia(float tiGia) {
        this.tiGia = tiGia;
    }

    public LoaiTien getLoaiTien() {
        return loaiTien;
    }

    public void setLoaiTien(LoaiTien loaiTien) {
        this.loaiTien = loaiTien;
    }

    @Override
    public float thanhTien() {
        if (this.getLoaiTien() == LoaiTien.VN) {
            return this.getSoLuong() * this.getDonGia();
        } else {
            return this.getDonGia() * this.getSoLuong() * this.getTiGia();
        }
    }

    public void nhap() throws Exception {
        super.nhap();
        System.out.println("Mời nhập tỉ giá: ");
        setTiGia(new Scanner(System.in).nextFloat());
        System.out.println("Chọn loại tiền (1: VN, 2:USD, 3:EURO): ");
        int chon = new Scanner(System.in).nextInt();
    }

    public void hien(){
        super.hien();
        System.out.print(", tiền tệ = " + getLoaiTien());
        System.out.printf(", tỉ giá = %-10.2f", getTiGia());
        System.out.printf(", thành tiền = %-20.2f", thanhTien());
        System.out.println();
    }
}
