package com.javamidle;


/**
 * Java Relection là một core package trong thư viện chuẩn của Java. Mục đích của nó là cho phép
 * chúng ta truy cập vào gần như mọi thế bên trong đối tượng "dưới 1 góc độ khác" !.
 * <p>
 * Chúng ta thường biết tới Java thông qua khái niệm hướng đối tượng sau:
 * String str = "Hello Loda";
 * str.toUpperCase(); // chúng ta gọi hamgf toUpperCase() thông qua toán tử "."
 * Mọi thứ trong đối tượng là khép kín, chúng ta phải gọi thông qua hàm public
 */

//class Girl1 {
//    String name;
//    int age;
//    int atk;
//    int agi;
//    int def;
//    // ... Và 1000 thuộc tính khác
//
//    public static void main(String[] args) {
//        Girl1 girl = new Girl1();
//        // Chúng ta thường phải nhớ tên thuộc tính để gọi nó ra
//        girl.name = "Ngoc Trinh";
//
//        // Giá sử class này có 100 thuộc tính là String.
//        // Bạn muốn set giá trị của tất cả trường String là "Ngoc Trinh"
//        // Bạn sẽ rất bối rối vs việc gọi từng thuộc tính bằng việc ".{tên thuộc tính}" như này.
//
//        // Có cách nào cho code duyệt tìm toàn bộ thuộc tính, cái nào là String thì đổi nó thành "Ngoc Trinh"?
//    }
//}

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Java Reflection cho phép bạn đánh giá, sửa đổi cấu trúc và hành vi của một đối tượng tại thời gian chạy (runtime)
 * của chương trình. Đồng thời nó cho phép bạn truy cập vào các thành viên private (private member) tại mọi nơi trong
 * ứng dụng, điều này không được phép với cách tiếp cận truyền thống.
 */

@SuppressWarnings("deprecation")
@Deprecated
class Girl {
    private String name;

    public Girl() {

    }

    public Girl(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "name='" + name + '\'' +
                '}';
    }

}

class Main {
    public static void main(String[] args) throws Exception {
        Girl girl = new Girl(); // KHởi tạo đối tượng Girl
        Girl girl1 = new Girl();
        girl.setName("Ngoc trinh");

        // Lấy ra tất cả field của object
        // Chỉ để bạn xem ví dụ thôi, bỏ qua phần này nhé!
        for (Field field : girl.getClass().getDeclaredFields()) {
            System.out.println();
            System.out.println("Field: " + field.getName());
            System.out.println("Type: " + field.getType());
        }

        /**Lấy ra field
         * */
        // PHẦN CHÍNH
        Field nameField = girl.getClass().getDeclaredField("name"); // Lấy ra field có tên "name"
        // (nếu không tìm thấy, nó sẽ bắn NoSuchFieldException)
        nameField.setAccessible(true); // Cho phép truy cập tạm thời. (Vì nó đang là Private mà)

        // Bây giờ cái "nameField" đại diện cho thuộc tính "name" của mọi object có class Girl.
        nameField.set(girl, "Bella"); // thay giá trị mới của `girl` bằng nameField.
        nameField.set(girl1, "Hà Vy");

        System.out.println(girl1);
        System.out.println(girl);

        /**Lấy ra method
         * */
        // Lay ra method ten la setName va co 1 tham so truyen vao -> => chính là: setName(String name)
        Method methodSetName = girl.getClass().getDeclaredMethod("setName", String.class);
        //bây giờ methodSetName sẽ đại diện cho phương thức "setName" của mọi object có class Girl

        Girl girl2 = new Girl();
        methodSetName.invoke(girl2, "Thu Uyên");
        System.out.println(girl2);

        /**Lấy ra contructor*/
        Class<Girl> girlClass = Girl.class;
        System.out.println("Class: " + girlClass.getSimpleName());
        //Lấy toàn bộ contructors của class
        System.out.println("Contructor: " + Arrays.toString(girlClass.getConstructors()));

        try {
            //Tạo ra 1 object Girl từ class. (Khởi tạo không tham số)
            Girl girl3 = girlClass.newInstance();
            System.out.println("Girl3: " + girl3);

            //Lấy ra hàm constructor với tham số là 1 string
            //Chính là -> public Girl(String name)
            Constructor<Girl> girlConstructor = girlClass.getConstructor(String.class);
            Girl girl4 = girlConstructor.newInstance("Hello");
            System.out.println("Girl4: " + girl4);
        } catch (Exception e) {
            e.printStackTrace();
            //Exception xảy khi constructor không tồn tại hoặc tham số truyền vào không đúng
        }

        /**Láy ra Annotation trên Field, Method, Class*/

        Class<Girl> girlClass1 = Girl.class;
        System.out.println("Class: " + girlClass1.getSimpleName());//Lấy ra tên của class
        for (Annotation annotation : girlClass1.getDeclaredAnnotations()) {
            System.out.println("Annotation: " + annotation.annotationType());//Lấy ra tên các Annotation trên class này
        }

        for (Method method: girlClass1.getMethods()) {
            System.out.println("\nMethod: " + method.getName());//Tên method
            for (Annotation annotation : method.getAnnotations()) {
                System.out.println("Annotation: " + annotation.annotationType());// Lấy ra tên các Annatation trên method này

            }

        }


    }
}

// Output:
// Field: name
// Type: class java.lang.String
// Girl{name='Bella'}
public class JavaReflection {

}
