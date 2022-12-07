public class Main {
    public static void main(String[] args) {
        // Create a new Account and a new BankFacade
        Account account = new Account(12345678, 1000);
        BankFacade bankFacade = new BankFacade(account);

        // Use the BankFacade to deposit and withdraw money from the account
        bankFacade.deposit(500);
        System.out.println(bankFacade.getBalance()); // 1500

        try {
            bankFacade.withdraw(1000);
            System.out.println(bankFacade.getBalance()); // 500
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}