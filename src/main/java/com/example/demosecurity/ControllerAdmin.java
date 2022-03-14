package com.example.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/greetAdmin")
public class ControllerAdmin {
    @GetMapping
    public String greet(){
        return("Hallo Admin");
    }

}
