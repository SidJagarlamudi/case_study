package com.example.demo1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo1.models.WatchedMovie;

@Repository
public interface WatchedMovieRepository extends JpaRepository<WatchedMovie, Long> {

}