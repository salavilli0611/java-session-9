package com.javagurs.session.javaclass;

public class MovieMaking {

	String movieName = "Robo 2.0";
	String movieMakers = "Lyca";
	String releaseDate = "2019-12-12";
	String comedyActors = "VADI VELU , SANTHOSH";

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getMovieMakers() {
		return movieMakers;
	}

	public void setMovieMakers(String movieMakers) {
		this.movieMakers = movieMakers;
	}

	public String getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	public String getComedyActors() {
		return comedyActors;
	}

	public void setComedyActors(String comedyActors) {
		this.comedyActors = comedyActors;
	}

	public MovieMaking(String movieName, String movieMakers,
			String releaseDate, String comedyActors) {
		super();
		this.movieName = movieName;
		this.movieMakers = movieMakers;
		this.releaseDate = releaseDate;
		this.comedyActors = comedyActors;
	}

	@Override
	public String toString() {
		return "MovieMaking [movieName=" + movieName + ", movieMakers="
				+ movieMakers + ", releaseDate=" + releaseDate
				+ ", comedyActors=" + comedyActors + "]";
	}

}
