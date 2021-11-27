package OOP;


class Animal{
    void eat(){
        System.out.println("Eating ");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barking...");
    }
}
public class KeThua {

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.bark();
    }
}
