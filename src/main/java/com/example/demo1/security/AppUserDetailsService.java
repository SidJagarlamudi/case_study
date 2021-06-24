package com.example.demo1.security;

//import lombok.extern.java.Log;
//import org.perscholas.dao.IStudentRepo;
//import org.perscholas.enums.Role;
//import org.perscholas.models.Student;
//import org.perscholas.services.StudentService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
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