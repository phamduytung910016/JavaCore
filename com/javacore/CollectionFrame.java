package com.javacore;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionFrame {
    /*
    * ArrayList: là 1 class dạng list được implement dựa trên mảng
    * có kích thước thay đổi được
    *
    * LinkedList: là 1 class dạng list hoạt động trên cơ sở của cấu trúc
    * dữ liệu danh sách liên kết đôi
    *
    * HashMap: là class thực thi giao diện Map Interface , HashMap lưu trữ dữ liệu
    * ở dạng các cặp key-value(khóa- giá trị)
     */


    /**
     * ArrayList: là kiểu danh sách sử dụng cấu trúc mảng để lưu trữ phần tử.
     * Thứ tự các phần tử dựa qua theo thứ tự lúc thêm vào và giá trị của các
     * phần tử này có thể giống nhau.
     * */

    /**
     * LinkedList : là 1 cấu trúc dữ liệu lưu trữ các phần tử dưới dạng danh sách.Các
     * phần tử trong linkedList được sắp xếp có thứ tự và có thể có giá trị giống nhau.
     * */

    /**
     * HashSet: Thứ tự các phần tử trong HashSet không dựa theo thứ tự lúc thêm vào và giá trị
     * của các phần tử này là duy nhất
     * */

    /**
     * TreeSet: các phần tử trong TreeSet mặc định được sắp xếp tăng dần và giá trị của các phần tử này
     * là duy nhất
     * */

    /**
     * HashMap: Giá trị của mỗi phần tử trong HashMap bao gồm 2 phần đó là khóa (key) và giá trị tương ứng
     * của key đó và khóa của các phần tử này là duy nhất. HashMap cho phép truy xuất trực tiếp dữ liệu bằng
     * khóa duy nhất của nó
     * */
    public static void main(String[] args) {
        //Khai báo một ArrayList
        // Cú pháp : List<Kiểu_dữ_liệu> tên
        List<String> arrayList = new ArrayList<String>();
        //thêm phần tử
        arrayList.add("PHP");
        arrayList.add("Python");
        arrayList.add("Java");
        arrayList.add("C++");
        System.out.println("Các phần tử của ArrayList");
        System.out.println("\t" + arrayList + "\n");

        //Khai báo một LinkedList





    }
}
