package Logic;

import java.util.Date;

public class SavingAccount extends Account{
    
    private Date date;
    private int monthlyTerm;
    private float interest;

    public SavingAccount() {
    }

    public SavingAccount(Date date, int monthlyTerm, float interest, String accountNumber, Logic.Client client, double balance) {
        super(accountNumber, client, balance);
        this.date = date;
        this.monthlyTerm = monthlyTerm;
        this.interest = interest;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMonthlyTerm() {
        return monthlyTerm;
    }

    public void setMonthlyTerm(int monthlyTerm) {
        this.monthlyTerm = monthlyTerm;
    }

    public float getInterest() {
        return interest;
    }

    public void setInterest(float interest) {
        this.interest = interest;
    }
    
    @Override
    public double interestCalculation() {
        double totalInterests;
        
        totalInterests = this.getMonthlyTerm()
                *this.getInterest()
                *this.getBalance();
        return this.getBalance() + totalInterests;
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
    
    public String toString(){
        String info = "\n SAVING ACCOUNT DETAILS: \n";
        info += "\n Monthly Term: " + this.getMonthlyTerm();
        info += "\n Saving StartDate: " + this.getDate();
        info += "\n Interest: " + this.getInterest();
        info += "\n Balance + interest: " + this.interestCalculation();
        return super.toString() + info;
    }
    
}