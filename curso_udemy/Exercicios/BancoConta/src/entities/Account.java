package entities;

public class Account {
    private int number;
    private double balance;
    private String holder;

    public Account(int number, String holder){
        this.number = number;
        this.holder = holder;

    }

    public Account(int number, double initialDeposit, String holder){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);

    }

    public void set(double balance) {
        this.balance = balance;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void getNumber(int number) {
        this.number = number;
    }
    
    public void setHolder(String holder) {
        this.holder = holder;
    }
    
    public void getHolder(String holder) {
        this.holder = holder;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public String toString(){
        return "Account number: " + number
                + "\nHolder " + holder
                + "\nBalance: $" + String.format("%.2f", balance);
    }
}

