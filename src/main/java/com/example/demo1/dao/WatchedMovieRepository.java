package com.example.demo1.dao;

import com.example.demo1.models.Review;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo1.models.WatchedMovie;

import java.util.List;

@Repository
public interface WatchedMovieRepository extends JpaRepository<WatchedMovie, Long> {

    Page<WatchedMovie> findAll(WatchedMovie watchedMovie);

    List<WatchedMovie> findByWatchedMovieId(Integer watchedMovieId, WatchedMovie watchedMovie);

}