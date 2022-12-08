public class Client {
    public static void main(String[] args) {
        // Create a new BankFacade
        BankFacade John = new BankFacade(12345, 1000); // 1000
        BankFacade Noland = new BankFacade(54321, 500); // 500

        // Use the BankFacade to deposit and withdraw money from the account
        try {
            John.deposit(500);
            System.out.println(John.getBalance()); // 1500
//            John.withdraw(200);
//            System.out.println(John.getBalance()); // 1300
//
//            // What if he wants to transfer money to Noland?
//            John.transfer(John.getAccount(), Noland.getAccount(), 300);
//            System.out.println(John.getBalance()); // 1000
//
//            System.out.println(Noland.getBalance()); // 800
//            // What if Noland tries to withdraw an amount greater than his balance?
//            Noland.withdraw(1000);
//            System.out.println(Noland.getBalance()); // Insufficient funds
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
