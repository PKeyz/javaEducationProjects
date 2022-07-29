package bankingApplication1;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("NewCustomer","strangeID");

        bankAccount.showMenu();
    }
}