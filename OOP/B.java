package OOP;

public class B extends A {
    public static void main(String[] args) {
        A obj = new A();
        obj.display();
        obj.msg();
        B objb = new B();
        objb.msg();
    }
}
