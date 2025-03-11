package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="movies")
public class Movie {
	@Id
	private String imdbId;
	private String title;
	private int movieYear;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getMovieYear() {
		return movieYear;
	}
	public void setMovieYear(int movieYear) {
		this.movieYear = movieYear;
	}
	public String getImdbId() {
		return imdbId;
	}
	public void setImdbId(String imdbId) {
		this.imdbId = imdbId;
	}
}
