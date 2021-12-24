package BaiTap.KeThuaVaDaHinh.QuanLySanPham;

public class SanPhamNongNghiep extends SanPham
{
    private static final int HESO = 500;
    private int hanDung;
    private float giaHienTai;

    public int getHanDung() {
        return hanDung;
    }

    public void setHanDung(int hanDung) {
        this.hanDung = hanDung;
    }

    public float getGiaHienTai() {
        return giaHienTai;
    }

    public void setGiaHienTai(float giaHienTai) {
        this.giaHienTai = giaHienTai;
    }

    @Override
    public String toString() {
        return super.toString() + " ---SanPhamNongNghiep{" +
                "hanDung=" + hanDung +
                ", giaHienTai=" + giaHienTai +
                '}';
    }

    @Override
    public float getGiaBan() {
        return getGiaHienTai() + getHanDung() * HESO;
    }
}
