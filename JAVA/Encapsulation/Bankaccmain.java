package Encapsulation;
//int this code we are using getter and setter method with encapsulation concept in java.

class BankAccount {

    private int balance;

    // Setter: Deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid amount");
        }
    }

    // Getter: Return balance
    public int getBalance() {
        return balance;
    }

    // Setter: Withdraw money
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount");
        } else if (amount > balance) {
            System.out.println("Insufficient funds");
        } else {
            balance = balance - amount;
        }
    }
}

public class Bankaccmain {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        BankAccount b2 = new BankAccount();

        b1.deposit(1000);
        b2.deposit(1000);

        System.out.println(b1.getBalance());
        System.out.println(b2.getBalance());

        b2.withdraw(100);
        System.out.println(b2.getBalance());
    }
}

