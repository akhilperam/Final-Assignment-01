/*
 *
 4. Create a Java program that simulates a bank account. The program should allow
      users to deposit and withdraw money, check their balance.
 * 
 * 
 * 
 */
import java.util.Scanner;

public class QUESTION04 {
    private double balance;

    public QUESTION04() {
        balance = 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds. Cannot withdraw $" + amount + ".");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        QUESTION04 account = new QUESTION04();
        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        System.out.println("Welcome to the Bank Account Simulation!");

        while (isRunning) {
            System.out.println();
            System.out.println("Please select an option:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: $");
                    double withdrawalAmount = scanner.nextDouble();
                    account.withdraw(withdrawalAmount);
                    break;
                case 3:
                    System.out.println("Current balance: $" + account.getBalance());
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        System.out.println("Thank you for using the Bank Account Simulation!");
        scanner.close();
    }
}