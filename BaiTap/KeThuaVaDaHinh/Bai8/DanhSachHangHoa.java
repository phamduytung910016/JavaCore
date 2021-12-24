package BaiTap.KeThuaVaDaHinh.Bai8;

import java.text.ParseException;

public class DanhSachHangHoa {
    private IHangHoa[] danhSach;
    private int n;// Dung lượng của mảng
    private int soLuongHangHoa;

    public DanhSachHangHoa(int n) {
        this.soLuongHangHoa = 0;
        this.n = n;
        this.danhSach = new IHangHoa[this.n];
    }

    public int getSoLuongHangHoa() {
        return soLuongHangHoa;
    }

    public void setSoLuongHangHoa(int soLuongHangHoa) {
        this.soLuongHangHoa = soLuongHangHoa;
    }

    public IHangHoa[] getDanhSach() {
        return danhSach;
    }

    public void setDanhSach(IHangHoa[] danhSach) {
        this.danhSach = danhSach;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void xuat() {
        for (IHangHoa hangHoa : this.getDanhSach()) {
            if (hangHoa != null) {
                hangHoa.hien();
                System.out.println(hangHoa.danhGia());
            }
        }
    }

    public IHangHoa khoiTao(int loai) {
        switch (loai) {
            case 1: {
                return new HangThucPham();
            }
            case 2: {
                return new HangDienMay();
            }
            case 3: {
                return new HangSanhSu();
            }
            default: {
                return null;
            }
        }
    }

    public void them(IHangHoa hangHoaMoi) throws ParseException {
        if (getSoLuongHangHoa() < getN()) {
            hangHoaMoi.nhap();
            for (IHangHoa hangHoa : getDanhSach()) {
                if (hangHoa != null) {
                    if (hangHoa.getMaHang().equals(hangHoaMoi.getMaHang())) {
                        System.out.println("Mã hàng bị trùng");
                        break;
                    }
                }
            }
            this.danhSach[getSoLuongHangHoa()] = hangHoaMoi;
            setSoLuongHangHoa(getSoLuongHangHoa() + 1);
            System.out.println("Thêm mới thành công");
        } else {
            System.out.println("Bộ nhớ đã đầy");
        }
    }


}
