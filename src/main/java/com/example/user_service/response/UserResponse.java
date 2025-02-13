package com.example.user_service.response;

public class UserResponse {
	
	private int id;
	private String name;
	private String email;
	private String address;
	
	private MovieResponse movieResponse;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public MovieResponse getMovieResponse() {
		return movieResponse;
	}
	public void setMovieResponse(MovieResponse movieResponse) {
		this.movieResponse = movieResponse;
	}
	
	
}
