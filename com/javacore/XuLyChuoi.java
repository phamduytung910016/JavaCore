package com.javacore;

import java.io.DataInputStream;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Locale;

public class XuLyChuoi {
    public static void main(String[] args) throws IOException {
     /*   //Sử dụng string literal
        String s1 = "Hello";
        String s2 = "Hello"; //sẽ không tạo instance mới
        String s3 = s1;
        //đối tượng mặc định lưu vào bộ nhớ Pool
        //Sử dụng new
        String s4 = new String("Hello");
        String s5 = new String ("Hello");
        //Đối tượng lưu trong bộ nhớ heap

        System.out.println(s1 == s2);//so sánh về mặt tham chiếu
        System.out.println(s1 == s3);
        System.out.println(s4 == s5);*/

        //-----Các phương thức trong String
        String str = "Hello";

        //tính chiều dài 1 chuỗi length()
        int length = str.length();

        System.out.println(length);

        //Xóa khoảng trắng ở đầu và cuối chuỗi - trim()
        String s1 = "   hello    string       ";
        System.out.println(s1 + "Java");
        System.out.println(s1.trim() + " java");

        //Chuyển ký tự chữ hoa <=> thường
        //toUpperCase , toLowerCase

        String s2 = "HELLO Java";
        char ar[] = s2.toCharArray();
        for (char c :
                ar) {
            System.out.print(c);

        }
        System.out.println(s2.charAt(2));
        System.out.println(s2.toLowerCase());

        //hàm sẽ không thay đổi giá trị của string
        System.out.println(s2);
        System.out.println(s2.toUpperCase());

        //Hàm nối chuỗi concat
        String str1 = "Hello";
        String str2 = "Java";

        //String str3 = str1 + str2;
        String str3 = str1.concat(str2);
        System.out.println(str3);

        //Tìm ký tự trong chuỗi charAt(vị trí)

        String name = "Tung";
        char c = name.charAt(3);
        System.out.println(c);

        //Tìm vị trí index của ký tự hoặc chuỗi trong chuỗi
        int index = name.indexOf('n');
        System.out.println(index);
        int index1 = name.indexOf("un");
        System.out.println(index1);

        //replace():Dùng để thay thế tất cả các ký tự hoặc chuỗi cũ thành ký tự hoặc chuỗi mới
        String s6 = "Hello Java";
        //thay thế tất cả ký tự 'a' thành 'o'
        String replaceString = s6.replace('a', 'o');
        System.out.println(replaceString);


        //hàm trả về chuỗi con của 1 chuỗi từ 1 vị trí index muốn cắt chuỗi
        String s7 = "HelloJava";
        //Cắt từ vị trí index = 3
        System.out.println(s7.substring(3));
        //cắt từ vị trí index = 3 đến vị trí index = 7
        System.out.println(s7.substring(3, 7));

        //So sánh chuỗi equals() được sử dụng để so sánh nội dung 2 chuỗi
        String s8 = "Hello";
        String s9 = "Hello";
        String s10 = new String("Hello");
        System.out.println(s8.equals(s10));
        //so sánh không phân biệt chữ hoa chữ thường
        String s11 = "HELLO";
        System.out.println(s11.equalsIgnoreCase(s10));

        //"==":So sánh tham chiếu (xem 2 đối tượng có trỏ cùng đến 1 ô nhớ hay không)

        //So sánh chuỗi bằng compareTo

        String s12 = "Hello";
        String s13 = "Java";
        String s14 = "Hello";
        System.out.println(s12.compareTo(s13));
        System.out.println(s12.compareTo(s14));

        //split(điều kiện phân tách) tách chuỗi và trả về mảng chuỗi

        String s15 = "Hello Java";

//        String words[] = s15.split("");
//        for (String w : words){
//            System.out.println(w);
//        }

        //String buffer
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(" java");
        System.out.println(sb);
        String st = "  pHAm3353524245566*  dUy8888**~    Tung   ";
        System.out.println("Xau chua xu ly: " + st);
        System.out.println("Xau da duoc xu ly: " +XuLyChuoi.xuLy(st));


        String phoneNumber = "   012 39*  8  4  9*    99   ";

        System.out.println("So dien thoai chua xu ly: " +phoneNumber);
        System.out.println("So dien thoai da duoc xu ly: " +XuLyChuoi.phoneNumber(phoneNumber));

//        char cd[] = {'1','2','h','e','3','&','l','^','l','o'};
//        for (char cd1 : cd
//        ) {
//            if(cd1 >= 'a' && cd1 <= 'z'){
//                rs = rs + Character.toString(cd1);
//            }
//        }
//        words = rs.split(" ");
//        rs = "";
//        for (String word: words
//             ) {
//
//            word = Character.toString(word.charAt(0) - 32 ) + word.substring(1);
//
//            System.out.println(word);
//
//
//        }
//
//        System.out.println(rs);



    }

    public static String xuLy(String st) {
        st = st.trim().toLowerCase().replaceAll("\\s+", " ");
        String words[] = st.split(" ");

        String rs = "";
        for (String word : words) {
            char cd[] = word.toCharArray();
            word = "";
            for (char cd1: cd
            ) {
                if(cd1 >= 'a' && cd1 <= 'z'){
                    word += Character.toString(cd1);
                }
            }
            word = Character.toString(word.charAt(0) - 32 )
                    + word.substring(1);
            rs += word +" ";
        }
        return rs.trim();
    }

    public static String phoneNumber(String phoneNumber){
        String rs = "";
        char numbers[] = phoneNumber.trim().replaceAll("\\s+","").toCharArray();
        for (char number: numbers
        ) {
            if(number >='0' && number <='9'){
                rs += Character.toString(number);
            }
        }
        return rs;
    }
}
