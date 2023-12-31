package com.luv2code.springboot.demo.mycoolapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestContoller {
    @GetMapping("/")
    public String getHello() {
        return "Hello world";
    }
    

    @GetMapping("/workout")
    public String getDailyWorkout() {
        return "Run a hard 5k!";
    }
    
    @GetMapping("/fortune")
    public String getDailyFortune() {
        return "today is your lucky day.";
    }
    
}
