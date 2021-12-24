package BaiTap.KeThuaVaDaHinh.Bai10;

import java.util.Scanner;

public class SinhVien extends ConNguoi{
    private double diemMon1;
    private double diemMon2;

    public double getDiemMon1() {
        return diemMon1;
    }

    public void setDiemMon1(double diemMon1) {
        this.diemMon1 = diemMon1;
    }

    public double getDiemMon2() {
        return diemMon2;
    }

    public void setDiemMon2(double diemMon2) {
        this.diemMon2 = diemMon2;
    }

    public double tongDiem(){
        return getDiemMon1() + getDiemMon2();
    }

    @Override
    public void nhap(){
        super.nhap();
        System.out.println("Nhập điểm môn 1: ");
        setDiemMon1(new Scanner(System.in).nextDouble());
        System.out.println("Nhập điểm môn 2: ");
        setDiemMon2(new Scanner(System.in).nextDouble());
    }

    @Override
    public void hien(){
        System.out.print("Sinh viên{");
        super.hien();
        System.out.printf(", điểm môn 1 = %-2.2f " ,getDiemMon1());
        System.out.printf(", điểm môn 2 = %-2.2f " ,getDiemMon2());
        System.out.printf(", điểm tổng = %-2.2f " ,tongDiem());
        System.out.println("}");
    }

    public void thayDoiThongTin(){
        System.out.println("0.Thay đổi điểm môn 1");
        System.out.println("1.Thay đổi điểm môn 2");
        System.out.println("Nhập lựa chọn: ");
        int n = new Scanner(System.in).nextInt();
        if(n == 0){
            System.out.println("Nhập điểm môn 1 (mới): ");
            setDiemMon1(new Scanner(System.in).nextDouble());
        }else {
            System.out.println("Nhập điểm môn 2 (mới): ");
            setDiemMon2(new Scanner(System.in).nextDouble());
        }
        System.out.println("Thay đổi thông tin thành công");
    }

    public void thayDoiThongTin(SinhVien sinhVien){
        setTen(sinhVien.getTen());
        setDiaChi(sinhVien.getDiaChi());
        setDiemMon1(sinhVien.getDiemMon1());
        setDiemMon2(sinhVien.getDiemMon2());
        System.out.println("Thay đổi thông tin thành công");
    }
}
