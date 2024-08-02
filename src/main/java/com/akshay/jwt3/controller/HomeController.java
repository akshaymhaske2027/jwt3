package com.akshay.jwt3.controller;


import com.akshay.jwt3.entities.User;
import com.akshay.jwt3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.List;

@RestController
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private UserService userService;

    //http://localhost:8081/home/user
    @GetMapping("/users")
    public List<User> getUsers(){
        System.out.println("GETTING_USER");
        return this.userService.getUsers();
    }


    @GetMapping("/current-user")
    public String getLoggedInUser(Principal principal){
        return principal.getName();

    }
}
