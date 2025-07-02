package entities;

public class Bank {
    private int account;
    private String name;
    private double balance;

    public Bank(int account, String name){
        this.account = account;
        this.name = name;
    }

    public Bank(int account, String name, double firstDeposit){
        this.account = account;
        this.name = name;
        deposit(firstDeposit);
    }

    public int getAccount() {
        return account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value){
        balance += value;
    }

    public void take(double value){
        balance -= value + 5;
    }

    public String toString() {
        return String.format("Account %d, Holder: %s, Balance: $ %.2f", account, name, balance);
    }
}
