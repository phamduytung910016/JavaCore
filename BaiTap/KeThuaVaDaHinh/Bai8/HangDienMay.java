package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.ParseException;
import java.util.Scanner;

public class HangDienMay extends HangHoa{
    private int thoiGianBH;
    private double congSuat;

    public int getThoiGianBH() {
        return thoiGianBH;
    }

    public void setThoiGianBH(int thoiGianBH) {
        this.thoiGianBH = thoiGianBH;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập thời gian bảo hành: ");
        do{
            Scanner sc = new Scanner(System.in);
            setThoiGianBH(sc.nextInt());
            if(getThoiGianBH() < 0){
                System.out.println("Thời gian bảo hành không hợp lệ, mời nhập lại");
            }
        }while (getThoiGianBH() < 0);
        System.out.println("Nhập công suất (KW): ");
        do{
            Scanner sc = new Scanner(System.in);
            setCongSuat(sc.nextDouble());
            if(getCongSuat() < 0){
                System.out.println("Công suất không hợp lệ, mời nhập lại");
            }
        }while (getCongSuat() < 0);
    }

    @Override
    public void hien(){
        System.out.print("Hàng điện máy");
        super.hien();
        System.out.print(", thời gian bảo hành = " + getThoiGianBH());
        System.out.printf(", công suất(KW) = %-5.2f" , getCongSuat());
        System.out.println("}");
    }

    @Override
    public DanhGia danhGia(){
        if(getSoLuong() < 3){
            return DanhGia.BAN_DUOC;
        }else {
            return DanhGia.KHONG_DANH_GIA;
        }
    }
}
