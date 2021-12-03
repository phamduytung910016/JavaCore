package OOP;


/**
 * Tính đóng gói là kỹ thuật giúp che giấu được những thông tin bên trong
 * đối tượng , mục đích chính của tính đóng gói là giúp hạn chế các lỗi khi
 * phát triển chương trình
 * */


class Student1 {
    private String name;
    private int age;
    private double gpa;


    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public String getName(){
        return this.name;

    }
}

class Rectangle{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
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

    public double getArea(){
        return (this.getLength() * this.getWidth());
    }

    public double getPerimeter(){
        return (this.getLength() + this.getWidth()) * 2;
    }
}






public class DongGoi {
    public static void main(String[] args) {

    }

}
