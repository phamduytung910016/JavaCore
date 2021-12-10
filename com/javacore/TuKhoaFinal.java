package com.javacore;



/**
 * Dùng để tạo ra các hăng số, không cho phép thay đổi nội dung
 *
 * Các trường hợp sử dụng :
 *  + Biến final : để định nghĩa hằng số trong Java
 *  + Phương thức final: khi 1 phương thức được khai báo với từ khóa final,
 *    các class con kế thừa sẽ không thể ghi đề (override) phương thức này
 *  + Lớp final: khi từ khóa final được sử dụng cho 1 một lớp , lớp này sẽ không thể
 *  được kế thừa.
 * */

class Parent{
    public final void print(){
        System.out.println("This is parent");
    }
}
public class TuKhoaFinal extends Parent {
    //public final void print(){}
    public static final int HOUR_OF_DAY = 24;
}
