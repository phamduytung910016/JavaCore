package OOP;

public class HamConstructor {
    private String id;
    private String name;
    private String gender;
    private int age;

    public HamConstructor(String id , String name){
        this.id = id;
        this.name = name;
    }

    //gọi constructor trong constructor

    public HamConstructor(String id ,String name , String gender , int age){
        this(id, name);
        this.gender = gender;
        this.age = age;
    }

    public static void main(String[] args) {
        MySingleton a = MySingleton.getInstance();
        MySingleton b = MySingleton.getInstance();
        MySingleton c = MySingleton.getInstance();

        a.x = a.x + 10;
        c.x += 20;
       a.n = a.n + 10;
        System.out.println("Value of a.x = " + a.x);
        System.out.println("Value of b.x = " + b.x);
        System.out.println("Value of c.x = " + c.x);
//
        System.out.println("Value of a.n = " + a.n);
        System.out.println("Value of b.n = " + b.n);
    }
}

/**
 * Singleton class design pattern
 *Trong lập trình hướng đối tượng, một lớp singleton là một lớp chỉ có thể
 *  có một đối tượng (một thể hiện của lớp) tại một thời điểm.
 *
 * */


class MySingleton{

    static MySingleton instance = null;
    static int n = 20;
    public int x = 10;
    private MySingleton(){}

    static public MySingleton
    getInstance(){
        if(instance == null){
            instance = new MySingleton();
        }
        return instance;
    }
}

