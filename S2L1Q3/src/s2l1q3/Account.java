package s2l1q3;

import java.util.Date;
public class Account {
    
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    
    public Account(){
        this.dateCreated = new Date();
    }
    
    public Account(int id, double balance, double interest){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = interest;
        this.dateCreated = new Date();
    }
    
    public int getId(){
        return id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    public double getAnnualInterestrate(){
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate = annualInterestRate;
    }
    
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public double getMonthlyInterestRate(){
        return annualInterestRate / 12;
    }
    
    public double getMonthlyInterest(){
        return balance * getMonthlyInterestRate() / 100;
    }
    
    public void withdraw(double amount){
        balance -= amount;
    }
    
    public void deposit(double amount){
        balance += amount;
    }
    
    public static void main(String[] args) {
        Account sc = new Account(1122, 2000, 4.5);
        sc.withdraw(2500);
        sc.deposit(3000);
        System.out.printf("Balance: RM %.2f\n", sc.getBalance());
        System.out.println("Monthly Interest: " + sc.getMonthlyInterest() + " %");
        System.out.println("Date Created: " + sc.getDateCreated());
    } 
}