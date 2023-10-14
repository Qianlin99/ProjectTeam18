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
}
