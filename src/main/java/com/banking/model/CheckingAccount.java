package com.banking.model;

import com.banking.exception.InsufficientFundsException;

public class CheckingAccount extends Account implements Transferable{

    private final double draftLimit;

    public CheckingAccount(String id, String owner, double initialBalance, double draftLimit){
        super(id, owner, initialBalance);

        if(draftLimit < 0){
            throw new IllegalArgumentException("Draft Limit cannot be negative");
        }

        this.draftLimit = draftLimit;
    }

    @Override
    public void withdraw(double amount){

        if(amount > getBalance() + draftLimit){
            throw new InsufficientFundsException("Overdraft limit exceeded");
        }

        super.withdraw(amount);

    }

    @Override
    public void transfer(Account target, double amount) {
        if(target == null){
            throw new IllegalArgumentException("Target account cannot be null");
        }

        this.withdraw(amount);
        target.deposit(amount);

    }
}
