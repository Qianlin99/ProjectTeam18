package com.hopefundteam18.hopefund.Controller;

import com.hopefundteam18.hopefund.DTO.UserDTO;
import com.hopefundteam18.hopefund.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.logging.Logger;

@Controller
public class FundApplicationController {

//    @Autowired
//    public UserDetailsService userDetailsService;
    @Autowired
    public UserService userService;

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

    @GetMapping("/index")
    public String showCreateAccount(@ModelAttribute("user") UserDTO userDto) { return "index"; }

    @GetMapping("/createAccount")
    public String showCreateAccount(){
        return "createAccount";
    }

    @PostMapping("/createAccount")
    public String saveUser(@ModelAttribute("user") UserDTO userDto, Model model){
        userService.save(userDto);
        model.addAttribute("message", "Registered Successfully!");
        return "createAccount";
    }

    /*@GetMapping("/user-page")
    public String userPage (Model model, Principal principal) {
        System.out.println("principal: " + principal);
        //serDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "user";
    }

    @GetMapping("/admin-page")
    public String adminPage (Model model, Principal principal) {
        System.out.println("principal: " + principal);
        //UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("admin", userDetails);
        return "admin";
    }

    @GetMapping("/productowner-page")
    public String productOwnerPage (Model model, Principal principal) {

        //UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("user", userDetails);
        return "productowner";
    }*/
}
