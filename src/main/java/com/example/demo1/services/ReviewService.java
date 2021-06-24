//package com.example.demo1.services;
//
//import com.example.demo1.dao.ReviewRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//@Transactional
//public class ReviewService {
//
//        /*
//               - add class annotations
//               - add @Transactional on class or on each method
//               - add crud methods
//        */
//        @Autowired
//        ReviewRepository repo;
//
//        public List<Review> getAllReviews() {
//            return repo.findAll();
//        }
//
//
//        public Review getReviewById(Long id) {
//            return repo.getById(id);
//        }
//
//        public Review saveReview(Review c) {
//            return repo.save(c);
//        }
//
//        public Review removeReview(Review c) {
//            repo.delete(c);
//            return c;
//        }
//
//        public List<User> findReviewByUser(User s) {
//            return repo.findAllReviewsByUser(s);
//        }
//    }
//
//
