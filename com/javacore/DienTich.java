package com.javacore;

public class DienTich {
    static final double  PI = 3.14;
    public DienTich(double n){
        String s1= "hello";
        String s2 = "hello";
        String s3 = s2;
        String s4 = new String("hello");
        System.out.println(s3 == s2);
    }

    public static void main(String[] args) {
        String s1= "hello";
        String s2 = "hello";
        String s3 = s2;
        String s4 = new String("hello");
        System.out.println(s1 == s4);
        System.out.println("DienTich.main");

    }
}
