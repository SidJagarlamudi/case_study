package com.example.demo1.controllers;


import lombok.extern.java.Log;
import com.example.demo1.models.Movie;
//import com.example.demo1.services.MovieService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@Controller
//@RequestMapping("movie")
//@Log
//public class MovieController {
//
//    @Autowired
//    MovieService movieService;
//
//
//    @ModelAttribute("movie")
//    public Movie initCourse(){
//        return new Movie();
//    }
//
//    @PostMapping("/register")
//    public String saveMovie(@ModelAttribute("movie") @Valid Movie movie, BindingResult result, Model model){
//        if (result.hasErrors()) {
//            log.warning("Invalid input");
//            return "movie";
//        }
//
//        model.addAttribute("movie", movie);
//        movieService.saveMovie(movie);
//        return "redirect:../user/getallmovies";
//    }
//
//}