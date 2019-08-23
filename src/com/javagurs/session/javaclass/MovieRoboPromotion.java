package com.javagurs.session.javaclass;

public class MovieRoboPromotion {

	 public static void main(String[] args) {   
		  MovieMaking making  =  new MovieMaking("Robo 2.0", "LyCA","2019-12-12","VADI VELU , SANTHOSH"); 
		  MovieDubbing movieDubbing = new MovieDubbing("Robo 2.0", "RRR","2020-01-01","SAMPU , ALI"); 
		  System.out.println(making.toString());
		  System.out.println(movieDubbing.toString()); 
	  } 
	}

