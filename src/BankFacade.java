// The BankFacade class is the facade for the banking system
public class BankFacade {
    // The account associated with the BankFacade
    private Account account;
    private BankTransfer transferSubsystem;

    // Constructor for the BankFacade class
    public BankFacade(int accountNumber, double balance) {
        this.account = new Account(accountNumber, balance);
        this.transferSubsystem = new BankTransfer();
    }

    public Account getAccount() {
        return account;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        this.account.deposit(amount);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) throws Exception {
        this.account.withdraw(amount);
    }

    // Method to get the current balance of the account
    public double getBalance() {
        return this.account.getBalance();
    }

    // Method to transfer an amount to another account
    public void transfer(Account from, Account to, double amount) throws Exception {
        if (from == to) {
            throw new Exception("Cannot transfer money to the same account");
        }
        if (this.transferSubsystem == null) {
            throw new Exception("Sender must be your account.");
        }
        transferSubsystem.transfer(from, to, amount);
    }
}
