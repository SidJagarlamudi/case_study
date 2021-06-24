package com.example.demo1.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.*;

@Entity
@Table(name = "Watched")
public class WatchedMovie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "watched")
    //@NotNull
    //@NotBlank(message = "Selection is mandatory")
    private Boolean watched;


    public WatchedMovie() {

    }

    public WatchedMovie(Integer movieId, Integer userId, Boolean watched) {
        super();
        this.movieId = movieId;
        this.userId = userId;
        this.watched = watched;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Boolean watched() {
        return watched;
    }

    public void setWatched(Boolean watched) {
        this.watched = watched;
    }
}