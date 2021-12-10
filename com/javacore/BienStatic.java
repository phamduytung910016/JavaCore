package com.javacore;

import java.sql.SQLOutput;


//Static giúp bạn tạo ra các thuộc tính và phương thức tĩnh trong Java
//Khi khai báo 1 biến, một phương thức với static thì khi hoạt động nó
//thuộc về lớp chứ không phải thuộc về đối tượng tạo ra từ lớp

/**
 * Static chạy trong quá trình compile time
 * */

public class BienStatic {
    public static int TOTAL = 10;
    public static int COUNT ;

    public static void main(String[] args) {
        System.out.println(BienStatic.COUNT);
        System.out.println(BienStatic.TOTAL);

    }
}
