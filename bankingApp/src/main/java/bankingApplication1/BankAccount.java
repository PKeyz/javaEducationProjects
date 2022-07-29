package bankingApplication1;
import java.util.Scanner;

public class BankAccount {
    int balance;
    int previousTransaction;
    String customerName;
    String customerId;
    boolean exit = false;

    public BankAccount(String customerName, String customerID) {
        this.customerName = customerName;
        this.customerId = customerID;
    }

    //no credits given, only positive values

    public void deposit(int amount) {
        if (amount >= 0) {
            balance += amount;
            previousTransaction = amount;
        }
    }

    public void withdraw(int amount) {
        if (amount >= 0) {
            balance -= amount;
            previousTransaction -= amount;
        }
    }

    public void getPreviousTransaction() {
        if (previousTransaction > 0) {
            System.out.println("Deposited: " + previousTransaction);
        }
        if (previousTransaction < 0) {
            System.out.println("Withdrawn: " + Math.abs(previousTransaction));
        } else {
            System.out.println("No transaction occured.");
        }
    }

    public void showMenu() {
        char option;
        Scanner scanner = new Scanner(System.in);

        System.out.println("*********************************");
        System.out.println("Welcome " + customerName);
        System.out.println("Your ID is " + customerId);
        System.out.println('A' + " Check Balance");
        System.out.println('B' + " Deposit Money");
        System.out.println('C' + " Withdraw Money");
        System.out.println('D' + " Show previous Transaction");
        System.out.println('E' + " Exit");
        System.out.println("*********************************");
        System.out.println("\n");
        while (!exit) {
            System.out.println("***************");
            System.out.println("Enter an Option");
            System.out.println("***************");

            option = scanner.next().charAt(0);

            System.out.println("\n");

            switch (option) {
                case 'A':
                    System.out.println("*********************************");
                    System.out.println("Balance: " + balance);
                    System.out.println("\n");
                    System.out.println("*********************************");
                    break;

                case 'B':
                    System.out.println("*********************************");
                    System.out.println("Enter amount to deposit: ");
                    System.out.println("*********************************");

                    int amount2 = scanner.nextInt();
                    deposit(amount2);

                    System.out.println("\n");
                    break;

                case 'C':
                    System.out.println("*********************************");
                    System.out.println("Enter an amount to withdraw: ");
                    int amount3 = scanner.nextInt();
                    withdraw(amount3);
                    System.out.println("*********************************");
                    System.out.println("\n");
                    break;

                case 'D' :
                    System.out.println("*********************************");
                    getPreviousTransaction();
                    System.out.println("*********************************");
                    System.out.println("\n");
                    break;

                case 'E':
                    System.out.println("*********************************");
                    System.out.println("Exiting Account");
                    System.out.println("*********************************");
                    System.out.println("\n");
                    exit = true;
                    break;
                default :
                    System.out.println("*********************************");
                    System.out.println("Please enter a valid option, or exit.\n" + "If you want to quit the application press <<E>>");
                    System.out.println("*********************************");
                    System.out.println("\n");
                    break;
                }
            }


        }
    }

