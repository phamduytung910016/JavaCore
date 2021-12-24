package BaiTap.KeThuaVaDaHinh.Bai2;

import java.util.Date;

public class SachThamKhao extends Sach {
    private float thue;

    public SachThamKhao() {
    }

    public float getThue() {
        return thue;
    }

    public void setThue(float thue) {
        this.thue = thue;
    }

    @Override
    public float thanhTien(){
        float thanhTien = (this.getDonGia() * this.getSoLuong() + this.getThue());
        return thanhTien ;
    }

    public void hienThi(){
        super.hienThi();
        System.out.printf(", đơn giá = %-10.2f" , this.getDonGia());
        System.out.printf(", thuế = %-10.2f}" , this.getThue());


        System.out.println();
    }


}


