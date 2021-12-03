package OOP;


/***
 * Đa hình là một khái niệm mà chúng ta có thể thực hiện một hành động
 * bằng nhiều cách khác nhau, điều này xảy ra khi có một sự kế thừa
 * các lớp có sự liên quan nhau
 *
 */

class Calculator{
    public int add(int a, int b){
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a ,int b , int c){
        return a + b + c;
    }
}

class Animal1 {
    public void sound() {
        System.out.println("some sound");
    }
}

class Dog extends Animal1 {
    public void sound() {
        System.out.println("bow bow");
    }
}

class Cat extends Animal1 {
    public void sound (){
        System.out.println("meow meow");
    }
}

class Duck extends Animal1 {
    public void sound() {
        System.out.println("quack quack");
    }
}



/**
 * Variable Hiding: xảy ra khi lớp con khai báo thuộc tính có tên giống
 * tên thuộc tính ở lớp cha, lúc này thuộc tính của lớp cha sẽ không bị
 * lớp con ghi đè mà bị lớp con ẩn đi:
 * */

class SupperClass{
    int x = 10;
    public void display(){
        System.out.println(x);
    }
}

class SubClass1 extends SupperClass{
    int x =  20;
    public void display(){
        System.out.println(x);
    }
}

public class DaHinh {
    public static void main(String[] args) {
        Animal1[] animals = new Animal1[4];
        animals[0] = new Animal1();
        animals[1] = new Dog();
        animals[2] = new Cat();
        animals[3] = new Duck();

        for (int i = 0; i < 4; i++) {
            animals[i].sound();
        }

        SupperClass a = new SubClass1();
        System.out.println(a.x);
        a.display();
        System.out.println(((SubClass1)a).x);
    }




}
