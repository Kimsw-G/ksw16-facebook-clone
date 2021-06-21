package com.example.fbt.controller;

import com.example.fbt.model.UserEntity;
import com.example.fbt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/login")
    public void login(){
        System.out.println("hello");
    }

    @GetMapping("/join")
    public void join(UserEntity userEntity){

    }

    @PostMapping("/join")
    public String join(UserEntity userEntity, Model model){
        userService.join(userEntity);

        return "redirect:/feed/home";
    }
}
