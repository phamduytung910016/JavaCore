package BaiTap.KeThuaVaDaHinh.Bai9;

public class XeDap extends XeHaiBanh{
    @Override
    public float thue() {
        return 0;
    }

    @Override
    public float thueVAT() {
        return 0;
    }

    @Override
    public float thueTruocBa() {
        return 0;
    }

    @Override
    public void hien() {
        System.out.print("Xe đạp{");
        super.hien();
        System.out.printf(", thuế = %-20.2f", thue());
        System.out.println("}");
    }
}
