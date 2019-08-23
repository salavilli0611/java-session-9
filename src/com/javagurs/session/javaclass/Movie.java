package com.javagurs.session.javaclass;

public class Movie {
	
	int seatNumber;
	String movieName;
	String movieReview;
	String buyingSnacks;
	String userName;
	
	/*String hindi;
	String telegu;
	*/
	
	String langauge;
	
	
	public Movie(int seatNumber, String movieName, String movieReview,
			String buyingSnacks, String userName,String langauge) {
		super();
		this.seatNumber = seatNumber;
		this.movieName = movieName;
		this.movieReview = movieReview;
		this.buyingSnacks = buyingSnacks;
		this.userName = userName;
		this.langauge = langauge;
	}
	
	
	public Movie(String movieName, String movieReview, String userName,String langauge) {
		super();
		this.seatNumber = seatNumber;
		this.movieName = movieName;
		this.movieReview = movieReview;
		this.buyingSnacks = buyingSnacks;
		this.userName = userName;
		this.langauge = langauge;
	}


	public int getSeatNumber() {
		return seatNumber;
	}


	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getMovieReview() {
		return movieReview;
	}


	public void setMovieReview(String movieReview) {
		this.movieReview = movieReview;
	}


	public String getBuyingSnacks() {
		return buyingSnacks;
	}


	public void setBuyingSnacks(String buyingSnacks) {
		this.buyingSnacks = buyingSnacks;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	@Override
	public String toString() {
		
		if(seatNumber == 0 && buyingSnacks == null)
		{
			return "Movie [ movieName=" + movieName + ", movieReview=" + movieReview + ", userName=" + userName + ""
					+ ", language=" + langauge + "]";
		}
		
		return "Movie [ seatNumber=" + seatNumber + ", movieName=" + movieName
				+ ", movieReview=" + movieReview + ", buyingSnacks="
				+ buyingSnacks + ", userName=" + userName + " , langauge=" + langauge + "]";
	}


	public String getLangauge() {
		return langauge;
	}


	public void setLangauge(String langauge) {
		this.langauge = langauge;
	}
	
	
	
	
	
}
