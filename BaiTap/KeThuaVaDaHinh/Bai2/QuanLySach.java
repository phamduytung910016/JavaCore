package BaiTap.KeThuaVaDaHinh.Bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class QuanLySach {
    Scanner sc ;
    private List<SachGiaoKhoa> sachGiaoKhoaList;
    private List<SachThamKhao> sachThamKhaoList;

    public QuanLySach() {
        this.sachGiaoKhoaList = new ArrayList<>();
        this.sachThamKhaoList = new ArrayList<>();
    }

    public List<SachGiaoKhoa> getSachGiaoKhoaList() {
        return sachGiaoKhoaList;
    }

    public void setSachGiaoKhoaList(List<SachGiaoKhoa> sachGiaoKhoaList) {
        this.sachGiaoKhoaList = sachGiaoKhoaList;
    }

    public List<SachThamKhao> getSachThamKhaoList() {
        return sachThamKhaoList;
    }

    public void setSachThamKhaoList(List<SachThamKhao> sachThamKhaoList) {
        this.sachThamKhaoList = sachThamKhaoList;
    }

    public void xuatSGK() {
        System.out.println("---Sách giáo khoa---");
        for (SachGiaoKhoa sgk : this.getSachGiaoKhoaList()) {
            sgk.hienThi();
        }
    }

    public void xuatSTK() {
        System.out.println("---Sách tham khảo---");
        for (SachThamKhao stk : this.getSachThamKhaoList()) {
            stk.hienThi();
        }
    }

    public void nhapSGK() throws ParseException {
        sc = new Scanner(System.in);
        SachGiaoKhoa sgk = new SachGiaoKhoa();
        System.out.println("Nhập thông tin sách giáo khoa");

        System.out.println("Nhập mã sách");
        sgk.setMaSach(sc.nextLine());


        System.out.println("Nhập ngày lưu kho (dd/mm/yyyy):");
        String ngayNhap = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(ngayNhap);
        sgk.setNgayNhap(date1);

        System.out.println("Nhập đơn giá: ");
        sgk.setDonGia(sc.nextLong());

        System.out.println("Nhập số lượng: ");
        sgk.setSoLuong(sc.nextInt());
        sc.nextLine();


        System.out.println("Nhập nhà xuất bản: ");
        sgk.setNhaXuatBan(sc.nextLine());

        System.out.println("Tình trạng (nhập m nếu là mới , c nếu là cũ): ");
        String trangThai = sc.next();
        if (trangThai.equals("m")) {
            sgk.setTinhTrangMoi(true);
        } else {
            sgk.setTinhTrangMoi(false);
        }
        this.getSachGiaoKhoaList().add(sgk);
        System.out.println("Thêm thành công");
    }

    public void nhapSTK() throws ParseException {
        sc = new Scanner(System.in);
        System.out.println("Nhập thông tin sách tham khảo");
        SachThamKhao stk = new SachThamKhao();
        System.out.println("Nhập mã sách");
        stk.setMaSach(sc.nextLine());

        System.out.println("Nhập ngày lưu kho (dd/mm/yyyy):");
        String ngayNhap = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date1 = dateFormat.parse(ngayNhap);
        stk.setNgayNhap(date1);

        System.out.println("Nhập đơn giá: ");
        stk.setDonGia(sc.nextLong());

        System.out.println("Nhập số lượng: ");
        stk.setSoLuong(sc.nextInt());
        sc.nextLine();

        System.out.println("Nhập nhà xuất bản: ");
        stk.setNhaXuatBan(sc.nextLine());


        System.out.println("Nhập thuế: ");
        stk.setThue(sc.nextFloat());

        this.getSachThamKhaoList().add(stk);
        System.out.println("Thêm thành công");
    }

    public void tbcDGSTK() {
        int soLuong = 0;
        float sum = 0;
        for (SachThamKhao stk : this.getSachThamKhaoList()) {
            soLuong += stk.getSoLuong();
            sum += stk.thanhTien();
        }
        System.out.printf("Trung bình cộng đơn giá sách tham khảo: %20.2f", (float) (sum / soLuong));
        System.out.println();
    }

    public void xuatSGKTheoNXB(String nxb) {
        System.out.println("Danh sách các sách giáo khoa của nhà xuất bản " + nxb);
        for (SachGiaoKhoa sgk : this.getSachGiaoKhoaList()) {
            if (sgk.getNhaXuatBan().toUpperCase().contains(nxb.toUpperCase())) {
                sgk.hienThi();
            }
        }
    }

    public void tongThanhTienSGK() {
        float sum =0;
        for (SachGiaoKhoa sgk : this.getSachGiaoKhoaList()) {
            sum += sgk.thanhTien();
        }


        System.out.printf("Tổng thành tiền các sách giáo khoa = %-10.2f", sum);
        System.out.println();
    }

    public void tongThanhTienSTK() {
        float sum = 0;
        for (SachThamKhao stk : this.getSachThamKhaoList()) {
            sum += stk.thanhTien();
        }
        System.out.printf("Tổng thành tiền các sách tham khảo = %-10.2f", sum);
        System.out.println();
    }


}
