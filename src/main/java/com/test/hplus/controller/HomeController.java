package com.test.hplus.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goHome(){
        System.out.println("In the home controller");
        return "index";
    }

    @GetMapping("/goTOSearch")
    public String goToSearch(){
        System.out.println("Going to search");
        return "search";
    }

}
