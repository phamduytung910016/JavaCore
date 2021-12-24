package BaiTap.KeThuaVaDaHinh.Bai9;

public class XeOToTai extends XeBonBanh{
    @Override
    public float thue() {
        return thueVAT() + thueTruocBa();
    }

    @Override
    public float thueVAT() {
        return (float) (getGiaXe() * 0.1);
    }

    @Override
    public float thueTruocBa() {
        return (float) (getGiaXe() * 0.02);
    }
}
