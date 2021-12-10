package com.javamidle;

/**
 * Dependency Injection là 1 phương pháp lập trình , là một thiết kế để bạn có được hiệu quả cao hơn khi code. Trước khi
 * phương pháp này ra đời, bạn vẫn code bình thường, nhưng bây giờ có rồi, đi theo nó sẽ giúp ích nhiều hơn cho việc lập
 * trình của bạn.
 *
 * */



//class Girl {
//    private Bikini outfit;// mỗi cô gái sẽ có 1 bộ bikini
//
//    public Girl() {
//        outfit = new Bikini();//khi khởi tạo 1 cô gái , bạn có thể cho cô ấy mặc đồ
//    }
//}

/**
 *  NOTE: Các class không nên phụ thuộc vào các kế thừa cấp thấp, mà nên phụ thuộc vào Abstraction(lớp trừu tượng).
 * */

//interface Outfit{
//    void wear();
//}
//
//class Bikini implements Outfit{
//    @Override
//    public void wear() {
//        System.out.println("Đã mặc bikini");
//    }
//}
//
//class Girl {
//    private Outfit outfit;// mỗi cô gái sẽ có 1 bộ bikini
//
//    public Girl() {
//        outfit = new Bikini();//khi khởi tạo 1 cô gái , bạn có thể cho cô ấy mặc đồ
//    }
//}

/**
 * Chúng ta mới chỉ Abstract hóa thuộc tính của girl mà thôi, còn thực tế, Girl vẫn đang bị gắn vơi 1 bộ đồ Bikini duy nhất
 *
 * */

interface Outfit{
    void wear();
}

class Bikini implements Outfit{
    @Override
    public void wear() {
        System.out.println("Đã mặc bikini");
    }
}

class Girl {
    private Outfit outfit;// mỗi cô gái sẽ có 1 bộ bikini

//    public Girl() {
//        outfit = new Bikini();//khi khởi tạo 1 cô gái , bạn có thể cho cô ấy mặc đồ
//    }

    public Girl(Outfit anything) {
        this.outfit = anything;//Tạo ra 1 cô gái, với 1 món đồ tùy biến
        //Không bị phụ thuộc quá nhiều vào thời điểm khởi tạo, hay code
    }
}



/**
 * Dependency Injection là việc các Object nên phụ thuộc vào các Abstract Class và thể hiện chi tiết
 * của nó sẽ được inject vào đối tượng lúc runtime
 * */


public class DependencyInjection {
    public static void main(String[] args) {
        Outfit bikini = new Bikini();//tạo ra đối tượng bikini ở ngoài đối tượng
        Girl ngocTrinh = new Girl(bikini);//Mặc nó vào cho cô gái khi tạo ra cô ấy.
    }
}
