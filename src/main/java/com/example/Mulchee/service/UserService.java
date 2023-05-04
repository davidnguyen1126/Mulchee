package com.example.Mulchee.service;

import com.example.Mulchee.model.Users;
import com.example.Mulchee.repo.UsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UsersRepo usersRepo;

    public String getGreeting() {
        return "Hello world";
    }

    public void addUser(Users user) {
        usersRepo.save(user);
    }
}
