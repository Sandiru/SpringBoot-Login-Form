package com.example.loginProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ForgotPasswordController {
    @GetMapping("/forgotPassword")
    public String loginForm(){
        return "forgotPassword";
    }
}
