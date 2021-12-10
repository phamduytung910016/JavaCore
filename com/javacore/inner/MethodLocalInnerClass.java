package com.javacore.inner;


/**
 * Class bên trong 1 phương thức chỉ có thể truy xuất bên trong phương thức. Bên ngoài phương thức
 * thì class đó không tồn tại.
 * */
class Employee{
    public void luong(){
        class Worker{
            private  String ten;
            public void luong(){
                System.out.println("Lương công nhân");
            }
        }
    }
}

public class MethodLocalInnerClass {
}
