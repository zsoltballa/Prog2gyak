
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Account {
    private int id;
    private double balance;
    private static double annualRate=10;
    private Date dateCreated;

    public Account() 
    {
        this. id=0;
        this.balance=0;
        this.dateCreated= new Date();
    }

    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
        this.dateCreated= new Date();
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public static double getAnnualRate() {
        return annualRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static void setAnnualRate(double annualRate) {
        Account.annualRate = annualRate;
    }
    
    public static double getMonthlyIR()
    {
        return annualRate/12;
    }
    
    public void withdraw(int mennyit)
    {
        this.balance=this.balance-mennyit;
    }
    
    public void deposit(int mennyit)
    {
        this.balance=this.balance+mennyit;
    }
    
}
