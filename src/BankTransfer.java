// The BankTransfer class is for transferring money
public class BankTransfer {
    // Method to transfer money
    public void transfer(Account from, Account to, double amount) throws Exception {
        if (from.getBalance() < amount) {
            throw new Exception("Insufficient funds");
        }
        from.withdraw(amount);
        to.deposit(amount);
    }
}
