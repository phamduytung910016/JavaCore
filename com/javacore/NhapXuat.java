package com.javacore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NhapXuat {




    public static void main(String[] args) throws FileNotFoundException {
//        //Khởi tạo đối tượng nhập dữ liệu từ bàn phím
//        Scanner sc = new Scanner(System.in);
//
//        String name;
//        int age;
//        System.out.println("Your name: ");
//        name = sc.nextLine();
//        System.out.println("Your age: ");
//        age = sc.nextInt();
//
//        System.out.println("Your name is " + name);
//        System.out.println("Your age is " + age);
//
//        sc.close();
//        Scanner sc = new Scanner(System.in);
//
//        // String input
//        System.out.println("Your name?");
//        String name = sc.nextLine();
//
//        // Character input
//        System.out.println("Your gender?");
//        String gender = sc.next().toLowerCase();
//
//        // Numerical data input
//        // byte, short and float can be read
//        // using similar-named functions.
//        System.out.println("Your age?");
//        int age = sc.nextInt();
//        System.out.println("Your mobile?");
//        long mobileNo = sc.nextLong();
//
//        // Print the values to check if the input was correctly obtained.
//        System.out.println("Name: "+name);
//        System.out.println("Gender: "+gender);
//        System.out.println("Age: "+age);
//        System.out.println("Mobile Number: "+mobileNo);

        //Hiển thị ra màn hình trong java
        int x = 100;
        System.out.printf("Printing simple integer: x = %d\n", x);

        // this will print it upto 2 decimal places
        System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI);

        float n = 5.2f;

        // automatically appends zero to the rightmost part of decimal
        System.out.printf("Formatted to specific width: n = %.4f\n", n);

        n = 2324435.3f;

        // here number is formatted from right margin and occupies a
        // width of 20 characters
        System.out.printf("Formatted to right margin: n = %20.4f\n", n);

        //System.out.format(); - is equivalent to printf() and can also be used.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Nhap vao mot so nguyen");
//        int a = sc.nextInt();
//        System.out.println("Nhap vao mot so float");
//        float b = sc.nextFloat();
//        System.out.println("Nhap vao mot so thuc");
//        double c = sc.nextDouble();
//        System.out.println("Nhap vao 1 ky tu");
//        char d = sc.next().charAt(0); // đọc vào một kí tự
//        System.out.println("Nhap mot tu");
//        String word = sc.next(); // đọc vào 1 từ , gặp dấu cách loại luôn
//        sc.nextLine();
//        System.out.println("Nhap mot dong");
//        // nextLine() sẽ đọc các dữ liệu thừa ở phía trước
//        String line = sc.nextLine(); //đọc cả dòng
//       // System.out.println(a + " - " + b +" - " + c+ " - "  );
//        System.out.println(d + " - " + word +" - " + line);


//        System.out.println("Nhap mot so nguyen");
//        int variable = sc.nextInt();
//        sc.nextLine();
//        System.out.println("Nhap mot chuoi");
//        String word = sc.nextLine();
//        System.out.println(variable);
//        System.out.println(word);
//
//
//        sc.close();
        //

        /**Đọc dữ liêu từ file với Scanner
         * */
        File file = new File("Input.txt");

        Scanner fileScanner = new Scanner(file);

        //đọc từng dòng
        while(fileScanner.hasNext()){
            //đọc từng từ
//            String line = fileScanner.next();
            //đọc từng dòng
            String line = fileScanner.nextLine();
            System.out.println(line);
        }


    }
}
