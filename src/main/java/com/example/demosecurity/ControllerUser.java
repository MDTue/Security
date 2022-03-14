package com.example.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/greet")
public class ControllerUser {
    @GetMapping
    public String greetUser(){
        return("Hallo User");
    }
}

