package OOP;

/**
 * Tính trừu tượng là một tính chất mà chỉ tập trùn vào những tính năng của
 * đối tượng và ẩn đi những thông tin không cần thiết . Tính chất này giúp
 * bạn trọng tâm hơn vào những tính năng thay vì phải quan tâm tới cách mà
 * nó được thực hiện.
 *
 * Trong lập trình , khi sử dụng một đối tượng , bạn chỉ cần quan tâm tới các
 * phương thức cần thiết và chỉ cần biết phương thức đó được dùng để làm gì chứ
 * không cần quan tâm tới source code và các phương thức khác
 *
 * Để thực hiện tính trừu tượng trong java thì bạn có thể sử dụng
 * lớp trừu tượng(abstract class) và interface.
 *
 *
 * */


/**
 * Lớp trừu tượng là lớp được khai báo với từ khóa abstract và có một số đặc điểm:
*/

 /** Nếu một lớp được khai báo là lớp trừu tượng thì bạn không thể khởi tạo
 *   được đối tượng của lớp đó mà chỉ có thể khởi tạo được đối tượng của lớp con.*
 * */

 abstract class Animal{
 }

 class Cat1 extends Animal{

 }

 /**
  * Lớp trừu tượng có thể có các phương thức trừu tượng.Phương thức trừu tượng là
  * phương thức mà chỉ có phần khai báo , không có phần thân
  * */

 abstract class Animal2{
     public abstract void makeSound();
 }

 /**
  * Nếu một lớp được kế thừa từ lớp trừu tượng thì lớp đó phải ghi đè tất cả các phương
  * thức trừu tượng
  * */

 class Cat2 extends Animal2{
     @Override
     public void makeSound() {
         System.out.println("Meo meo");
     }
 }


 /**
  * Lớp trừu tượng thường được dùng để làm lớp cha cho các lớp có cùng bản chất.
  * Việc sử dụng lớp trừu tượng và phương thức trừu tượng sẽ giúp bạn ẩn đi được cách
  * cài đặt phương thức. Tuy nhiên , bạn vẫn có thể khai báo thuộc tính , các phương thức
  * có phần thân nên việc sử dụng lớp trừu tượng sẽ không được coi là trừu tượng hoàn toàn.
  *
  * */

 //Để đạt được tính trừu tượng hoàn toàn bạn cần sử dụng tới interface

/**
 * Interface được dùng để lưu trữ các phương thức trừu tượng và các biến hằng số.
 * */
//Một số đặc điểm của interface

    /**
     * Giống với lớp trừu tượng , bạn không thể khởi tạo đối tượng của interface mà chỉ có thể
     * khởi tạo được đối tượng của lớp kế thừa.
     *
     * Tất cả các phương thức trong interface đều được trình biên dịch hiểu là các phương thức
     * trừu tượng và tất cả các biến trong interface đều được trình biên dịch hiểu là hằng số.
     *
     * Các trường trong interface đều là public static final
     * */

    interface IAnimal{
        int N = 4;
        void move();
        void sound();
    }
    //Trình biên dịch sẽ hiểu như sau:
/**

    interface IAnimal{
        public static final int N = 4;
        public abstract void move();
        public abstract void sound();

    }
*/

     /**
      * Một lớp có thể kế thừa nhiều interface.
      * */

     interface IFlyable{

         void fly();
     }

     interface IEatable{
         void eat();
     }

     class Bird implements IFlyable, IEatable{
         @Override
         public void fly() {
             System.out.println("Bird flying");
         }

         @Override
         public void eat() {
             System.out.println("Bird eats");

         }
     }

/**
 * Khi nhìn vào interface thì thứ duy nhất mà bạn nhìn thấy đó là các phương thức
 * trừu tượng, do đó sử dụng interface được coi là trừu tượng hoàn toàn. Trong thực tế,
 * khi đi làm bạn sử dụng interface rất nhiều , với mỗi lớp bạn thường tạo ra 1 interface
 * riêng để thể hienj các tính năng của lớp đó và giao tiếp với các đối tượng thông qua interface.
 *
 * Ví dụ: lớp Customer sẽ có interface ICustomer
 * */




public class TruuTuong {
    public static void main(String[] args) {
        /**không được khởi tạo đối tượng của lớp trừu tượng
        Animal a = new Animal();
         */
        //chỉ có thể khởi tạo được đối tượng của lớp con
        Animal a = new Cat1();

        Bird bird = new Bird();
        bird.eat();
        bird.fly();
    }
}
