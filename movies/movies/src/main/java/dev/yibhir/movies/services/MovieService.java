package dev.yibhir.movies.services;

import dev.yibhir.movies.models.movie.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import dev.yibhir.movies.repositories.MovieRepository;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;
    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
    public Optional<Movie> getMovie(String imdbId){
        return movieRepository.findMovieByImdbId(imdbId);
    }
}
