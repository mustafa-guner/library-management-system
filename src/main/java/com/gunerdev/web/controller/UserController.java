package com.gunerdev.web.controller;

import com.gunerdev.web.dto.UserDTO;
import com.gunerdev.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/users")
    public String listUsers(Model model){
        List<UserDTO> users = userService.findAllUsers();
        model.addAttribute("users",users);
        return "users-list";
    }

}
