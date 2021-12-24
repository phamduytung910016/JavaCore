package BaiTap.LopVaDoiTuong.Bai4;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        Account account = new Account(123456789, "Phạm Duy Tùng");
        Account account1 = new Account(699699699, "Đinh Hà Vy");
        bank.add(account);
        bank.add(account1);
        //        System.out.println(account);
//        account.toMature();
//        account.show();
//        account.withdraw();
//        account.show();
//        account.recharge();
//        account.show();
        long accoutNumber;
        System.out.println("Nhập số tài khoản cần chuyển: ");
        accoutNumber = sc.nextLong();
        ArrayList<Account> accounts = bank.getAccounts();
        Account accTransfered = null;
        for (Account a : accounts
        ) {
            if (a.getAccountNumber() == accoutNumber) {
                accTransfered = a;
                break;
            }
        }
        if (accTransfered == null) {
            System.out.println("Không tìm thấy tài khoản phù hợp");
        } else {
            account.transfers(accTransfered);
            account.show();
            accTransfered.show();
        }
    }
}
