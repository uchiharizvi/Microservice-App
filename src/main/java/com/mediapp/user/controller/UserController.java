package com.mediapp.user.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @GetMapping("/")
    public String getUsers(){
        return "";
    }
    @GetMapping("/{userId}")
    public String getUserDetails(@PathVariable String userId){
        return "";
    }
}
