package com.rdsaws.awsdb.controller;


import com.rdsaws.awsdb.dao.UserRepository;
import com.rdsaws.awsdb.modal.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user/v1/")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("hello")
    @Transactional
    public String helloUser(){
        User user = new User();
        user.setName("Prakash");
        userRepository.save(user);
        return "Hello from User";
    }

    @GetMapping("all-user")
    public List<User> getAllUser(){
        List<User> users = userRepository.findAll();
        return users;
    }
}
