package com.capgemini.FilmToets.repository;

import com.capgemini.FilmToets.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface MovieRepository extends CrudRepository<Movie, Long> {
}
