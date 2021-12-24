package BaiTap.LopVaDoiTuong.Bai5;

public class Main {
    public static void main(String[] args) {
        MathRational math = new MathRational();
        Rational rt1 = new Rational(2,3);
        Rational rt2 = new Rational(-3,-4);
        Rational rt3 = new Rational(16,-8);

//        math.reduce(rt3).show();
//        System.out.println();
//        math.add(rt1,rt2).show();
//        System.out.println();
//        math.sub(rt1,rt2).show();
//        System.out.println();
//        math.multi(rt1,rt2).show();
//        System.out.println();
//        math.div(rt1,rt2).show();
//        System.out.println();
        rt3.show();
        rt1.show();
        math.reduce(new Rational(8,-16)).show();
        math.compare(new Rational(8,16),rt1);
        math.sub(rt1,rt3).show();

    }
}
