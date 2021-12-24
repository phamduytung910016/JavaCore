package BaiTap.KeThuaVaDaHinh.Bai9;

public class XeMay extends XeHaiBanh{
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
        return (float)(getGiaXe() * 0.05);
    }

    @Override
    public void hien() {
        System.out.print("Xe máy{");
        super.hien();
        System.out.println("}");
    }
}
