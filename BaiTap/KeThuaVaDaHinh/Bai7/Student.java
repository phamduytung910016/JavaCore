package BaiTap.KeThuaVaDaHinh.Bai7;

import java.util.Scanner;

public class Student extends Person{
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

    public double diemTB(){
        double diemTb = (getDiemMon1() + getDiemMon2()) / 2;
        return diemTb;
    }

    @Override
    public DanhGia getDanhGia(){
        if(diemTB() >= 9 ){
            return DanhGia.GIOI;
        }else if(diemTB() < 9 && diemTB() >= 7){
            return DanhGia.KHA;
        }else if(diemTB() <=6 && diemTB() >= 5){
            return DanhGia.TRUNGBINH;
        }else {
            return DanhGia.YEU;
        }
    }

    public void hien(){
        System.out.print("Student");
        super.hien();
        System.out.printf(", điểm môn 1 = %-2.2f" , getDiemMon1());
        System.out.printf(", điểm môn 2 = %-2.2f", getDiemMon2());
        System.out.printf(", điểm TB = %-2.2f" , diemTB());
        System.out.println(", đánh giá = " + getDanhGia() + "}");
    }

    public void nhap(){
        super.nhap();
        System.out.println("Nhập điểm môn 1: ");
        setDiemMon1(new Scanner(System.in).nextDouble());
        System.out.println("Nhập điểm môn 2: ");
        setDiemMon2(new Scanner(System.in).nextDouble());
    }
}
