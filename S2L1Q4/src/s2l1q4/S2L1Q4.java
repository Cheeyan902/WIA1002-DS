package s2l1q4;

import java.util.Date;
import java.util.ArrayList;

class Account1{
    
    private int id = 0;
    private String name = "";
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;
    private ArrayList <Transaction> transaction;
    
    public Account1(){
        dateCreated = new Date();
        transaction = new ArrayList <> ();
    }
    
    public Account1(int id, String name, double balance, double interest){
        this.id = id;
        this.name = name;
        this.balance = balance;
        this.annualInterestRate = interest;
        dateCreated = new Date();
        transaction = new ArrayList <> ();
    }
    
     public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
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
        Transaction trans = new Transaction('W', amount, balance, "Withdraw");
        transaction.add(trans);
    }
    
    public void deposit(double amount){
        balance += amount;
        Transaction trans = new Transaction('D', amount, balance, "Deposit");
        transaction.add(trans);
    }

    public ArrayList <Transaction> getTransactions(){
        return transaction;
    }
}

class Transaction{
    
    private double amount;
    private double balance;
    private Date date;
    private char type;
    private String description;
    
    public Transaction(char type, double amount, double balance, String description){
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }
    
    public Date getDate() {
        return date;
    }

    public char getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getDescription() {
        return description;
    }
}

public class S2L1Q4 {
    
    public static void main(String[] args) {
        
        Account1 sc = new Account1(1122, "George", 1000, 1.5);
        sc.deposit(30);
        sc.deposit(40);
        sc.deposit(50);
        sc.withdraw(5);
        sc.withdraw(4);
        sc.withdraw(2);
        System.out.println();
        System.out.println("Account Summary: ");
        System.out.println("Account holder: " + sc.getName());
        System.out.println("Interest rate: " + sc.getAnnualInterestRate());
        System.out.printf("Final Balance: RM %.2f\n",sc.getBalance());
        System.out.printf("%-35s%-5s%-10s%-14s%-15s\n", "Date", "Type", "Amount", "Balance", "Description");
        for (Transaction trans : sc.getTransactions()) {
            System.out.printf("%-35s%-5s%-10.2f%-14.2f%-15s\n", trans.getDate(), trans.getType(), trans.getAmount(), trans.getBalance(), trans.getDescription());
        }
    }
    
}
