package BaiTap.LopVaDoiTuong.Bai7;
public class SinhVien {
    private int msv;//mã số sinh viên
    private String hoTen;//Họ tên
    private String soDienThoai;//Số điện thoại
    private String diaChi; //Địa chỉ

    public SinhVien(int msv, String hoTen, String soDienThoai, String diaChi) {
        this.msv = msv;
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.diaChi = diaChi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public SinhVien() {
    }

    public int getMsv() {
        return msv;
    }

    public void setMsv(int msv) {
        this.msv = msv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "msv=" + msv +
                ", hoTen='" + hoTen + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
