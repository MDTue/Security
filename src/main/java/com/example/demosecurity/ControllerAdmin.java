package com.example.demosecurity;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;

@RestController
@RequestMapping("/api/admingreet")
@RequiredArgsConstructor
public class ControllerAdmin {
    private final UserService userService;

    @GetMapping
    public String greetAdmin(){
        return("Hallo Admin");
    }

    @GetMapping("me")
    public ResponseEntity<UserDocument> me(Principal principal){
        return  ResponseEntity.of(userService.findByName(principal.getName()));
    }


}
