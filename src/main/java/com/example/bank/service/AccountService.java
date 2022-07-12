package com.example.bank.service;

import com.example.bank.model.Account;
import com.example.bank.repository.AccountRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    @Autowired
    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    public List<Account> findAll() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByUser(User user) {
        return findAccountsByUser(user);
    }

    public Account findAccountsByStatus() {
        return findAccountsByStatus();
    }
}
