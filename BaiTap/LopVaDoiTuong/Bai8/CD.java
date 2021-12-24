package BaiTap.LopVaDoiTuong.Bai8;

public class CD  implements Comparable<CD>{


    private int maCD;// mã CD
    private String tuaCD;// tựa CD
    private String caSi;//ca sĩ
    private int soBaiHat;//số bài hát
    private float giaThanh;//Giá thành

    public CD(int maCD, String tuaCD, String caSi, int soBaiHat, float giaThanh) {
        this.maCD = maCD;
        this.tuaCD = tuaCD;
        this.caSi = caSi;
        this.soBaiHat = soBaiHat;
        this.giaThanh = giaThanh;
    }

    public CD() {
    }

    public int getMaCD() {
        return maCD;
    }

    public void setMaCD(int maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSi() {
        return caSi;
    }

    public void setCaSi(String caSi) {
        this.caSi = caSi;
    }

    public int getSoBaiHat() {
        return soBaiHat;
    }

    public void setSoBaiHat(int soBaiHat) {
        this.soBaiHat = soBaiHat;
    }

    public float getGiaThanh() {
        return giaThanh;
    }

    public void setGiaThanh(float giaThanh) {
        this.giaThanh = giaThanh;
    }

    @Override
    public int compareTo(CD o) {
        return (int) (o.getGiaThanh() - giaThanh);
    }

    public void hienThi(){
        System.out.print("CD{maCD = " + maCD + ", tuaCD = " + tuaCD + ", caSy = " + caSi);
        System.out.printf(", giaThanh = %-20.2f}" , giaThanh );
        System.out.println();
    }
}
