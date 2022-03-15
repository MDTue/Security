package com.example.demosecurity;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/greet")
@RequiredArgsConstructor
public class ControllerUser {
    private final UserService userService;

    @GetMapping("me")
    public ResponseEntity<UserDocument> me(Principal principal){
        return  ResponseEntity.of(userService.findByName(principal.getName()));
    }
    @GetMapping
    public String greetUser(Principal principal){
        return("Hallo User "+ principal.getName());
    }

}

