package com.javacore.inner;

public class Animal {

    //inner class
    public class Dog{
        private int tuoi;

        public void hello(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Animal an = new Animal();
        Animal.Dog d = an.new Dog();
        d.hello();
    }
}
