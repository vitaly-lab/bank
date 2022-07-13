package com.example.bank;

import com.example.bank.service.AccountService;
import com.example.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class BankApplication {

    @Autowired
    private UserService userService;
    @Autowired
    private AccountService accountService;

    public static void main(String[] args) {
        SpringApplication.run(BankApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    private void testJpaMethods() {
        accountService.findAccounUser("Jonson").forEach(it -> System.out.println(it.getAccountType()));
        accountService.findStatus().forEach(it -> System.out.println(it.getUser().getLastName()));
    }

}
