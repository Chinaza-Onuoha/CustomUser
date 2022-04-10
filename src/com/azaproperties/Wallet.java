package com.azaproperties;

public class Wallet {
    private String user;
    private double balance;
    private String expenses;

    public Wallet(String user, double balance, String expenses) {
        this.user = user;
        this.balance = balance;
        this.expenses = expenses;
    }
}
