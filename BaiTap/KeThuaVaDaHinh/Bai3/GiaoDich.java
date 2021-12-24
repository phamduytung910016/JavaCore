package BaiTap.KeThuaVaDaHinh.Bai3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public abstract class GiaoDich implements IGiaoDich {
    private long maGiaoDich;
    private Date ngayGiaoDich;
    private float donGia;
    private int soLuong;

    public long getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(long maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public Date getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(Date ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    @Override
    public float getDonGia() {
        return donGia;
    }

    public void setDonGia(float donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public void hien(){
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String ngayGD = formatter.format(this.getNgayGiaoDich());
        System.out.print("Mã giao dịch = " + getMaGiaoDich() +
                ", ngayGiaoDich = " + ngayGD+ ", đơn giá = " + getDonGia()
                + ", số lượng = " + getSoLuong() );
    }

    public void nhap() throws Exception {
        System.out.println("Nhập mã giao dịch: ");
        setMaGiaoDich(new Scanner(System.in).nextLong());
        System.out.println("Nhập ngày giao dịch: ");
        String ngayGD = new Scanner(System.in).nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(ngayGD);
        setNgayGiaoDich(date1);
        System.out.println("Nhập đơn giá: ");
        setDonGia(new Scanner(System.in).nextFloat());
        System.out.println("Nhập số lượng: ");
        setSoLuong(new Scanner(System.in).nextInt());
    }

}
