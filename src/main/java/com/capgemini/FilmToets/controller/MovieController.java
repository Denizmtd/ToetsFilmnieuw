package com.capgemini.FilmToets.controller;

import com.capgemini.FilmToets.model.Movie;
import com.capgemini.FilmToets.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/api/bookings")

public class MovieController {

    @Autowired
    private MovieRepository movieRepository;

    @RequestMapping(value = "" , method = RequestMethod.GET)
    public Iterable<Movie> movieList(){
        return movieRepository.findAll();
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Movie postMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return movie;
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public Movie deleteMovie(@RequestBody Movie movie){
        movieRepository.delete(movie);
        return movie;
    }

    @RequestMapping(value = "/", method = RequestMethod.PUT)
    public Movie updateMovie(@RequestBody Movie movie){
        movieRepository.save(movie);
        return movie;
    }

}
