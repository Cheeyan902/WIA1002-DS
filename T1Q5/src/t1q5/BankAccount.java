package t1q5;

public class BankAccount implements Account{
    
    private int balance;

    public BankAccount(int balance) {
        this.balance = balance;
    }

    @Override
    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    @Override
    public boolean withdraw(int amount) {
        if (balance - amount < 0) {
            return false;
        } else {
            balance -= amount;
            return true;
        }
}
}

