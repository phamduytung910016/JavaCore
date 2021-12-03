package OOP;


/**
 * Quan hệ phụ thuộc: là quan hệ mà đối tượng của lớp này sử dụng đối tượng
 * của lớp kia
 * */

//class ClassB{
//    void doWork(){
//        System.out.println("hihi");
//    }
//}
//
//class ClassA{
//    public void myMethod(ClassB b){
//        b.doWork();
//    }
//}


/**
 * Quan hệ kết hợp xảy ra khi một đối tượng có thuộc tính là một đối tượng khác
 * */

class Manager {
    private String name;

    public Manager(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee {
    private String name;
    private Manager manager;

    public Employee(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
    }

    public String getManagerName() {
        return manager.getName();
    }

    public String getName() {
        return name;
    }
}


/**
 * Quan hệ thu nạp xảy ra khi một đối tượng có thuộc tính là một đối tượng khác và
 * 2 đối tượng này có thể tồn tại độc lập
 * */

class ClassB{
    public ClassB() {
    }

    void doWork(){
        System.out.println("hihi");
    }
}

// class ClassA {
//    ClassB b;
//    public void setB(ClassB b){
//        this.b = b;
//    }
//}

/**
 * Quan hệ hợp thành :
 * Quan hệ hợp thành xảy ra khi đối tượng của lớp ClassB là 1 phần trong đối tượng
 * của lớp ClassA, khi đối tượng của lớp ClassA bị hủy thì đối tượng của ClassB cũng bị hủy theo.
 * */

 class ClassA{
    private ClassB b;
    public ClassA() {
        b = new ClassB();
    }
}

public class MoiQuanHeGiuaCacDoiTuong {
}
