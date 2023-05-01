package com.example.Mulchee.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Mulchee.service.UserService;

import javax.ws.rs.GET;

@RestController
@RequestMapping(path="/api")
public class Controller {

    UserService userService;

    @GET
    @RequestMapping("/getGreeting")
    public String getGreeting() {
        return userService.getGreeting();
    }
}
