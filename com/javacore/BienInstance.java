package com.javacore;

public class BienInstance {
    String name;
    int age;

    public BienInstance(){

    }

    public BienInstance(String name , int age){
        this.age = age;
        this.name = name;
    }

    public void show(){
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        BienInstance object = new BienInstance();
        object.show();
        BienInstance object2 = new BienInstance("test" , 15);
        object2.show();
    }
}
