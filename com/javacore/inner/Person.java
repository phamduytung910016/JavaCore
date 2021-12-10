package com.javacore.inner;


/**
 * Inner Static class là class được khai báo bên trong 1 class khác kèm với từ khóa static. Class đó
 * được xem như 1 biến static của class bên ngoài
 * */
public class Person {
    //inner static class
    public static class Kid{
        private int tuoi;

        public void hello(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
