//package com.example.demo1.services;
//
//import com.example.demo1.dao.MovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class MovieService {
//
//        @Autowired
//        MovieRepository repo;
//
//        public List<Movie> getAllMovies() {
//            return repo.findAll();
//        }
//
//
//        public Movie getMovieById(Long id) {
//            return repo.getById(id);
//        }
