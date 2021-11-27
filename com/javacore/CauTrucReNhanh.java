package com.javacore;

public class CauTrucReNhanh {
    public static void main(String[] args) {
        String s = "test";
        if(s == "test1"){
            System.out.println("Đúng");
        }else {
            System.out.println("sai");
        }

        switch (s){
            case "test" : {
                System.out.println("Đúng");
                break;
            }
            case "test1" :{
                System.out.println("Sai");
                break;
            }
        }
    }
}
