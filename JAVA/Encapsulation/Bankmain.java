package Encapsulation;
// this code is about bank account with the help of class and object in java.

class Bank {

    String name;
    int accountno;
    int accountid;
    int balance;
    int deposite;

    float deposite() {
        System.out.println("New balance: " + balance + deposite);
        return balance + deposite;
    }
}

class Bankmain {

    public static void main(String[] args) {
        Bank b1 = new Bank();
        b1.name = "Ananya";
        b1.accountno = 25068;
        b1.accountid = 987654;
        b1.balance = 1000;
        b1.deposite = 10;
        System.out.println("name:" + b1.name);
        System.out.println("account:" + b1.accountno);
        System.out.println("accountid:" + b1.accountid);
        System.out.println("balance:" + b1.balance);
        System.out.println("deposite:" + b1.deposite);
        b1.deposite();
    }
}

