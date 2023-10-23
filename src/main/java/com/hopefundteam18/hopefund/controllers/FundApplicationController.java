package com.hopefundteam18.hopefund.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FundApplicationController {

    @GetMapping("/")
    public String showHomePage(){
        return "index";
    }

    @GetMapping("/login")
    public String showLoginPage(){
        return "login";
    }

    @GetMapping("/Donate")
    public String showDonatePage(){
        return "Donate";
    }

    @GetMapping("/ThankYou")
    public String showThankYou() { return "ThankYou"; }

    @GetMapping("/SignUp")
    public String showSignUp() { return "SignUp"; }

    @GetMapping("/createAccount")
    public String showCreateAccount() { return "createAccount"; }

}
