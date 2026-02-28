package com.banking.model;


import com.banking.exception.InsufficientFundsException;

public class Account {

    private String owner;
    private double balance;
    private String id;

    public Account(String id,String owner, double initialBalance) {
        if(initialBalance < 0) {
            throw new IllegalArgumentException("initial balance cannot be negative");
        }

        this.id = id;
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if(amount <= 0) {
            throw new IllegalArgumentException("amount cannot be negative");
        }
        if(amount > balance) {
            throw new InsufficientFundsException("Not enough Balance");
        }

        balance -= amount;
    }


    public double getBalance() {
        return balance;
    }

    public String getId() {
        return id;
    }

    public String getOwner() {
        return owner;
    }



    @Override
    public String toString() {
        return "Account [owner=" + owner + ", balance=" + balance + ", id=" + id + "]";
    }
}
