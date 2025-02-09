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
}
