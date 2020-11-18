package com.example.demo.controllers;

import java.util.List;

import com.example.demo.domains.User;
import com.example.demo.mappers.UserMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class UserController {

    @Autowired
    UserMapper userMapper;
    
    @GetMapping("/home")
    public List<User> listar() {
        return userMapper.listar();
    }
}
