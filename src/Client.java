public class Client {
    public static void main(String[] args) {
        // Create a new BankFacade
        BankFacade client1 = new BankFacade(12345678, 1000);
        BankFacade client2 = new BankFacade(54321, 500);

        // Use the BankFacade to deposit and withdraw money from the account
        client1.deposit(500);
        System.out.println(client1.getBalance()); // 1500

        try {
            client1.withdraw(1000);
            System.out.println(client1.getBalance()); // 500
            client1.transfer(client1.getAccount(), client2.getAccount(), 500);
            System.out.println(client1.getBalance());
            System.out.println(client2.getBalance());
            client2.transfer(client1.getAccount(), client2.getAccount(), 500);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
}
