package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

        public static void main(String[] args)
    {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

@RequestMapping("/")
    public String homePage(Model model){
    model.addAttribute("myvar", "Say hellp to the people.");
    return "hometemplate";
}

/*
@RequestMapping("/index")
    public String homepage(){
    return "index";
} */
}
