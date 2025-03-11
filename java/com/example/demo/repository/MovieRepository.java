package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Movie;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> { // it may be required to change Long to String to match with the PK

	List<Movie> findByTitle(String title);
	
}
