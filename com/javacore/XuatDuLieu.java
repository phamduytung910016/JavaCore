package com.javacore;

public class XuatDuLieu {
    public static void main(String[] args) {
//        int x = 100;
//        System.out.printf("Printing simple integer: x = %d\n", x);
//
//        // this will print it upto 2 decimal places
//        System.out.printf("Formatted with precison: PI = %.2f\n", Math.PI);
//
//        float n = 5.2f;
//
//        // automatically appends zero to the rightmost part of decimal
//        System.out.printf("Formatted to specific width: n = %.4f\n", n);
//
//        n = 2324435.3f;
//
//        // here number is formatted from right margin and occupies a
//        // width of 20 characters
//        System.out.printf("Formatted to right margin: n = %20.4f\n", n);

        //System.out.format(); - is equivalent to printf() and can also be used.
        /*
        int : %d
        double : %f
        float : %f

        * */
        int a = 10;
        int b = 3;
        double res = 1.0 *a/b;
        System.out.println(res);
        System.out.printf("KQ = %.20f\n" , res);
        System.out.printf("KQ = %-10.2f\n" , res);
        boolean t = true;
        first:
        {
            // Illegal statement here as label second is not
            // introduced yet break second;
            second:
            {
                third:
                {
                    // Before break
                    System.out.println("Before the break statement");

                    // break will take the control out of
                    // second label
                    if (t) {
                        break second;
                    }
                    System.out.println("This won't execute.");
                }
                System.out.println("This won't execute.");
            }

            // First block
            System.out.println("This is after second block.");
        }

    }
}
