<<<<<<< HEAD
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
=======
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
>>>>>>> 0d89b61e0a2f0b35192cbed56a2197d3b0b03798
