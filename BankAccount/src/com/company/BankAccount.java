package com.company;

public class BankAccount {
    private int id;
    private String owner;
    private double balance;
    private double minimumbalance=1000;

    public BankAccount()
    {
        //default constructor
    }
    public BankAccount(double balance)
    {
        this.balance=balance;

    }

    public double getBalance() {
        return balance;
    }
    public double withdraw(double amount)
    {
        balance = balance-amount;
        return balance;
    }
    public double deposit (float amount)
    {
        balance=balance+amount;
        return balance;
    }
    public String setOwner()
    {




    }

    public String getOwner()
    {


    }

}
