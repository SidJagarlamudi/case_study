package com.example.demo1.security;

//import lombok.extern.java.Log;
//import  com.example.demo1.dao.UserRepository;
//import  com.example.demo1.enums.Role;
//import  com.example.demo1.models.User;
//import  com.example.demo1.services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springfr                   amework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;


//import lombok.extern.java.Log;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Arrays;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Log
//public class AppUserDetailsService implements UserDetailsService {
//
//    @Autowired
//    IStudentRepo iStudentRepo;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        Optional<User> user = UserRepository.findBysEmail(s);
//        if(user.isEmpty()){
//            throw new UsernameNotFoundException("Email does not found in the database");
//        }
//
//        log.severe("user by email : "+user);
//
//        List<String> roleList = Arrays.asList(student.get().getSRole().split(","));
//
//        log.severe("roles : "+roleList);
//
//        return new AppUserDetails(student.get(), roleList);
//    }