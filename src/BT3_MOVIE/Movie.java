package BT3_MOVIE;

import java.util.ArrayList;

public class Movie {
private String title;
private String director;
private ArrayList <String> actors;
private ArrayList <Review> reviews;
public Movie(String title, String director, ArrayList<String> actors, ArrayList<Review> reviews) {
	super();
	this.title = title;
	this.director = director;
	this.actors = actors;
	this.reviews = reviews;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getDirector() {
	return director;
}
public void setDirector(String director) {
	this.director = director;
}
public ArrayList<String> getActors() {
	return actors;
}
public void setActors(ArrayList<String> actors) {
	this.actors = actors;
}
public ArrayList<Review> getReviews() {
	return reviews;
}
public void setReviews(ArrayList<Review> reviews) {
	this.reviews = reviews;
}
@Override
public String toString() {
	return "Movie [title=" + title + ", director=" + director + ", actors=" + actors + ", reviews=" + reviews + "]";
}


}
