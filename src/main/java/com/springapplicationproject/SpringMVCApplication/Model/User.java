package com.springapplicationproject.SpringMVCApplication.Model;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
@Table(name="UserView",uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String movieName;
    private Double rating;


    public User(String movieName, Double rating) {
        this.id = id;
        this.movieName = movieName;
        this.rating = rating;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }
}

