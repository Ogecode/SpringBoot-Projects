package com.ogbonnaya.project8;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/helloWorld")
    public String HellWorld(){
     return "Hello World!!!2563" ;
    }
}
