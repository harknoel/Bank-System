public class BankTransfer {
    public void transfer(Account from, Account to, double amount) throws Exception {
        if (from == to) {
            throw new Exception("Cannot transfer money to the same account");
        }
        if (from.getBalance() < amount) {
            throw new Exception("Insufficient funds");
        }
        from.withdraw(amount);
        to.deposit(amount);
    }
}
