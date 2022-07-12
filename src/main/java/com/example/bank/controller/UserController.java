package com.example.bank.controller;

import com.example.bank.model.User;
import com.example.bank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users")
    public String findallUsers(Model model) {
        List<User> user = userService.findAll();
        model.addAttribute("users", user);
        return "users-list";
    }
}
