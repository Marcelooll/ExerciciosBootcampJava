package com.digitalbank.service;

import com.digitalbank.domain.Account;
import com.digitalbank.domain.Client;

import java.util.ArrayList;
import java.util.List;

public class AccountService {
    private final List<Account> accounts = new ArrayList<>();

    public Account createAccount(Account account) {
        accounts.add(account);
        return account;
    }

    public List<Account> getAllAccounts() {
        return accounts;
    }

    public Account findByNumber(int number) {
        return accounts.stream().filter(acc -> acc.getNumber() == number).findFirst().orElse(null);
    }
}
