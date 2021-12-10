package com.javamidle;


/**-----------------------------Nguyên nhân-------------------------------
 *
 * Các hàm xây dựng constructor trong Java được sử dụng để tạo đối tượng và có thể lấy các tham số cần thiết
 * để tạo đối tượng. Vấn đề khi 1 đối tượng có thể được tạo ra nhiều tham số (param), mốt số có thể là bắt buộc
 * và 1 số khác có thể là tùy chọn tùy theo từng yêu cầu của người dùng, tùy vào hoàn cảnh của ứng dụng. Chúng
 * ta có thể tạo ra nhiều constructor theo từng nhu cầu hoặc gán giá trị null cho các param không cần thiết. Tuy
 * nhiên, code rất khó đọc, khó bảo trì, người sử dụng có thể gán nhầm giá trị nếu một loạt các thâm số có cùng
 * kiểu. Chúng ta cũng có thể sử dụng một giải pháp khác là sử dụng setter() để thay thế cho constructor. Tuy nhiên,
 * nếu muốn đối tượng này là immutable thì không thể.
 * */


/**---------------------------Builder pattern-----------------------------------
 * Là 1 trong những Creational pattern. Builder pattern là mẫu thiết kế đối tượng được tạo ra để xây dựng một đối
 * tượng phức tạp bằng cách sử dụng các đối tượng đơn giản và sử dụng tiếp cần từng bước, việc xây dựng các đối
 * tượng độc lập với các đối tượng khác.
 *
 * Một builder gốm các thành phần cơ bản sau:
 *  + Product: đại diện cho đối tượng cần tạo, đói tượng này phức tạp, có nhiều thuộc tính.
 *  + Builder: là abstract class hoặc interface khai báo phương thức tạo đối tượng .
 *  + ConcreteBuilder: kế thừa Builder và cài đặt chi tiết cách tạo ra đối tượng. Nó sẽ xác định và nắm giữ các thể
 *  hiện mà nó tạo ra, đồng thời nó cũng cung cấp phương thức để trả các thể hiện mà nó đã tạo ra trước đó.
 *  + Director/Client: là nơi sẽ gọi tới Builder để tạo ra đối tượng
 *
 * Thông thường, những trường hợp đơn giản người ta sẽ gộp luôn Builder và ConcreteBuilder thành static nested
 * class bên trong Product
 * */


//Ví dụ về Builder : quản lý menu trong thực đơn
enum BreadType {
    SIMPLE, OMELETTE, FRIED_EGG, GRILLED_FISH, PORK, BEEF,
}

enum  OrderType {
    ON_SITE, TAKE_AWAY;
}

enum  SauceType {
    SOY_SAUCE, FISH_SAUCE, OLIVE_OIL, KETCHUP, MUSTARD;
}

enum  VegetableType {
    SALAD, CUCUMBER, TOMATO
}

class Order {
    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    public Order(OrderType orderType, BreadType breadType,
                SauceType sauceType, VegetableType vegetableType) {
        super();
        this.orderType = orderType;
        this.breadType = breadType;
        this.sauceType = sauceType;
        this.vegetableType = vegetableType;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderType=" + orderType +
                ", breadType=" + breadType +
                ", sauceType=" + sauceType +
                ", vegetableType=" + vegetableType +
                '}';
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public BreadType getBreadType() {
        return breadType;
    }

    public SauceType getSauceType() {
        return sauceType;
    }

    public VegetableType getVegetableType() {
        return vegetableType;
    }
}

interface OrderBuilder{
    OrderBuilder orderType(OrderType orderType);
    OrderBuilder orderBread(BreadType breadType);
    OrderBuilder orderSauce(SauceType sauceType);
    OrderBuilder orderVegetable(VegetableType vegetableType);

    Order build();
}

class FastFoodOrderBuilder implements OrderBuilder {

    private OrderType orderType;
    private BreadType breadType;
    private SauceType sauceType;
    private VegetableType vegetableType;

    @Override
    public OrderBuilder orderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    @Override
    public OrderBuilder orderBread(BreadType breadType) {
        this.breadType = breadType;
        return this;
    }

    @Override
    public OrderBuilder orderSauce(SauceType sauceType) {
        this.sauceType = sauceType;
        return this;
    }

    @Override
    public OrderBuilder orderVegetable(VegetableType vegetableType) {
        this.vegetableType = vegetableType;
        return this;
    }

    @Override
    public Order build() {
        return new Order(orderType, breadType, sauceType, vegetableType);
    }

}

class Client {

    public static void main(String[] args) {
        Order order = new FastFoodOrderBuilder()
                .orderType(OrderType.ON_SITE).orderBread(BreadType.OMELETTE)
                .orderSauce(SauceType.SOY_SAUCE).build();
        System.out.println(order);
    }
}


//Ví dụ về Builder
/**
 * Tạo một static nested class (đây được gọi là builder class) và copy tất cả các
 * tham số từ class bên ngoài vào. Chúng ta nên đặt tên của static nested class này
 * theo định dạng tên class + Builder. Ví dụ class là Computer thì builder class sẽ
 * là ComputerBuilder
 *
 * Class Builder có một hàm khởi tạo public với tất cả các thuộc tính bắt buộc.
 * Class Builder có các method setter cho các tham số tùy chọn.
 *  Cung cấp method build() trong Class Builder để trả về đối tượng mà client cần.
 * */
class Computer {

    // Builder Class
    public static class ComputerBuilder {
        // required parameters
        private String HDD;
        private String RAM;
        // optional parameters
        private boolean isGraphicsCardEnabled;
        private boolean isBluetoothEnabled;
        public ComputerBuilder(String hdd, String ram) {
            this.HDD = hdd;
            this.RAM = ram;
        }
        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }
        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        public Computer build() {
            return new Computer(this);
        }
    }

    // required parameters
    private String HDD;
    private String RAM;
    // optional parameters
    private boolean isGraphicsCardEnabled;
    private boolean isBluetoothEnabled;
    public String getHDD() {
        return HDD;
    }
    public String getRAM() {
        return RAM;
    }
    public boolean isGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }
    public boolean isBluetoothEnabled() {
        return isBluetoothEnabled;
    }
    private Computer(ComputerBuilder builder) {
        this.HDD = builder.HDD;
        this.RAM = builder.RAM;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }
    @Override
    public String toString() {
        return "Computer [HDD=" + HDD + ", RAM=" + RAM + ", isGraphicsCardEnabled=" + isGraphicsCardEnabled
                + ", isBluetoothEnabled=" + isBluetoothEnabled + "]";
    }

}

class DemoBuilderPattern {
    public static void main(String[] args) {
        // Using builder to get the object in a single line of code and
        // without any inconsistent state or arguments management issues
        Computer comp = new Computer.ComputerBuilder("500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();

        System.out.println(comp);
    }
}