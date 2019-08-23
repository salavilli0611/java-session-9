package com.javagurs.session.javaclass;

public class LetGoToMovie {
	
	public static void main(String mov[])
	{
		//System.out.println("Hello");
		
		Movie user1 = new Movie(1, "Robo2.0", "Good Movie to watch", "Samosa is good", "Rajinkanth","Telugu");
		Movie user2 = new Movie("Robo2.0", "Must watch moview", "Director : Shankar","Tamil");
		
		System.out.println(user1.toString());
		System.out.println(user2.toString());
		
	}

}
