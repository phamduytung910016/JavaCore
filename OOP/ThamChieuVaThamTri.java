package OOP;

public class ThamChieuVaThamTri {

    static void addOneto(int num){
        num = num +1;
    }

    public static void main(String[] args) {
        int x = 5;
        addOneto(x);
        System.out.println(x);

        Person p ;
        p = new Person("john");
        p.setAge(21);
        celebrateBirthday(p);
        System.out.println(p.getAge());

    }

    static void celebrateBirthday(Person p){
        p.setAge(p.getAge() + 1);
    }
}
