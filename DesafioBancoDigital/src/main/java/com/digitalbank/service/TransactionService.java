package com.digitalbank.service;

import com.digitalbank.domain.Account;

public class TransactionService {
    public void transfer(Account from, Account to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
    }
}
