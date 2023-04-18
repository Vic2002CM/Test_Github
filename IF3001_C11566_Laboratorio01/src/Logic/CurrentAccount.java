package Logic;

public class CurrentAccount extends Account{
    
    private float interest;
    
    public CurrentAccount(){
    }

    public CurrentAccount(float interest, String accountNumber, Client client, double balance) {
        super(accountNumber, client, balance);
        this.interest = interest;
    }

    @Override
    public double interestCalculation() {
        double totalInterests;
        
        totalInterests = this.getBalance()
                *this.getInterest() / 12;
        return totalInterests;
    }

    @Override
    public void withdraw(double money) {
        super.setBalance(this.getBalance() - money);
        if(money > this.getBalance())
            System.out.println("YOU DON'T HAVE ENOUGH MONEY");
        else{
            super.setBalance(this.getBalance() - money);
            System.out.println(money + " HAS BEEN WITHDRAWN");
        }
    }

    @Override
    public void deposit(double money) {
        super.setBalance(this.getBalance() + money);
        System.out.println("Have deposited " + money);
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
}