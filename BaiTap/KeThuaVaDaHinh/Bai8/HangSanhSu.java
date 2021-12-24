package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class HangSanhSu  extends HangHoa {
    private String nhaSanXuat;
    private Date ngayNhapKho;

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public Date getNgayNhapKho() {
        return ngayNhapKho;
    }

    public void setNgayNhapKho(Date ngayNhapKho) {
        this.ngayNhapKho = ngayNhapKho;
    }


    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập tên nhà sản xuất: ");
        setNhaSanXuat(new Scanner(System.in).nextLine());
        System.out.println("Nhập ngày nhập kho(dd/MM/yyyy): ");
        setNgayNhapKho(new SimpleDateFormat("dd/MM/yyyy").parse(new Scanner(System.in).next()));
    }

    @Override
    public void hien() {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String date1 = df.format(this.ngayNhapKho);
        System.out.print("Hàng sánh sứ{");
        super.hien();
        System.out.println(", nhà sản xuất = " +getNhaSanXuat() + ", ngày nhập kho = " + date1 + "}");
    }

    @Override
    public DanhGia danhGia() {
        long hienTai = Calendar.getInstance().getTime().getTime();
        long ngayNK = getNgayNhapKho().getTime();
        long chenhLech = Math.abs(hienTai - ngayNK) / (24*60*60*1000);
        if(getSoLuong() > 90 && chenhLech > 10){
            return DanhGia.BAN_CHAM;
        }else {
            return DanhGia.KHONG_DANH_GIA;
        }
    }
}
