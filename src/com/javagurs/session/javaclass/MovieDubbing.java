package com.javagurs.session.javaclass;

public class MovieDubbing  extends MovieMaking{

	String movieName1;
	String movieMakers1;
	String releaseDate1;
	String comedyActors1;
	
	public MovieDubbing(String movieName, String movieMakers,
			String releaseDate, String comedyActors) {
		
		super(movieName, movieMakers, releaseDate, comedyActors);
		movieName1 = movieName;
		movieMakers1 = movieMakers;
		releaseDate1 = releaseDate;
		comedyActors1 = comedyActors;
	}

	@Override
	public String toString() {
		return "MovieDubbing [movieName1=" + movieName1 + ", movieMakers1="
				+ movieMakers1 + ", releaseDate1=" + releaseDate1
				+ ", comedyActors1=" + comedyActors1 + "]";
	} 
}
