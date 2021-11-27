package com.javacore;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Mang {
    //Mảng là một tập hợp các phần tử có cùng kiểu dữ liệu

    /**
     * Thư viện tiện ích
     * Arrays
     * */
    public static void main(String[] args) {
//        int a[] = new int[3];
//        a[0] = 10;
//        a[1] = 12;
//        for (int i = 0; i < a.length; i++) {
//            System.out.println("a[" + i + "]=" + a[i]);
//        }
//        //Mảng Nhiều chiều
//        int n[][][] = new int[3][4][5];
//        int intArray[] = new int[3];
//        byte byteArray[] = new byte[3];
//        short shortsArray[] = new short[3];
//        String[] strArray = new String[3];
//
//
//        //Nhân bản và copy mảng
//        /*Khi sao chép 1 mảng 1 chiều , chẳng hạn như Object[],
//        một bản sao của mảng được thực hiện với mảng mới chứa các
//        bản sao của các phần tử của mảng ban đầu . Nó trái ngược với
//        kỹ thuật tham chiếu
//        */
//        intArray[0] = 1;
//        intArray[1] = 2;
//        intArray[2] = 3;
//        int cloneArray[] = intArray.clone();
//        System.out.println(intArray[1] == cloneArray[1]);
        /**
         * Phương thức asList : List<Kiểu_dữ_liệu> tên_list = Arrays.asList(<Tên_mảng>)
         * chuyển mảng thành danh sách có cùng kiểu dữ liệu
         * */
        int intArr[]= {10,20,15,22,35};
        System.out.println("Interger Array as List: " + Arrays.asList(intArr));


    }
}
