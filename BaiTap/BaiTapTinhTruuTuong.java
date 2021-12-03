package BaiTap;

abstract class Person1{
    private String name;
    private String address;

    public Person1(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public abstract void display();
}

class Employee1 extends Person1{
    private int salary;

    public Employee1(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + getName());
        System.out.println("Employee address: " + getAddress());
        System.out.println("Employee salary: " + getSalary());
    }
}

class Customer extends Person1{
    private int balance;
    public Customer(String name, String address, int balance){
        super(name, address);
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public void display(){
        System.out.println("Customer name: " + getName());
        System.out.println("Customer address: " + getAddress());
        System.out.println("Customer salary: " + getBalance());
    }
}

interface IShape{
    double getArea();
    double getPerimeter();
}

class Rectangle implements IShape{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {

        return (getLength() + getWidth()) * 2;
    }

    @Override
    public double getPerimeter() {
        return (getLength() * getWidth());
    }
}

class Circle implements IShape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return 3.14 * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}


interface IEmployee {
    int calculateSalary();
    String getName();
}

abstract class Employee2 implements IEmployee {
    private String name;
    private int paymentPerHour;

    public Employee2(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPaymentPerHour() {
        return paymentPerHour;
    }

    public void setPaymentPerHour(int paymentPerHour) {
        this.paymentPerHour = paymentPerHour;
    }
}

class PartTimeEmployee extends Employee2 {
    private int workingHours ;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHours) {
        super(name, paymentPerHour);
        this.workingHours = workingHours;
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        this.workingHours = workingHours;
    }

    @Override
    public int calculateSalary() {
        return getWorkingHours() * getPaymentPerHour();
    }
}

class FullTimeEmployee extends Employee2 {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
    }

    @Override
    public int calculateSalary() {
        return 8 * getPaymentPerHour();
    }
}
public class BaiTapTinhTruuTuong {
}
