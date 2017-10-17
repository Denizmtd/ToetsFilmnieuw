package com.capgemini.FilmToets.model;

import javax.persistence.*;

@Entity
public class Movie {
        @Id
        @Column(name= "movieId")
        @GeneratedValue(strategy = GenerationType.AUTO)
        private long     movieId;
        private String  title;
        private double  score;
        private Boolean watched;

        //empty constructor
        public Movie() {
        }

        //constructor
        public Movie(String title, double score, Boolean watched) {
            this.title = title;
            this.score = score;
            this.watched = watched;
        }

        //Getters and Setters
        public long getMovieId() {
            return movieId;
        }

        public void setMovieId(long movieId) {
            this.movieId = movieId;
        }

        public String getMovieTitle() {
            return title;
        }

        public void setMovieTitle(String movieTitle) {
            this.title = movieTitle;
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public Boolean getWatched() {
            return watched;
        }

        public void setWatched(Boolean watched) {
            this.watched = watched;
        }
    }
