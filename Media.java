package edu.ilstu;

public class Media implements Movie, Multimedia {
	
	private int duration;
	private String director;
	
	public void setDuration(int duration) {
		this.duration = duration;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public void printDuration() {
		System.out.println("Duration is " + duration);
	}

	@Override
	public void printDirector() {
		System.out.println("Director is " + director);
	}
}
