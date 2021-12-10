package com.javacore;


/**
 * Exception(ngoại lệ) là lỗi xảy ra khi chương trình thi hành. Ngoại lệ dẫn tới chương trình kết thúc
 * Exception handling trong Java là cơ chế giúp bạn nhận được lỗi xảy ra và đưa ra cách xử lý theo tình
 * huống mong muốn
 * <p>
 * Một ngoại lệ có thể xảy ra do nhiều nguyên nhân khác nhau, ví dụ:
 * + Người dùng nhập sai dữ liệu quy định
 * + Một file nào đó cần mở mà lại không có
 * + Kết nối mạng bị mất khi cần truyền dữ liệu
 * + Bố nhớ bị thiếu
 */


/**
 * Các kiểu của Exception:
 * 1. Checked Exception
 * Các lớp extends từ lớp Throwable ngoài trừ RuntimeException và Erro được gọi là checked exception,ví
 * dụ như Exception , SQLException..
 * Các checked exception được kiểm tra tại compile-time
 * Kế thừa từ Exception class nếu muốn định nghĩa riêng lớp checked exception
 */

class MyCheckedException extends Exception {
    public MyCheckedException(String message) {
        super(message);
    }
}

class CheckedExceptionDemo {
    public static void main(String[] args) {

        try {
            CheckedExceptionDemo.testCheckedException();
        } catch (MyCheckedException e) {
            e.printStackTrace();
        }
    }

    public static void testCheckedException() throws MyCheckedException {
        System.out.println("Checked exception demo!");
    }
}


/**
 * 2. Unchecked Exception:
 * Các lớp extends từ RuntiomException được gọi là unchecked exception, ví dụ: ArithmeticException, NullPointerException,
 * ArrayindexOutOfBoundsException,.. Các ngoại lệ unchecked không được kiểm tra tại compile-time mà chúng được kiểm tra
 * tại RUNTIME.
 */


class MyuncheckedException extends RuntimeException {
    public MyuncheckedException(String message) {
        super(message);
    }
}

class UncheckedExceptionDemo {
    public static void main(String[] args) {
        UncheckedExceptionDemo.testUncheckedException();
    }

    public static void testUncheckedException() throws MyuncheckedException {
        System.out.println("Unchecked exception demo!");
        throw new MyuncheckedException("unchecked exception");
    }
}


/**
 * Error là lỗi sẽ làm cho chương trình không hoạt động được , dừng ngay lập tức
 * */



/**
 * -----------Exception handling--------------------
 * Khi 1 method có ngoại lệ xảy ra thì có 2 cách xử lý:
 *  + Ném exception ra bên ngoài, tức là đẩy việc xử lý ngoại lệ cho class phía ngoài
 *  gọi nó(nếu có) xử lý.
 *  + Xử lý ngày bên trong method đó
 * Bắt ngoại lệ để xử lý với try...catch
 *  + Các ngoại lệ có thể bắt bằng cách kết hợp cặp từ khóa try và catch. try/catch bao
 *  bọc lấy khối lệnh cần bắt ngoại lệ.
 *     try {
 *         //code cần bắt lỗi ở đây
 *     }catch (Exception e){
 *         //code xử lý khi bắt được lỗi e
 *     }
 *  + Trong khối catch có khai báo kiểu ngoại lệ cần bắt (Exception e). Nếu ngoại lệ có
 *  xảy ra ở khối try thì ngoại lệ sẽ chuyển đến khối catch. Kiểu có ngoại lệ có tên
 *  Exception có thể dùng cho tất cả các ngoại lệ
 *
 *
 *
 * ----------------Cách ném ngoại lệ bằng từ khóa throw-----------
 * Từ khóa throw cho phép bạn tự phát sinh ra ngoại lệ để try/catch bắt được.
 * Ngoài kiểu ngoại lệ Exception còn có các kiểu ngoại lệ khác như:
 * IndexOutOfBoundsException, NullPointerException, ArithmeticException...
 *
 *
 * */



public class ExceptionHandling {

//    public static void main(String[] args) {
//        //NullPointerException
//        String strObject = null;
//        //so sánh với hằng số
//        if (strObject.equals("JAVA")) {
//            System.out.println("Hello Java");
//        }
//
//        //java.lang.ArrayIndexOutOfBoundsException
//        int[] arr = new int[3];
//        arr[0] = 1;
//        arr[1] = 2;
//        arr[2] = 3;
//
//        //truy xuất phần từ mảng với index = 5;
//        System.out.println(arr[5]);
//    }

    public static void main(String[] args) {
//        try{
//            int a[] = new int[2];
//            System.out.println(a[5]);
//        }catch (Exception e){
//            System.out.println("Có lỗi xảy ra");
//        }

        try{
            div(10,0);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e);
        }
    }

    static int div(int a, int b) throws ArithmeticException{
        if(b == 0){
            throw new ArithmeticException("Lỗi chia cho 0");
        }else {
            return a / b;
        }
    }
}
