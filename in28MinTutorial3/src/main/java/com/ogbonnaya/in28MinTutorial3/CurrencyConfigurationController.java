package com.ogbonnaya.in28MinTutorial3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CurrencyConfigurationController {

//    @Autowired
//    private CurrencyServiceConfiguration configuration;
// use @autowire above or the below constructor

private final CurrencyServiceConfiguration configuration;

    public CurrencyConfigurationController(CurrencyServiceConfiguration configuration) {
        this.configuration = configuration;
    }

    @RequestMapping("/currency")
    public CurrencyServiceConfiguration retrieveAllCourses(){
        return  configuration;
    }
}
