package Presentation;

import Logic.Account;
import java.util.Date;

public class TransactionLog {
    
    private int transactionId;
    private String event; // save-withdraw-sinpe...
    private Date date;
    private Account account;
    private double movement;
    
    private static int consecutive = 0; 
    
    public TransactionLog(){
        this.transactionId = ++consecutive;
    }//constructor 1

    public TransactionLog(String event, Account account, double movement) {
        this(); //constructor 1
        this.date = new java.util.Date();
        this.event = event;
        this.account = account;
        this.movement = movement;
    }//constructor 2

    public int getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public double getMovement() {
        return movement;
    }

    public void setMovement(double movement) {
        this.movement = movement;
    }

    public static int getConsecutive() {
        return consecutive;
    }

    public static void setConsecutive(int consecutive) {
        TransactionLog.consecutive = consecutive;
    }
    
    public String toString(){
        String info = "\n GENERAL BANK INFORMATION: ";
        info += "\n EVENT ID: " + this.getTransactionId();
        info += "\n EVENT TYPE: " + this.getEvent();
        info += "\n DATE: " + this.getDate();
        info += "\n MOVEMENT: " + this.getMovement();
        info += "\n AFFECTED ACCOUNT : " + this.getAccount().toString();
        
        return info;
    }
    
}