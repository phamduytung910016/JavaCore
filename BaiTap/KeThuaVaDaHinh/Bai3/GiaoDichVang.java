package BaiTap.KeThuaVaDaHinh.Bai3;

import java.text.ParseException;
import java.util.Scanner;

public class GiaoDichVang extends GiaoDich{

    private LoaiVang loaiVang;

    public LoaiVang getLoaiVang() {
        return loaiVang;
    }

    public void setLoaiVang(LoaiVang loaiVang) {
        this.loaiVang = loaiVang;
    }

    @Override
    public float thanhTien() {
        return this.getSoLuong() * this.getDonGia();
    }

    public void hien(){
        super.hien();
        System.out.print(", loại vàng = " + getLoaiVang());
        System.out.printf(", thành tiền = %-20.2f", this.thanhTien());
        System.out.println();
    }

    public void nhap() throws Exception {
        super.nhap();
        System.out.println("Mời chọn loại vàng (1: Vàng trắng, 2: Vàng ta, 3:Vàng tây): ");
        int n = new Scanner(System.in).nextInt();
        if(n == 1){
            setLoaiVang(LoaiVang.VANG_TRANG);
        }else if(n == 2){
            setLoaiVang(LoaiVang.VANG_TA);
        }else {
            setLoaiVang(LoaiVang.VANG_TAY);
        }

    }
}
