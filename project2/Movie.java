package project2;

import java.util.ArrayList;


public class Movie {

	private String title;
	private String year;
	private String director;
	
	// can be just a first name or just a last name
	// OR it can be BOTH a first name and a last name
	private String starName;
	
	
	// Here are values that will be stored and outputted to the user
	private String id;
	private ArrayList<String> listOfGenres;
	private ArrayList<String> listOfStars;
	
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getStarName() {
		return starName;
	}
	public void setStarName(String starName) {
		this.starName = starName;
	}
	public ArrayList<String> getListOfStars() {
		return listOfStars;
	}
	public void setListOfStars(ArrayList<String> listOfStars) {
		this.listOfStars = listOfStars;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public ArrayList<String> getListOfGenres() {
		return listOfGenres;
	}
	public void setListOfGenres(ArrayList<String> listOfGenres) {
		this.listOfGenres = listOfGenres;
	}
	
	
	
}
