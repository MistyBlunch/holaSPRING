package com.utec.software.Lab9.controllers;

import com.utec.software.Lab9.data.api.User;
import com.utec.software.Lab9.data.model.UserEntity;
import com.utec.software.Lab9.data.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloWorldController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/hello")
    public String hello() {
        System.out.println("OWO");
        return "Hola Mundo";
    }

    @PostMapping("/hello")
    public User hello_post(@RequestBody User user) {
        System.out.println("post");
        user.password = "NULL";
        return user;
    }

    @PostMapping("/register")
    public Boolean register(@RequestBody User user) {
        userRepository.save(new UserEntity(user.username.getBytes().toString(), user.username, user.password));
        return true;
    }

    @PostMapping("/login")
    public Boolean login(@RequestBody User user) {
        Optional<UserEntity> usr = userRepository.findUserEntityByUsername(user.username);
        if(!usr.isEmpty()) {
            if(user.password.equals(usr.get().password)) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
