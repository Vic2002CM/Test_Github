package Logic;

import Logic.Account;
import java.util.ArrayList;

public class CommercialBank {
    
    private String name;
    private double balance;
    private ArrayList<Account> accounts;
    
    public CommercialBank(){ 
    }

    public CommercialBank(String name, double balance, ArrayList<Account> accounts) {
        this.name = name;
        this.balance = balance;
        this.accounts = accounts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(ArrayList<Account> accounts) {
        this.accounts = accounts;
    }
}