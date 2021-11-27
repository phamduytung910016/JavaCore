package BaiTap;

public class LuDoThuaToan {
    public static int Bai1(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + Bai1(n - 1);
        }
    }

    public static int Bai2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * n + Bai2(n - 1);
        }
    }

    public static double Bai3(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (double) 1 / n + Bai3(n - 1);
        }
    }

    public static double Bai4(int n) {
        if (n == 1) {
            return 0.5;
        } else {
            return (double) 1 / (2 * n) + Bai4(n - 1);
        }
    }

    public static double Bai5(int n) {
//        double rs = 0;
//        for (int i = 0; i <= n  ; i++) {
//            rs +=(double) 1/(2 * i + 1);
//        }
//        return  rs;
        if (n == 0) {
            return 1.0;
        } else {
            return (double) 1 / (2 * n + 1) + Bai5(n - 1);
        }
    }

    public static double Bai6(int n) {
        if (n == 1) {
            return 1 / 2;
        } else {
            return (double) 1 / (n * (n + 1)) + Bai6(n - 1);
        }
    }

    public static int Bai9(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * Bai9(n - 1);
        }
    }

    public static int Bai10(int n, int x) {
        if (n == 1) {
            return x;
        } else {
            return x * Bai10(n - 1, x);
        }
    }

    public static int Bai11(int n) {
        if (n == 1) {
            return 1;
        } else {
            return Bai9(n) + Bai11(n - 1);
        }

    }

    public static int Bai12(int n, int x) {
        if (n == 1) {
            return x;
        } else {
            return Bai10(n, x) + Bai12(n - 1, x);
        }

    }

    public static int Bai29(int n){
        int rs = 1;
        for(int i = 3; i < n ; i += 2){
            if(n % i == 0){
                if(i > rs){
                    rs = i;
                }
            }
        }
        return rs;
    }

    public static boolean Bai32(int n){
        for (int i = 2; i < (n / 2); i++) {
            if(n % i == 0){
                if((n / i) == i){
                    return true;
                }
            }
        }
        return false;
    }

    public static double Bai33(int n){
        if(n == 1){
            return (double) Math.sqrt(2);
        }else {
            return Math.sqrt(2 + Bai33(n - 1) );
        }
    }

    public static boolean Bai60(int n){
        int[] a = new int[n];
        int index = 0;
        while(n > 0){
            a[index] = n % 10;
            n = n/ 10;
            index++;
        }
        for (int i = 0; i <= index ; i++) {
            if(a[i+1] > a[i]){
                return false;
            }
        }
        return true;
    }

    public static int Bai62(int a , int b){
        if(b == 0 ) {
            return a;
        }
        return Bai62(b , a % b);
    }

    public static int Bai63(int a , int b){
        int rs = 1;
        int max = a > b ? a : b;
        for(int i = max ; i <= (a+b); i++){
            if(i % a == 0 && i % b == 0){
                rs = i;
                break;
            }
        }
        return rs;
    }


    public static boolean Bai75(int n){
        int k = 0;
        while(n > 1){
            if(n % 2 == 0){
                k++;
                n = n / 2;
            }else {
                return false;
            }
        }
        return true;
    }
    public static void themPhanTu(int a[], int phanTu, int viTri) {
        int arr[] = new int[a.length + 1];
        for (int i = 0; i <= viTri; i++) {
            if (i == viTri) {
                arr[i] = phanTu;
            }else {
                arr[i] = a[i];
            }
        }
        for (int i = (viTri + 1); i < (a.length + 1); i++) {
            arr[i] = a[i - 1];
        }

        for (int i = 0; i < (a.length + 1); i++) {
            System.out.println(arr[i]);
        }
    }

    public static void Count(int a[], int n) {
        int b[] = new int[n];
        int x = 1;
        b[0] = a[0];

        for (int i = 1; i < n; i++) {
            int dem = 0;
            for (int j = 0; j < x; j++) {
                if (a[i] == b[j])
                    dem++;
            }
            if (dem == 0) {
                b[x] = a[i];
                x++;
            }
        }

        System.out.print("\nCo " + x + " phan tu khac nhau la: ");
        for (int i = 0; i < x; i++) {
            System.out.print(b[i] + " ");
        }
    }


    public static void main(String[] args) {
//        System.out.println(Bai1(10));
//        System.out.println(Bai2(10));
//        System.out.printf("KQ = %.4f",Bai3(10));
//        System.out.println();
//        System.out.printf("KQ = %.4f",Bai4(10));
//        System.out.println();
//        System.out.printf("KQ = %.4f",Bai5(10));
//        System.out.println();
//        System.out.printf("KQ = %.4f",Bai6(3));
//        System.out.println();
//        System.out.println("KQ = " +Bai9(6));
//        System.out.println("KQ = " +Bai10(10 , 2));
//        System.out.println("KQ = " +Bai11(5));
//        System.out.println("KQ = " +Bai12(5 , 2));
        int a[] = {1, 2, 1, 2, 6};

//        System.out.println(Bai29(100));
        //
//        if(Bai32(25)){
//            System.out.println("Là số chính phương");
//        }else {
//            System.out.println("Không phải số chính phương");
//        }
//        System.out.println(Bai33(3));
//        if(Bai60(134598)){
//            System.out.println("Là số chữ số tăng dần");
//        }else {
//            System.out.println("Không phải Là số chữ số tăng dần");
//        }
        System.out.println(Bai75(1024));
    }
}
