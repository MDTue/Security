package com.example.demosecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/admingreet")
public class ControllerAdmin {
    @GetMapping
    public String greetAdmin(){
        return("Hallo Admin");
    }

}
