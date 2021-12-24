package BaiTap.KeThuaVaDaHinh.Bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DanhSachGiaoDich {
    private List<IGiaoDich> danhSachGDV;
    private List<IGiaoDich> danhSachGDTT;

    public DanhSachGiaoDich() {
        this.danhSachGDV = new ArrayList<>();
        this.danhSachGDTT = new ArrayList<>();
    }

    public void themGDV() throws Exception {
            IGiaoDich giaoDichVang = new GiaoDichVang();
            giaoDichVang.nhap();
            danhSachGDV.add(giaoDichVang);
    }
    public void themGDTT() throws Exception {

        IGiaoDich giaoDichTienTe = new GiaoDichTienTe();
        giaoDichTienTe.nhap();
        danhSachGDTT.add(giaoDichTienTe);

    }

    public List<IGiaoDich> getDanhSachGDV() {
        return danhSachGDV;
    }

    public void setDanhSachGDV(List<IGiaoDich> danhSachGDV) {
        this.danhSachGDV = danhSachGDV;
    }

    public List<IGiaoDich> getDanhSachGDTT() {
        return danhSachGDTT;
    }

    public void setDanhSachGDTT(List<IGiaoDich> danhSachGDTT) {
        this.danhSachGDTT = danhSachGDTT;
    }

    public void hienGDV() {
        for (IGiaoDich gd: this.danhSachGDV
             ) {
            gd.hien();
        }
    }

    public void hienGDTT() {
        for (IGiaoDich gd: this.danhSachGDTT
        ) {
            gd.hien();
        }
    }

    public int tongSoLuongGDV(){
        int sum = 0;
        for (IGiaoDich gdv: this.getDanhSachGDV()
             ) {
            if(gdv != null){
                sum ++;
            }
        }
        return sum;
    }

    public int tongSoLuongGDTT(){
        int sum = 0;
        for (IGiaoDich gdv: this.getDanhSachGDTT()
        ) {
            if(gdv != null){
                sum ++;
            }
        }
        return sum;
    }

    public void trungBinhTienGDTT(){
        float tien = 0;
        for (IGiaoDich gdv: this.getDanhSachGDTT()
             ) {
            if(gdv != null){
                tien += gdv.thanhTien();
            }
        }
        System.out.printf("Trung bình giao dịch tiền tệ: %-20.2f" , (tien/ this.tongSoLuongGDTT()));
        System.out.println();
    }

    public void giaoDichCoDonGiaHon1Ty(){
        System.out.println("Các giao dịch có đơn giá hơn 1 tỷ ");
        for (IGiaoDich gdv: this.getDanhSachGDV()
             ) {
            if(gdv.getDonGia() > 1000000000){
                gdv.hien();
            }
        }
        for (IGiaoDich gdtt: this.getDanhSachGDTT()
        ) {
            if(gdtt.getDonGia() > 1000000000){
                gdtt.hien();
            }
        }
    }

    public void giaoDichTrong9Nam2013GDV(){
        System.out.println("Các giao dịch vàng trong tháng 9 năm 2013:");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (IGiaoDich gdv: this.getDanhSachGDV()
             ) {
            String[] ngayGD = df.format(gdv.getNgayGiaoDich()).trim().split("/");
            if(ngayGD[1].equals("09") && ngayGD[2].equals("2013")){
                gdv.hien();
            }
        }
    }

    public void giaoDichTrong9Nam2013GDTT(){
        System.out.println("Các giao dịch tiền tệ trong tháng 9 năm 2013:");
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (IGiaoDich gdtt: this.getDanhSachGDTT()
        ) {
            String[] ngayGD = df.format(gdtt.getNgayGiaoDich()).trim().split("/");
            if(ngayGD[1].equals("09") && ngayGD[2].equals("2013")){
                gdtt.hien();
            }
        }
    }



}
