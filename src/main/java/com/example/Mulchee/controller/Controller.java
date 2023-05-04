package com.example.Mulchee.controller;

import com.example.Mulchee.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mulchee.service.UserService;

import javax.ws.rs.GET;
import javax.ws.rs.POST;

@RestController
@RequestMapping(path="/api")
public class Controller {

    @Autowired
    UserService userService;

    @GET
    @RequestMapping("/getGreeting")
    public String getGreeting() {
        return userService.getGreeting();
    }

    @POST
    @RequestMapping("/addUser")
    public void addUser(@RequestBody Users user) {
        userService.addUser(user);
    }
}
