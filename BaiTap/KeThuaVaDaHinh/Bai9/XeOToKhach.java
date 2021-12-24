package BaiTap.KeThuaVaDaHinh.Bai9;

public class XeOToKhach extends XeBonBanh{
    private int soCho;// số chỗ ngồi

    public int getSoCho() {
        return soCho;
    }

    public void setSoCho(int soCho) {
        this.soCho = soCho;
    }

    @Override
    public float thue() {
        return thueTruocBa() + thueVAT();
    }

    @Override
    public float thueVAT() {
        if (getSoCho() >= 5) {
            return (float) (getGiaXe() * 0.3);
        } else {
            return (float) (getGiaXe() * 0.5);
        }
    }

    @Override
    public float thueTruocBa() {
        return (float) (getGiaXe() * 0.2);
    }
}
