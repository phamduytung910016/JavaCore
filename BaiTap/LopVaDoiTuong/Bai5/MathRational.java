package BaiTap.LopVaDoiTuong.Bai5;

public class MathRational {
    public static int GCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return GCD(b, a % b);
    }

    public static int BCNN(int a, int b) {
        int result = GCD(a, b);
        return a * b / result;
    }


    // tối giản
    public Rational reduce(Rational rational) {
        Rational rs = new Rational();
        int gcd = 0;
        boolean checkNumerator = rational.getNumerator() < 0 ? true : false;
        boolean checkDenominator = rational.getDenominator() < 0 ? true : false;
        if (checkDenominator || checkNumerator) {
            gcd = MathRational.GCD(Math.abs(rational.getDenominator()), Math.abs(rational.getNumerator()));
        } else if((checkNumerator == false) && (checkDenominator == false)){
            gcd = MathRational.GCD(rational.getDenominator(), rational.getNumerator());
        }
        if (checkNumerator && checkDenominator) {
            rs.setNumerator(Math.abs(rational.getNumerator() / gcd));
            rs.setDenominator(Math.abs(rational.getDenominator() / gcd));
        } else if (checkDenominator) {
            rs.setNumerator(-(rational.getNumerator() / gcd));
            rs.setDenominator(Math.abs(rational.getDenominator() / gcd));
        } else {
            rs.setNumerator(rational.getNumerator() / gcd);
            rs.setDenominator(rational.getDenominator() / gcd);
        }
        return rs;
    }

    //nghịch đảo
    public Rational reciprocal(Rational rational) {
        Rational rs = new Rational();
        rs.setNumerator(rational.getDenominator());
        rs.setDenominator(rational.getNumerator());
        return rs;
    }

    //cộng
    public Rational add(Rational rt1, Rational rt2) {
        Rational rs = new Rational();
        int cstDenominator = MathRational.BCNN(rt1.getDenominator(), rt2.getDenominator());
        int temp1 = cstDenominator / (rt1.getDenominator());
        int temp2 = cstDenominator / (rt2.getDenominator());
        rs.setNumerator(rt1.getNumerator() * temp1 + rt2.getNumerator() * temp2);
        rs.setDenominator(cstDenominator);
        rs = this.reduce(rs);
        return rs;
    }

    //trừ
    public Rational sub(Rational rt1, Rational rt2) {
        Rational rs = new Rational();
        rs.setNumerator((rt1.getNumerator() * rt2.getDenominator()) - (rt2.getNumerator() * rt1.getDenominator()));
        int tuSo = (rt1.getNumerator() * rt2.getDenominator()) - (rt2.getNumerator() * rt1.getDenominator());
        rs.setDenominator(rt1.getDenominator() * rt2.getDenominator());
        int mauSo = rt1.getDenominator() * rt2.getDenominator();
        rs = this.reduce(rs);
        return rs;
    }

    //nhân
    public Rational multi(Rational rt1, Rational rt2) {
        Rational rs = new Rational();
        rs.setNumerator(rt1.getNumerator() * rt2.getNumerator());
        rs.setDenominator(rt1.getDenominator() * rt2.getDenominator());
        rs = this.reduce(rs);
        return rs;
    }

    //chia
    public Rational div(Rational rt1, Rational rt2) {
        Rational rs = new Rational();
        Rational recRational = this.reciprocal(rt2);
        rs.setNumerator(rt1.getNumerator() * recRational.getNumerator());
        rs.setDenominator(rt1.getDenominator() * recRational.getDenominator());
        rs = this.reduce(rs);
        return rs;
    }

    //so sánh
    public void compare(Rational rt1, Rational rt2) {
        if ((rt1.getNumerator() * rt2.getDenominator()) >= (rt2.getNumerator() * rt1.getDenominator())) {
            if (rt1.getDenominator() * rt2.getDenominator() > 0) {
                System.out.print("Phân số ");
                rt1.show();
                System.out.print(" lớn hơn phân số ");
                rt2.show();
                System.out.println("");
            } else {
                System.out.print("Phân số ");
                rt2.show();
                System.out.print(" lớn hơn phân số ");
                rt1.show();
                System.out.println("");
            }
        } else {
            if (rt1.getDenominator() * rt2.getDenominator() > 0) {
                System.out.print("Phân số ");
                rt2.show();
                System.out.print(" lớn hơn phân số ");
                rt1.show();
                System.out.println("");
            } else {
                System.out.print("Phân số ");
                rt1.show();
                System.out.print(" lớn hơn phân số ");
                rt2.show();
                System.out.println("");
            }
        }
    }
}
