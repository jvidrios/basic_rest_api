package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Movie;
import com.example.demo.repository.MovieRepository;

@Service
public class MovieService {
	@Autowired
	private MovieRepository movieRepository;
	
	public List<Movie> getMovieByTitle(String title) {
		return movieRepository.findByTitle(title);
	}
}
