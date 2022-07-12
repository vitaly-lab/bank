package com.example.bank.controller;

import com.example.bank.model.Account;
import com.example.bank.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AccountController {

    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/accounts")
    public String findallAccounts(Model model) {
        List<Account> accounts = accountService.findAll();
        model.addAttribute("accounts", accounts);
        return "accounts-list";
    }
}
