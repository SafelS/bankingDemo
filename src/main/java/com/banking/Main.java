package com.banking;

import com.banking.model.Account;
import com.banking.model.CheckingAccount;
import com.banking.model.SavingsAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CheckingAccount ca1 = new CheckingAccount("123", "Tom", 1000, 500);
        CheckingAccount ca2 = new CheckingAccount("456", "Maria", 0, 500);

        ca1.transfer(ca2,500);
        System.out.println(ca1);
        System.out.println(ca2);
        //ca1.transfer(ca2,10000);
    }
}