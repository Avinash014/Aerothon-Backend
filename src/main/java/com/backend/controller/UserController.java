package com.backend.controller;


import com.backend.model.User;
import com.backend.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/")
    public List<User> getAllUsers() {
//        return Collections.emptyList();
        return userRepository.findAll();
    }

    @PostMapping("/")
    public User createUser(@RequestBody User user) {
//        return user;
        return userRepository.save(user);
    }
}

