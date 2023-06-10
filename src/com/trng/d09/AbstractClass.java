package com.trng.d09;

//Abstraction - creating abstract classes and interfaces that define a common set of methods that concrete classes must implement.
//Abstract classes can contain abstract and non abstract methods , constsructors , variables , static methods
// can implement and extend too

abstract class BankAccount {
    public abstract boolean deposit(int amt);

    public abstract boolean withdraw(int amt);

    public abstract int balance();
}

class SavingsAccount extends BankAccount {
    int accNo, balance, dailyLimit = 100000;

    public SavingsAccount(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(int amt) {
        this.balance += amt;
        System.out.println("Deposited Rs: " + amt + " in Account: " + this.accNo);
        return true;
    }

    public boolean withdraw(int amt) {
        if (this.balance < amt) {
            System.out.println("Not enough balance");
            return false;
        }
        if (this.dailyLimit - amt < 0) {
            System.out.println("Daily limit Exceeded");
            return false;
        }

        this.balance -= amt;
        System.out.println("Withdrawn Rs: " + amt + " from Account: " + this.accNo);
        return true;
    }

    public int balance() {
        return this.balance;
    }

}

class CurrentAccount extends BankAccount {
    int accNo, balance;

    public CurrentAccount(int accNo, int balance) {
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(int amt) {
        this.balance += amt;
        System.out.println("Deposited Rs: " + amt + " in Account: " + this.accNo);
        return true;
    }

    public boolean withdraw(int amt) {
        if (this.balance < amt) {
            System.out.println("Not enough balance");
            return false;
        }
        this.balance -= amt;
        System.out.println("Withdrawn Rs: " + amt + " from Account: " + this.accNo);
        return true;
    }

    public int balance() {
        return this.balance;
    }

}

public class AbstractClass {
    public static void main(String[] args) {
        SavingsAccount sAcc = new SavingsAccount(1001, 30000);
        System.out.println(sAcc.withdraw(50000));
        System.out.println(sAcc.deposit(80000));
        System.out.println(sAcc.withdraw(50000));
        System.out.println(sAcc.withdraw(60000));
        System.out.println("Account balance is : " + sAcc.balance());
        CurrentAccount cAcc = new CurrentAccount(2001, 30000);
        System.out.println(cAcc.withdraw(50000));
        System.out.println(cAcc.deposit(80000));
        System.out.println(cAcc.withdraw(50000));
        System.out.println("Account balance is : " + cAcc.balance());
    }
}
