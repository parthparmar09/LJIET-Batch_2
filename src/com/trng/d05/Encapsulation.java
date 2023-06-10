package com.trng.d05;

//Encapsulation - the internal details of a class are hidden from outside and can only be accessed through the class's public methods.

class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited in account :" + this.accountNumber);

    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Not enough balance");
            return;
        }

        this.balance -= amount;
        System.out.println("Withdrawn from account : " + this.accountNumber);

    }

    public double getBalance() {
        return balance;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2001, 1000);
        b1.withdraw(2000);
        b1.deposit(2000);
        b1.withdraw(1500);
        System.out.println(b1.getBalance());
    }
}
