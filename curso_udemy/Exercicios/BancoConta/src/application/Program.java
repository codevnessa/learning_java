package application;

import entities.Account;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        System.out.print("Enter account name: ");
        sc.nextLine();
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (Y/N)? ");
        char response = sc.next().charAt(0);
        if ('y' == response){
            System.out.print("Enter the inicial deposit value: ");
            double initialDeposit =  sc.nextDouble();
            account = new Account(number, initialDeposit, holder);
        }else{
            account = new Account(number, holder);
        }
        System.out.println();
        System.out.println("Account Data");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter Deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);
        System.out.println("Updated Deposit Value: ");
        System.out.println(account);

        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);
        System.out.println("Updated withdraw Value: ");
        System.out.println(account);

        sc.close();
    }
}
