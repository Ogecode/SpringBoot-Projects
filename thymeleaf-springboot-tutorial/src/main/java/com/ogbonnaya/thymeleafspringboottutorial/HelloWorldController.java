package com.ogbonnaya.thymeleafspringboottutorial;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String hello(Model model){
        model.addAttribute("message", "Hello World");
        return "Hello world";
    }
}
