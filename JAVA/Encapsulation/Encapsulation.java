package Encapsulation;
// using encapsulation in java.

class BankAccount {

    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposite(double amount) {
        balance = balance + amount;
    }

    public void withdrawl(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    public double getBalance() {
        return balance;
    }
}

class Encapsulation {

    public static void main(String[] args) {
        BankAccount B1 = new BankAccount("592006", 500000);
        B1.deposite(1000);
        B1.withdrawl(2000);
        System.out.println("Balance is:" + B1.getBalance());
    }
}

