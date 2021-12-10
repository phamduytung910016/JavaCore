package BaiTap;


//Class và đối tượng

import java.util.Scanner;

/**
 * Quản lý việc theo dõi đăng ký xe của người dân
 */

class Vehicle {
    private String nameOfOwner;
    private String typeOfCar;
    private int capacity;
    private double price;
    private double tax;

    public Vehicle() {
    }

    public Vehicle(String nameOfOwner, String typeOfCar,
                   int capacity, double price) {
        this.nameOfOwner = nameOfOwner;
        this.typeOfCar = typeOfCar;
        this.capacity = capacity;
        this.price = price;
    }

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        this.nameOfOwner = nameOfOwner;
    }

    public String getTypeOfCar() {
        return typeOfCar;
    }

    public void setTypeOfCar(String typeOfCar) {
        this.typeOfCar = typeOfCar;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTax() {
        return tax;
    }

    public void setTax() {
        if (this.getCapacity() < 100) {
            this.tax = this.getPrice() / 100;
        } else if (100 <= this.getCapacity() && this.getCapacity() <= 200) {
            this.tax = this.getPrice() * 3 / 100;
        } else {
            this.tax = this.getPrice() * 5 / 100;
        }
    }

}


class Account{

    private final double interestRate = 0.035;
    private long accountNumber;
    private String name;
    private double accountBalance;

    public Account() {
    }

    public Account(long accountNumber, String name,
                   double accountBalance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.accountBalance = accountBalance;
    }

    public Account(long accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.setAccountBalance(50);
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void recharge(double money){
        this.setAccountBalance(this.getAccountBalance() + money);
    }

    public void withdraw(double money){
        if(this.getAccountBalance() < (money + money * 0.05)){
            System.out.println("Tài khoản không đủ để thực hiện yêu cầu");
            return;
        }else if(this.getAccountBalance() > (money + money * 0.05)) {
            double newBalance = this.getAccountBalance() - (money + money * 0.05);
            this.setAccountBalance(newBalance);
            System.out.printf("Số dư tài khoản: %20.00f" , newBalance);
            System.out.println();
            return;
        }
    }

    public void toMature(){
        double newBalance = this.getAccountBalance() + this.getAccountBalance() * this.interestRate;
        this.setAccountBalance(newBalance);
        System.out.println("Đáo hạn thành công");
        System.out.printf("Số dư tài khoản là: %10.2f \n" , this.getAccountBalance());
        return;
    }

    @Override
    public String toString() {
        return "Account{" +
                "interestRate = " + interestRate +
                ", accountNumber = " + accountNumber +
                ", name = " + name + '\'' +
                ", accountBalance = " + accountBalance +
                '}';
    }
}


public class BaiTapOOP {
    public static Scanner sc = new Scanner(System.in);
    //Quản lý đăng ký xe
    /**


    public static void nhap() {
        System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe 2 , xe3");
        System.out.println("2. Xuất bảng kê khai tiền thuế trước ba của các xe");
        System.out.println("3. Thoát");
        System.out.println("Chọn công việc: ");
    }

    public static void option(int input, Vehicle[] vehicles) {

        do {
            switch (input) {
                case 1: {
                    for (int i = 0; i < vehicles.length; i++) {

                        System.out.println("Nhập thông tin xe thứ " + i);
                        System.out.println("Tên chủ xe: ");
                        String name = sc.nextLine();
                        sc.nextLine();
                        vehicles[i].setNameOfOwner(name);
                        System.out.println("Loại xe : ");
                        String typeOfCar = sc.nextLine();
                        vehicles[i].setTypeOfCar(typeOfCar);
                        System.out.println("Dung tích: ");
                        int cap = sc.nextInt();
                        vehicles[i].setCapacity(cap);
                        System.out.println("Trị giá: ");
                        double price = sc.nextDouble();
                        vehicles[i].setPrice(price);
                        vehicles[i].setTax();
                        System.out.println();
                    }
                    System.out.println("Mời bạn chọn tiếp :");
                    nhap();
                    input = sc.nextInt();
                    break;

                }
                case 2: {
                    for (Vehicle vehicle : vehicles
                    ) {
                        System.out.println("Tên chủ xe: " + vehicle.getNameOfOwner());
                        System.out.println("Loại xe : " + vehicle.getTypeOfCar());
                        System.out.println("Dung tích:  " + vehicle.getCapacity());
                        System.out.printf("Trị giá: %15.2f \n" , vehicle.getPrice());
                        System.out.printf("Thuế phải nộp: %15.2f \n " , vehicle.getTax());
                        System.out.println();
                    }
                    System.out.println("Mời bạn chọn tiếp");
                    nhap();
                    input = sc.nextInt();
                    break;
                }
                case 3:
                    break;

            }
        } while (input != 3);
    }


    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[3];
        for (int i = 0; i < vehicles.length; i++) {
            vehicles[i] = new Vehicle();
        }
        int input ;
        nhap();
        input = sc.nextInt();
        option(input , vehicles);


    }
     */

    //Quản lý lưu trữ thông tin của tài khoản ngân hàng
//    public static void main(String[] args) {
//        Account account = new Account(123456789, "Phạm Duy Tùng");
//        System.out.println(account.toString());
//        account.toMature();
//        account.withdraw(20);
//        System.out.println(account.toString());
//
//
//    }


}
