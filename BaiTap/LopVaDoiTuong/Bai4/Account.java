package BaiTap.LopVaDoiTuong.Bai4;

import java.util.Scanner;

public class Account {
    public  Scanner sc = new Scanner(System.in);
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

    public void recharge() {
        Scanner sc = new Scanner(System.in);
        double money;
        do {
            System.out.println("Nhập số tiền cần nạp: ");
            money = sc.nextDouble();
            if(money <= 0){
                System.out.println("Số tiền nạp không hợp lệ,mời bạn nhập lại");
            }
        } while (money <= 0);

        this.setAccountBalance(this.getAccountBalance() + money);
        System.out.printf("Số dư tài khoản: %20.2f", this.getAccountBalance());
        System.out.println();
        return;
    }

    public void withdraw() {

        double money;
        do {
            System.out.println("Nhập số tiền cần rút: ");
            money = sc.nextDouble();
            if (this.getAccountBalance() < (money + money * 0.05)) {
                System.out.println("Tài khoản không đủ để thực hiện yêu cầu");
                System.out.println("Mời bạn nhập lại: ");
            }
        } while (this.getAccountBalance() < (money + money * 0.05));
        double newBalance = this.getAccountBalance() - (money + money * 0.05);
        this.setAccountBalance(newBalance);
        System.out.printf("Số dư tài khoản: %20.2f", newBalance);
        System.out.println();
        return;
    }


    public void toMature() {
        double newBalance = this.getAccountBalance() + this.getAccountBalance() * this.interestRate;
        this.setAccountBalance(newBalance);
        System.out.println("Đáo hạn thành công");
        System.out.printf("Số dư tài khoản là: %20.2f \n", this.getAccountBalance());
        return;
    }

    public void transfers(Account accTransfered ){
        double moneyTransfer ;
        do {
            System.out.println("Nhập số tiền cần chuyển: ");
            moneyTransfer = sc.nextDouble();
            if(this.getAccountBalance() <= (moneyTransfer + moneyTransfer * 0.05)){
                System.out.println("Tài khoản không đủ để thực hiện");
                System.out.println("Mời bạn nhập lại");
            }
        }while (this.getAccountBalance() <= (moneyTransfer + moneyTransfer * 0.05));
        this.setAccountBalance(this.getAccountBalance() - moneyTransfer - moneyTransfer * 0.05);
        accTransfered.setAccountBalance(accTransfered.getAccountBalance() + moneyTransfer);
        System.out.println("Giao dịch thành công");
    }


    @Override
    public String toString() {
        return "Account{" +
                "interestRate = " + interestRate +
                ", accountNumber = " + accountNumber +
                ", name = " + name + '\'' +
                ", accountBalance = " + this.accountBalance +
                '}';
    }

    public void show() {
        System.out.print("Account{" +
                "interestRate = " + interestRate +
                ", accountNumber = " + accountNumber +
                ", name = " + name);
        System.out.printf(", accountBalance = %20.2f \n", accountBalance);

    }
}
