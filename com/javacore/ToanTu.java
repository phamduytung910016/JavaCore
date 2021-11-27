package com.javacore;

public class ToanTu {
    public static void main(String[] args) {
        // + , - ,* ,/ , % , ++ , --
        int a = 10;
        int b = 16;
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println((double)b / a);
        System.out.println(b % a);

        //Toán tử quan hệ
        // == , != , > , < , >= , <=
        //  trả về true , false
        System.out.println(a == b);

        //Toán tử thao tác bit
        // &(AND) , |(OR) , ^(XOR) , ~(NOT) , << , >>
        // a = 10 = 0000 1010
        //b = 16 = 0001 0000
        System.out.println(a & b);
        System.out.println(a | b);

        //Toán tử instanceof :kiểm tra kiểu dữ liệu
        String name = "test";
        boolean isString = name instanceof String;
        System.out.println(isString);

        //Toán tử 2 ngôi
        a = 3;
        b = 6;
        int c = a > b ? a : b;
        System.out.println(c);
    }
}
