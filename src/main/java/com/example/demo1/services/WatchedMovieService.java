//package com.example.demo1.services;
//
//import com.example.demo1.dao.WatchedMovieRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class WatchedMovieService {
//
//        @Autowired
//        MovieRepository repo;
//
//        public List<WatchedMovie> getAllWatchedMovies() {
//            return repo.findAll();
//        }
//
//        public WatchedMovie getWatchedMovieById(Long id) {
//            return repo.getById(id);
//        }
//        public WatchedMovie saveWatchedMovies(Review c) {
//            return repo.save(c);
//        }
