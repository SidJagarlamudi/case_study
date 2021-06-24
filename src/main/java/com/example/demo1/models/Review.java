package com.example.demo1.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.*;

@Entity
@Table(name = "Reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "movie_id")
    private Integer movieId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "review")
    //    @NotBlank(message = "Enter something")
    //    @Size(min= 3, max= 500, message= "Must be between 3 and 500 characters")

    private String review;


    public Review() {

    }

    public Review(Integer movieId, Integer userId, String review) {
        super();
        this.movieId = movieId;
        this.userId = userId;
        this.review = review;

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

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }
}