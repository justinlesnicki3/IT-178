package edu.ilstu;

public class PrintMedia {

	public static void main(String[] args) {

		Media med1 = new Media();
		
		med1.setDirector("Tarantino");
		med1.setDuration(60);
		
		med1.printDirector();
		med1.printDuration();
		
	}

}
