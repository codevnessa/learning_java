package app;

import model.BankAccount;
import utils.InputUtils;

public class MainApp {
    public static void main(String[] args) {
        // Collect account details
        int accountNumber = InputUtils.readInt("Enter account number: ");
        String accountHolder = InputUtils.readString("Enter account holder name: ");
        char response = InputUtils.readChar("Do you want to make an initial deposit? (y/n): ");

        BankAccount account;

        if (response == 'y' || response == 'Y') {
            double initialDeposit = InputUtils.readDouble("Enter the initial deposit amount: ");
            account = new BankAccount(accountNumber, accountHolder, initialDeposit);
        } else {
            account = new BankAccount(accountNumber, accountHolder);
        }

        // Display initial account details
        System.out.println("\nInitial account details:");
        account.displayDetails();

        // Make a deposit
        double depositAmount = InputUtils.readDouble("\nEnter the deposit amount: ");
        account.deposit(depositAmount);
        System.out.println("\nAccount details after deposit:");
        account.displayDetails();

        // Make a withdrawal
        double withdrawalAmount = InputUtils.readDouble("\nEnter the withdrawal amount: ");
        account.withdraw(withdrawalAmount);
        System.out.println("\nAccount details after withdrawal:");
        account.displayDetails();

        // Close the scanner
        InputUtils.closeScanner();
    }
}