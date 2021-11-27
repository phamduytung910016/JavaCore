package com.javacore;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {


        //while-do
//        while(i < 10){
//            System.out.println(i);
//            i++;
//        }
//        System.out.println(i);
//        //do-while
//
//        do {
//            System.out.println(i);
//            i++;
//
//
//        }while (i < 10);
//        int n[] = {1,2,3,4,5};
//
//        //foreach
//        for (int j: n) {
//            System.out.println(j);
//        }
//
//        //for thông thường
//        for(int index = 0 ; index < 10 ; index++){
//            System.out.println(index);
//        }

//        for(int i = 0 ; i < 10 ; i++){
//            if(i < 10){
//                for(int j = 0 ; j <10 ; j++){
//                    if(j == 3){
//                        break;
//                    }
//                    System.out.println(j);
//
//                }
//            }
//            System.out.println(i);
//
//        }
//        for(int k = 0 ; k < 10 ; k++){
//            if(k % 2 == 0){
//
//            }
//        }

//        for (int i = 1; i <= 10; i++) {
//            if (i == 5) {
//                i++;
//                continue;
//            }else {
//                System.out.println(i+1);
//            }
//            System.out.println(i);
//        }
//        System.out.println("test continue");

//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                if (i == 2 && j == 2) {
//                    continue;
//                }
//                // Không in trường hợp i=2 và j=2 ra màn hình
//                System.out.println(i + " " + j);
//            }
//        }

//        double a , b , c;
//        Scanner sc = new Scanner(System.in);
//        System.out.print("a = ");
//        a = sc.nextDouble();
//        System.out.print("b = ");
//
//        b = sc.nextDouble();
//        System.out.print("c = ");
//        c = sc.nextDouble();
//
//       if((a < b + c) &&( b < a+ c) && (c < a + b)){
//           if( a*a==b*b+c*c || b*b==a*a+c*c || c*c== a*a+b*b){
//               if(a == b || a == c || b == c){
//                   System.out.println("Tam giác vuông cân");
//               }else {
//                   System.out.println("Tam giác vuông");
//               }
//
//           }else if(a == b && b == c){
//               System.out.println("Tam giác đều");
//           }else if(a == b || a == c || b == c){
//               System.out.println("Tam giác cân");
//           }
//       }else {
//           System.out.println("Không phải 1 tam giác");
//       }
//        float a ;
//        String str;
//        Scanner sc = new Scanner(System.in);
//        a = sc.nextFloat();
//        Scanner sc1 = new Scanner(System.in);
//        str = sc1.nextLine();
//
//
//        System.out.println(a);
//        System.out.println(str);
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < i - 1; j++) {
                if (j == 0 || j == i - 2) {
                    System.out.print("* ");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
