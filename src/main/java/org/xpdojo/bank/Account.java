package org.xpdojo.bank;

public class Account {
    int balance = 0;

    public int balance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }
}
