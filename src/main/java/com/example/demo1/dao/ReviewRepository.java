package com.example.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo1.models.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {

}