package BaiTap.KeThuaVaDaHinh.Bai6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class DanhSachHoaDon {
    private List<IHoaDon> danhSachHDTG;
    private List<IHoaDon> danhSachHDTN;

    public DanhSachHoaDon() {
        this.danhSachHDTG = new ArrayList<>();
        this.danhSachHDTN = new ArrayList<>();
    }

    public List<IHoaDon> getDanhSachHDTG() {
        return danhSachHDTG;
    }

    public void setDanhSachHDTG(List<IHoaDon> danhSachHDTG) {
        this.danhSachHDTG = danhSachHDTG;
    }

    public List<IHoaDon> getDanhSachHDTN() {
        return danhSachHDTN;
    }

    public void setDanhSachHDTN(List<IHoaDon> danhSachHDTN) {
        this.danhSachHDTN = danhSachHDTN;
    }

    public void lapHDTG() throws ParseException {
        HoaDonTheoGio hoaDonTG = new HoaDonTheoGio();
        hoaDonTG.nhap();
        if(hoaDonTG.getSoGioThue() > 30){
            System.out.println("Số giờ thuê lớn hơn 30, không dùng loại hóa đơn theo giờ");
        }else {
            this.getDanhSachHDTG().add(hoaDonTG);
            System.out.println("Lập hóa đơn thành công");
        }
    }

    public void lapHDTN() throws ParseException {
        HoaDonTheoNgay hoaDonTN = new HoaDonTheoNgay();
        hoaDonTN.nhap();
        this.getDanhSachHDTN().add(hoaDonTN);
        System.out.println("Lập hóa đơn thành công");
    }

    public void xuatHDTG(){
        System.out.println("Danh sách các hóa đơn theo giờ");
        for (IHoaDon hoaDonTG: this.getDanhSachHDTG()
             ) {
            hoaDonTG.hien();
        }
    }

    public void xuatHDTN(){
        System.out.println("Danh sách các hóa đơn theo ngày");
        for (IHoaDon hoaDonTN: this.getDanhSachHDTN()
        ) {
            hoaDonTN.hien();
        }
    }

    public int soLuongHDTG(){
        int sum = 0;
        for (IHoaDon hoaDonTG: this.getDanhSachHDTG()
        ) {
           if(hoaDonTG != null){
               sum++;
           }
        }
        System.out.println("Số lượng hóa đơn theo giờ là: " + sum);
        return sum;
    }

    public int soLuongHDTN(){
        int sum = 0;
        for (IHoaDon hoaDonTN: this.getDanhSachHDTN()
        ) {
            if(hoaDonTN != null){
                sum++;
            }
        }
        System.out.println("Số lượng hóa đơn theo ngày là: " + sum);
        return sum;
    }

    public float tongThanhTienThang9_2013(List<IHoaDon> danhSach){
        float sum = 0;
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        for (IHoaDon hoaDon: danhSach) {
            String[] ngayLHD = df.format(hoaDon.getNgayLapHoaDon()).trim().split("/");
            if(ngayLHD[1].equals("09") && ngayLHD[2].equals("2013")){
                sum += hoaDon.thanhTien();
            }
        }
        return sum;
    }

    public void trungBinhThang9_2013(){
        float tong = tongThanhTienThang9_2013(this.getDanhSachHDTG()) + tongThanhTienThang9_2013(this.getDanhSachHDTN());
        int soLuong = soLuongHDTG() + soLuongHDTN();
        System.out.printf("Trung bình thành tiền là: %-20.2f" , (float)(tong / soLuong));
    }

}
