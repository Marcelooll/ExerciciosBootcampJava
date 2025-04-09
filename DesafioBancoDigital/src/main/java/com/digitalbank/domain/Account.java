package com.digitalbank.domain;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public abstract class Account {
    private static int SEQUENTIAL = 1;

    protected int number;
    protected double balance;
    protected Client client;
    protected List<Transaction> transactions = new ArrayList<>();

    public Account(Client client) {
        this.number = SEQUENTIAL++;
        this.client = client;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Transaction(TransactionType.DEPOSIT, amount, LocalDateTime.now()));
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            transactions.add(new Transaction(TransactionType.WITHDRAW, amount, LocalDateTime.now()));
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public void printStatement() {
        System.out.printf("Account No: %d | Client: %s | Balance: %.2f%n", number, client.getName(), balance);
        transactions.forEach(tx -> System.out.printf(" - %s: %.2f at %s%n", tx.getType(), tx.getAmount(), tx.getTimestamp()));
    }
}
