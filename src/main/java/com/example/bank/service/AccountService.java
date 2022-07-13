package com.example.bank.service;

import com.example.bank.model.Account;
import com.example.bank.repository.AccountRepository;
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

    public List<Account> findAccounUser(String lastName) {
        return accountRepository.findAccountByUserLastName(lastName);
    }

    public List<Account> findStatus() {
        return accountRepository.findAccountsByStatus("main");
    }
}
