// The Account class represents a bank account
public class Account {
    // The account number and current balance of the account
    private int accountNumber;
    private double balance;

    // Constructor for the Account class
    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.balance += amount;
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws Exception {
        if (amount > this.balance) {
            throw new Exception("Insufficient funds");
        }
        this.balance -= amount;
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return this.balance;
    }
}