package BaiTap.LopVaDoiTuong.Bai3;

public class Vehicle {
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
