package com.ahl.springbootpostgrescrudexample.controller;

import com.ahl.springbootpostgrescrudexample.datamodel.User;
import com.ahl.springbootpostgrescrudexample.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    // get all users
    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    // create users rest api
    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }
}
