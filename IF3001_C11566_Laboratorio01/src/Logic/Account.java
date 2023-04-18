package Logic;

public abstract class Account {
    
    private String accountNumber;
    private Client client;
    private double balance;

    public Account() {
    }

    public Account(String accountNumber, Client client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public abstract double interestCalculation();
    public abstract void withdraw(double money);
    public abstract void deposit(double money);
    
    public void sinpe(double money, Account account){
        
        if(money > this.getBalance())
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
        else{
            this.setBalance(this.getBalance() - money);
            account.setBalance(account.getBalance() + money);
            System.out.println("YOU HAVE TRANSFERED: " + money + " TO: " + account.getClient().getName() + " SUCCESSFULLY");
        }
    }
    
    public String toString(){
        
        String info = " \n \n ACCOUNT INFORMATION:";
        info+= "\n ACCOUNT NUMBER: " + this.getAccountNumber();
        info+= "\n BALANCE: "+ this.getBalance();
        info+= "\n ACCOUNT: "+ this.getClient().toString();
        
        return info;
    }
}