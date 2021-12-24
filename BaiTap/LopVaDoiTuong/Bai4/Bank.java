package BaiTap.LopVaDoiTuong.Bai4;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<Account>();
    }

    public void add(Account account){
        this.getAccounts().add(account);
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}
