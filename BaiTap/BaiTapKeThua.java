package BaiTap;

class Person{
    private String name;
    private int age;
    private String address;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    protected void display(){}
}

class Student extends Person{
    private double gpa;

    public Student() {

    }

    public Student(String name, int age, String address, double gpa) {
        super(name, age, address);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    protected void display(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Salary: " + this.getGpa());
    }
}

class Teacher extends Person{
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age, String address, int salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display(){
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Salary: " + this.getSalary());
    }
}


class Employee{
    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void display(){
        System.out.println("Name: " +this.getName());
        System.out.println("Salary: " +this.getSalary());
    }
}

class Manager extends Employee{
    private int bonus;

    public Manager(String name, int salary, int bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public int getSalary(){
        return super.getSalary() + this.bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    @Override
    public void display(){
        System.out.println("Name: " + this.getName());
        System.out.println("Salary: " + this.getSalary());

    }

}

public class BaiTapKeThua {
    public static void main(String[] args) {
        Student s = new Student("Khanh", 23, "Ha Noi", 9.0);
        s.display();
        System.out.println();
        Teacher t = new Teacher("Tung", 34, "Ha Noi", 1700);
        t.display();
    }

}
