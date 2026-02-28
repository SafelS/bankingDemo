package com.banking.model;

public interface Transferable {
    void transfer(Account target, double amount);
}
