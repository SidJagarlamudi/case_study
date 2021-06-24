package com.example.demo1.models;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
//import javax.validation.constraints.*;
@Entity
@Table(name = "Movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "title")
//    @Size(min= 3, max= 50, message= "Must be between 3 and 50 characters")
    private String title;

    @Column(name = "producer")
//    @NotBlank(message = "Enter something")
    private String producer;

    @Column(name = "description")
//    @Size(min= 50, max= 500, message= "Must be between 50 and 500 characters")
    private String description;


    public Movie() {

    }

    public Movie(String title, String producer, String description) {
        super();
        this.title = title;
        this.producer = producer;
        this.description = description;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
