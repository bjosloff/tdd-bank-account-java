package org.xpdojo.bank;

public class Account {
    double balance = 0.00;

    public double balance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }
}
