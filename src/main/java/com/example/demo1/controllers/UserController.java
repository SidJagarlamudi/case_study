//package com.example.demo1.controllers;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import lombok.extern.java.Log;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.http.ResponseEntity;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import com.example.demo1.dao.UserRepository;
//import com.example.demo1.models.User;
//
//@Controller
//@Log
//@RequestMapping("user")
//public class UserController {
//
//    @Autowired
//    UserService userService;
//
//    @Autowired
//    MovieService movieService;
//
//    @ModelAttribute("user")
//    public User initUser(){
//        return new User();
//    }
//
//    @ModelAttribute("movie")
//    public Movie initMovie(){
//        return new Movie();
//    }
//
//    @GetMapping("/register")
//    public String registerPage() {
//        return "register"; }
//
//    }
//}
