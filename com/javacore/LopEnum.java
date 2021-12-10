package com.javacore;


/***
 * Enum là một kiểu dữ liệu đặc biệt của Java được sử dụng để dịnh nghĩa các tập hợp các hằng số.
 * Một enum có thể chứa các trường, phương thức và Contructor
 *
 */

enum Season {
    SPRING(5), SUMMER(10), FALL(15), WINTER(20);

    //Constructor của enum trong java là PRIVATE.
    private int value;
    private Season (int value){
        this.value = value;
    }

    public int getValue(){
        return this.value;
    }
}

public class LopEnum {

    //định nghĩa enum


    public static void main(String[] args) {
        Season season = Season.WINTER;
        System.out.println(season);

        //Duyệt các phần tử
        for (Season s: Season.values()
             ) {
            System.out.println(s + " = " + s.getValue());
        }
    }
}
