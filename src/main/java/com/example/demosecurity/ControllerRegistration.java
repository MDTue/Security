package com.example.demosecurity;


import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class ControllerRegistration {
    private final UserService userService;
    private  final PasswordEncoder passwordEncoder;
    @PostMapping
    public UserDocument createUser(@RequestBody UserDocument user){
        user.setPasswort(passwordEncoder.encode(user.getPasswort()));
        return userService.createUser(user);
    }


}
