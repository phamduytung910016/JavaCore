package com.javamidle;

/**
 * Annotation (Chú thích) được sử dụng để chú thích trên một class, một trường (field) hoặc
 * một method để cung cấp hoặc bổ sung các thông tin. Nó hoàn toàn không ảnh hưởng tới code của bạn.
 * <p>
 * Annotation được sử dụng ở 3 dạng:
 * + Chú thích cho trình biên dịch (Compiler)
 * + Chú thích cho quá trình build
 * + Chú thích trong quá trình chạy chương trình (Runtime)
 * <p>
 * Annotation được sử dụng ở 3 dạng:
 * + Chú thích cho trình biên dịch (Compiler)
 * + Chú thích cho quá trình build
 * + Chú thích trong quá trình chạy chương trình (Runtime)
 * <p>
 * Annotation được sử dụng ở 3 dạng:
 * + Chú thích cho trình biên dịch (Compiler)
 * + Chú thích cho quá trình build
 * + Chú thích trong quá trình chạy chương trình (Runtime)
 */

/**
 * Annotation được sử dụng ở 3 dạng:
 *  + Chú thích cho trình biên dịch (Compiler)
 *  + Chú thích cho quá trình build
 *  + Chú thích trong quá trình chạy chương trình (Runtime)
 * */

//Khái báo Annotation

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.Optional;

/**Cách khai báo Annotation là sử dụng @interface
 * */
//    @interface JsonName{
//        String value();//Các giá trị trong @interface đều dạng hàm abstract , không tham số;
//    }
//Gọi ra và sử dụng

@JsonName(value = "super_man")
//Khai báo phạm vi cho Annotation
/**Chúng ta có thể quy định phạm vi sử dụng của Annotation bằng cách:
 * */
@Retention(RetentionPolicy.RUNTIME)//Tồn tại trong lúc chạy chương trình
@Target({ElementType.TYPE, ElementType.FIELD, ElementType.METHOD})//Được sử dụng trên class, interface,method, biến
@interface JsonName {
    String value();//Các giá trị trong @interface đều dạng hàm abstract , không tham số;
}

/**
 * @Retention: Dùng để chú thích MỨC ĐỘ TỒN TẠI của một annotation nào đó. Cụ thể có 3 mức nhận
 * thức tồn tại của vật được chú thích:
 *  1.RetentionPolicy.SOURCE: Tồn tại trên code ngườn, và không được bộ dịch (compiler) nhận ra.
 *
 *  2.RetentionPolicy.CLASS: Mức tồn tại được bộ dịch nhận ra, nhưng không được nhận biết bởi máy
 *  ảo tại thời điểm chạy (runtime).
 *
 *  3.RetentionPolicy.RUNTIME: Mức tồn tại lớn nhất, được bộ dịch (compiler) nhận biết, và máy ảo(jvm) cũng nhận
 *  ra khi chạy chương trình.
 * */

/**
 * @Target: Dùng để chú thích phạm vi sử dụng của 1 Annotation
 *  1.ElementType.TYPE - Cho phép chú thích trên Class, interface, enum, annotation.
 *  2.ElementType.FIELD - Cho phép chú thích trường (field), bao gồm cả các hằng số enum.
 *  3.ElementType.METHOD - Cho phép chú thích trên method.
 *  4.ElementType.PARAMETER - Cho phép chú thích trên parameter
 *  5.ElementType.CONSTRUCTOR - Cho phép chú thích trên constructor
 *  6.ElementType.LOCAL_VARIABLE - Cho phép chú thích trên biến địa phương.
 *  7.ElementType.ANNOTATION_TYPE - Cho phép chú thích trên Annotation khác
 *  8.ElementType.PACKAGE - Cho phép chú thích trên package.
 *
 * */
//Xử lý Annotation
//Bước 1 : Chú thích bất kỳ chỗ nào mong muốn

@JsonName(value = "super_man")
class SuperMan {
    //Không chú thich, thì sẽ coi như lấy tên là field là 'name' luôn
    private String name;

    @JsonName("date_of_birth")
    private LocalDateTime dateOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDateTime dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

}
//Bước 2: Viết class xử lý @JsonName:

public class TaoAnnotations {
    public static String toJson(Object object) throws IllegalAccessException {
        StringBuilder sb = new StringBuilder();//Dùng StringBuilder để tạo json từ class
        Class<?> clazz = object.getClass();
        JsonName jsonClassName = clazz.getDeclaredAnnotation(JsonName.class);// Lấy ra annotation @JsonName trên Class

        sb.append("{\n")
                .append("\t\"")
                //Lấy giá trị của Annotation, nếu annotation là null thì lấy tên Class để thay thế
                .append(Optional.ofNullable(jsonClassName).map(JsonName::value).orElse(clazz.getSimpleName()))
                .append("\": {\n"); //

        Field fields[] = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true); // Set setAccessible = true. De co the truy cap vao private field
            JsonName jsonFieldName = fields[i].getDeclaredAnnotation(JsonName.class); // get annotation tren field
            sb.append("\t\t\"")
                    // Lay gia tri cua Annotation, neu annotation la null thi lay ten field thay the
                    .append(Optional.ofNullable(jsonFieldName).map(JsonName::value).orElse(fields[i].getName())) // L
                    .append("\": ")
                    // Neu field la String hoac Object. thi append dau ngoac kep vao
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive() ? "\"" : "")
                    // Lay gia tri cua field
                    .append(fields[i].get(object))
                    // Neu field la String hoac Object. thi append dau ngoac kep vao
                    .append(fields[i].getType() == String.class || !fields[i].getType().isPrimitive()? "\"" : "")
                    // Nếu là field cuối cùng, thì không append dấu ","
                    .append(i != fields.length -1 ? ",\n" : "\n");
        }
        sb.append("\t}\n");
        sb.append("}");

        return sb.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        SuperMan superMan = new SuperMan(); // Tao doi tuong super man
        superMan.setDateOfBirth(LocalDateTime.now());
        superMan.setName("loda");

        String json =TaoAnnotations.toJson(superMan);
        System.out.println(json);
    }
}
