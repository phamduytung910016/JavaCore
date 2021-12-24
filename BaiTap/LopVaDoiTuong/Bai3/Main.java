package BaiTap.LopVaDoiTuong.Bai3;



import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);
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
                        System.out.printf("Trị giá: %15.2f \n", vehicle.getPrice());
                        System.out.printf("Thuế phải nộp: %15.2f \n ", vehicle.getTax());
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
}
