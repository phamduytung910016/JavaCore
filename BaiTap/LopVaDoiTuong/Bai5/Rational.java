package BaiTap.LopVaDoiTuong.Bai5;

public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public void show(){
        System.out.println(this.getNumerator() +"/" + this.getDenominator());
    }



}
