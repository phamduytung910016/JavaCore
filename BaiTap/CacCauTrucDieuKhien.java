package BaiTap;


public class CacCauTrucDieuKhien {

    public static int bai82(int a, int b, int c) {
        int rs = a > b ? (a > c ? a : c) : (b > c ? b : c);
        return rs;
    }

    public static boolean bai83(double a, double b) {
        if ((a * b) > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void bai84(double a, double b) {
        double rs;
        if (a == 0) {
            System.out.println("Phương trình vô nghiệm");
        } else {
            rs = -b / a;
            System.out.printf("X = %.4f \n", rs);
        }

    }

    public static void bai85(int month) {
        if (1 <= month && month <= 3) {
            System.out.println("Quý 1");
        } else if (4 <= month && month <= 6) {
            System.out.println("Quý 2");
        } else if (7 <= month && month <= 9) {
            System.out.println("Quý 3");
        } else {
            System.out.println("Quý 4");
        }
    }

    public static long bai86(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n * n + bai86(n - 1);
        }
    }

    public static int bai87() {
        int n = 0;
        int sum = 0;
        while (sum < 10000) {
            n++;
            sum += n;
        }

        return n;
    }

    public static void bai88() {
        char c = 'A';
        while (c <= 'Z') {
            System.out.println(c);
            c++;
        }
    }

    public static void bai89(int N) {
        int sum = 1;
        int index = 3;
        while (index < N) {
            sum += index;
            index += 2;
        }
        System.out.println(sum);
    }

    public static void bai90(int N) {
        int n = 0;
        int sum = 0;
        do {
            n += 1;
            sum += n;
        } while (sum < N);

        System.out.println(n - 1);
    }

    public static int bai92(int a, int b) {
        if (a == 0 || b == 0) {
            return a > b ? a : b;
        } else {
            return bai92(b, a % b);
        }
    }

    public static boolean bai93(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void bai94() {
        for (int i = 1; i < 100; i += 2) {
            if (i == 5 || i == 7 || i == 93) {
                continue;
            }
            System.out.println(i);

        }
    }

    public static double abs(double n) {
        return n > 0 ? n : (-n);
    }

    public static void bai95(double a, double b, double c) {
        System.out.println("a = " + abs(a));
        System.out.println("b = " + abs(b));
        System.out.println("c = " + abs(c));
    }

    public static void bai96(int n) {
        if (n >= 5) {
            int rs = 2 * n * n + 5 * n + 9;
            System.out.println(rs);
        } else {
            int rs = (-2) * n * n + 4 * n - 9;
            System.out.println(rs);
        }
    }

    public static void bai97(double a, double b, double c) {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            if ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (a * a == b * b + c * c)) {
                if (a == b || a == c || b == c) {
                    System.out.println("Tam giác vuông cân");
                } else {
                    System.out.println("Tam giác vuông");
                }
            } else if (a == b && b == c) {
                System.out.println("Tam giác đều");
            } else if (a == b || a == c || b == c) {
                System.out.println("Tam giác cân");
            } else {
                System.out.println("Tam giác thường");
            }
        } else {
            System.out.println("Không phải tam giác");
        }
    }


    public static void main(String[] args) {
//        System.out.println(bai82(2,3,6));
//        if(bai83(-3,4)){
//            System.out.println("2 số cùng dấu");
//        }else {
//            System.out.println("2 số trái dấu");
//        }
//        bai84(-3.4,5);
//        bai85(10);
//        System.out.println(bai86(10));
//        System.out.println(bai87());
        //bai88();
//        bai89(101);
//        bai90(100);
//        System.out.println( bai92(100,25));
        //bai94();
//        bai95(-3.4 , 4.7 , -5.77);
//        bai96(20);
        bai97(3, 6, 12);
    }
}
