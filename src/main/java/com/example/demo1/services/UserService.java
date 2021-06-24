//package com.example.demo1.services;
//
//
//
//import com.example.demo1.dao.MovieRepository;
//import com.example.demo1.dao.UserRepository;
//import com.example.demo1.models.Movie;
//import com.example.demo1.models.User;
//import com.example.demo1.security.AppSecurityConfig;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import javax.swing.text.html.Option;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Service
//@Transactional
//public class UserService {
//
//    /*
//            - add class annotations
//            - add @Transactional on class or on each method
//            - add crud methods
//     */
//
//    @Autowired
//    IStudentRepo repo;
//    @Autowired
//    ICourseRepo cRepo;
//
//
//
//    public List<User> getAllUsers() {
//        return repo.findAll();
//    }
//
//    public Optional<User> findByEmail(String email) {
//        return repo.findBysEmail(email);
//    }
//
//    public User getUserById(Long id) {
//        return repo.getById(id);
//    }
//
//    public User saveUser(User s) {
//
//        s.setSPassword(AppSecurityConfig.getPasswordEncoder().encode(s.getSPassword()));
//        return repo.save(s);
//    }
//
//    public User removeUser(User s) {
//        repo.delete(s);
//        return s;
//    }
//
//}