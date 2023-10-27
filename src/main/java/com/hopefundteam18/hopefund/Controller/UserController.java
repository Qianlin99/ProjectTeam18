package com.hopefundteam18.hopefund.Controller;


import com.hopefundteam18.hopefund.DTO.LoginDTO;
import com.hopefundteam18.hopefund.DTO.UserDTO;
import com.hopefundteam18.hopefund.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.hopefundteam18.hopefund.Service.UserService;
//
@Controller
public class UserController {

//    @Autowired
//    private UserService userService;

    /*@GetMapping("/createAccount")
    public String showCreateAccount(){
        return "createAccount";
    }*/

    /*@PostMapping(path = "/createAccount")
    public String saveUser(@ModelAttribute("user") UserDTO userDto, Model model){
        userService.save(userDto);
        model.addAttribute("message", "Registered Successfully!");
        return "index";
    }*/

//    @PostMapping(path = "/save")
//    public String saveUser(@RequestBody UserDTO userDTO)
//    {
//        String id = userService.addUser(userDTO);
//        return id;
//    }

    /*@PostMapping(path = "/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginDTO loginDTO)
    {
        LoginResponse loginResponse = userService.loginUser(loginDTO);
        return ResponseEntity.ok(loginResponse);
    }*/


//    @Autowired
//    private UserRepository userRepository;

//    @GetMapping("/login")
//    public String loginForm(Model model) {
//        model.addAttribute("user", new User());
//        return "login";
//    }
//
//    @PostMapping("/index")
//    public String loginSubmit(@ModelAttribute User user, Model model) {
//        User existingUser = userRepository.findByUsername(user.getUsername());
//        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
//            return "redirect:/dashboard"; // Successful login, redirect to a dashboard
//        } else {
//            model.addAttribute("error", "Invalid credentials");
//            return "login"; // Failed login, show error message
//        }
//    }
}

