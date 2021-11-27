package OOP;


/**
 * Class : là 1 khuông mẫu để tạo ra đối tượng
 */

/**
 * Cú pháp khai báo class
 * <Accsess Modifier> class ClassName
 * */


public class LopVaDoiTuong {
    public static void main(String[] args) {
        Car toyota = new Car("Toyota");
        Car ford = new Car("Ford");
        toyota.show();
        ford.show();
        SinhVien sv1 = new SinhVien(1,"Tùng");
        SinhVien sv2 = new SinhVien(2,"Tuấn" , "tuan@gmail.com");
        sv1.display();
        sv2.display();
    }
}


class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }
}

class SinhVien{
    private int id;
    private String name;
    private String email;

    public SinhVien(int id , String name){
        this.id = id;
        this.name = name;
    }

    public SinhVien(int id , String name , String email){
        this(id, name);
        this.email = email;
    }

    public void display(){
        System.out.println(name);
        System.out.println(email);
    }



}