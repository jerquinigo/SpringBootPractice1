package com.citi.training.SampleSpringBoot.service;

import com.citi.training.SampleSpringBoot.entities.Movie;
import com.citi.training.SampleSpringBoot.repo.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

//the service tag will mark it as a bean. It will instantiate this class
@Service
public class MovieServiceImpl implements MovieService {
    //this will get the class MovieRepository
    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Collection<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
