package OOP;


//class Animal{
//    public Animal(){
//        System.out.println("animal");
//    }
//    void eat(){
//        System.out.println("Eating ");
//    }
//}

//class Cat extends Animal{
//    void eat(){
//        System.out.println("Eating cat");
//    }
//}
//
////Đơn kế thừa
//class Dog extends Animal  {
//    public Dog(){
//        System.out.println("Dog");
//    }
//    void bark(){
//        System.out.println("barking...");
//    }
//}
//
////Đa kế thừa
//class Husky extends Dog{
//    void speak(){
//        System.out.println("Husky");
//    }
//}

/**
 * 1 class không được phép kế thừa nhiều class, nhưng có thể implement
 * nhiều interface
 *
 * 1 interface được phép kế thừa nhiều interface
 * */


/**
 * Constructor của lớp con luôn gọi tới constructor của lớp cha
 *
 * Có thể thấy constructor mặc định (constructor không tham số) của lớp cha đã được gọi cùng với constructor của lớp con.
 * Do đó, khi lớp cha không có constructor mặc định mà lớp con không chỉ rõ cần gọi tới
 *
 *Lúc này bạn phải dùng từ khóa "super" để chỉ cho lớp con biết cần phải gọi tới constructor nào của lớp cha
 * */

//class Human{
////    public Human() {
////        System.out.println("Person constructor");
////    }
//    private String name;
//    public Human(String name){
//        this.name = name;
//    }
//}
//
//class Student extends Human{
//    public Student(String name) {
//        super(name);
//
//        System.out.println("Student constructor");
//    }
//}



class Person{
    private String name;
    private int dob;
    public Person(String name, int dob) {
        this.name = name;
        this.dob = dob;
    }

//    public int add(int a , int b ,int c){}
//
//    public double add(double a, double b , double c){}



    public String getName(){
        return this.name;
    }

    public int getDob(){
        return this.dob;
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Student extends Person {
    private double gpa;

    public Student(String name , int dob , double gpa){
        super(name , dob);
        this.gpa = gpa;
    }

    public double getGpa(){
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }


}

/**
 * Trong kế thừa, bạn hoàn toàn có thể ghi đè lại phương thức của lớp cha.
 * Để ghi đè phương thức của lớp cha thì phương thức của lớp con phải có phạm
 * vi truy cập bằng hoặc rộng hơn phạm vi truy cập ở lớp cha
 * */
class SuperClass{
    protected void display() {
        System.out.println("Hello from SuperClass");
    }

    public final void show(){
        System.out.println("SupperClass");
    }
}


class Parent{

    private int age;

    public Parent(int age) {
        this.age = age;

    }

    protected void sound(){
        System.out.println("Parent");
    }
}

class Child extends Parent {

    private String name;

    public Child(int age ,String name) {
        super(age);
        this.name = name;
    }

    public void eat(){
        super.sound();
    }
}
class SubClass extends SuperClass{
    @Override
    public void display() {
        System.out.println("Hello from SubClass");
    }

    /** Không được ghi đè do lớp cha để "final"
    @Override
    public void show(){
        System.out.println("Subclass");
    }
    */
}

/**
 * Ngoài ra, phương thức static sẽ không thể bị ghi đè và đối với các phương thức non-static bạn có thể ngăn không cho
 * lớp con ghi đè bằng cách thêm từ khóa final
 * */

/**
 * Up-casting
 * Khi biến của lớp cha tham chiếu tới đối tượng của lớp con(đối tượng của lớp con bị chuyển kiểu dữ liệu về lớp cha),
 * thì đó được gọi là up-casting
 *
 * Khi biến của lớp cha tham chiếu tới đối tượng của lớp con thì biến này chỉ có thể gọi tới các thuộc tính và phương
 * thức có ở lớp cha và nếu lớp con ghi đè thì phương thức được gọi sẽ là ở lớp con
 *
 * */

//class Animal{
//    public void sound(){
//        System.out.println("Some sound");
//    }
//
//
//}
//
//class Cat extends Animal {
//    public void sound() {
//        System.out.println("meo meo");
//    }
//
//    public void eat() {
//        System.out.println("eat");
//    }
//}
//
//
//class Dog extends Animal{
//    public void sound(){
//        System.out.println("gau gau");
//    }
//    public void eat(){
//        System.out.println("eat");
//    }
//}


public class KeThua {

    public static void main(String[] args) {

//        Dog husky = new Animal();
//        Student s = new Student("Hai", 1999, 8.8);
//        System.out.println("Name: " + s.getName());
//        System.out.println("Date of birth: " + s.getDob());
//        System.out.println("GPA: " + s.getGpa());
//        SubClass s = new SubClass();
//        s.display();

//        Animal animal = new Cat();
//        Animal animal1 = new Dog();
//        animal.sound();
//        animal1.sound();
//        //down-casting
//        ((Cat)animal).eat();

    }
}
