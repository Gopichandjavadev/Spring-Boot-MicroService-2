package io.javadev.movieinfoservice.resource;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javadev.movieinfoservice.model.Movie;

@RestController
@RequestMapping("/movies")
public class MovieResource {
    
    @RequestMapping("/{movieId}")
    public List<Movie> getMovie(@PathVariable String movieId) {
        
        return Collections.singletonList(new Movie("1234", "Bahubali"));
    }

}
