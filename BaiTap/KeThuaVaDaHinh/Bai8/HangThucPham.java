package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangThucPham extends HangHoa{

    private Date ngaySanXuat;
    private Date ngayHetHan;
    private String nhaCungCap;

    public Date getNgaySanXuat() {
        return ngaySanXuat;
    }

    public void setNgaySanXuat(Date ngaySanXuat) {
        this.ngaySanXuat = ngaySanXuat;
    }

    public Date getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(Date ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }

    public String getNhaCungCap() {
        return nhaCungCap;
    }

    public void setNhaCungCap(String nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập ngày sản xuất (dd/MM/yyyy): ");
        setNgaySanXuat(new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).next()));
        System.out.println("Nhập ngày hết hạn(dd/MM/yyyy): ");
        setNgayHetHan(new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).next()));
        System.out.println("Nhập tên nhà cung cấp: ");
        setNhaCungCap(new Scanner(System.in).nextLine());
    }

    @Override
    public void hien() {
        System.out.print("Hàng thực phẩm{");
        super.hien();
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = df.format(this.ngaySanXuat);
        String date2 = df.format(this.ngayHetHan);
        System.out.println(", ngày sản xuất = " + date1 + ", ngày hết hạn = " + date2 + ", nhà cung cấp = "
                + getNhaCungCap() + "}");
    }

    @Override
    public DanhGia danhGia() {
        Date hienTai = Calendar.getInstance().getTime();
        if(getSoLuong() > 0 && getNgayHetHan().compareTo(hienTai) <= 0) {
            return DanhGia.KHO_BAN;
        }else {
            return DanhGia.KHONG_DANH_GIA;
        }
    }
}
