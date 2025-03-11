package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Movie;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/api/")
@CrossOrigin(origins="*") 
public class RestApiTestController {
	@Autowired
	private MovieService movieService;

//	@GetMapping("/movies/{title}")
//	public String getMovie(@PathVariable String title) {
	@GetMapping("/movies")

	public ResponseEntity<List<Movie>> getMovies() {
		List<Movie> movies = movieService.getMovieByTitle("Waterworld"); // this is hard-coded value just for testing(ideally a parameter should be passed)
		
		HttpHeaders headers = new HttpHeaders();
		
		return new ResponseEntity<List<Movie>>(movies, headers, HttpStatus.OK);
	}
}
