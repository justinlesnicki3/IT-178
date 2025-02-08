package edu.ilstu;

public class Student1 {
	
	private int grade;
	private String name;
	
	public Student1() {	
		this.name = "noname";
		this.grade = 00;
	}
	
	public Student1(String name, int grade) {
		this.name = name;
		this.grade = grade;
	}
	
		public String getName() {
		return name;
	}
		
	public int getGrade() {
		return grade;
	}
	
	public String toString() {
		return name + " " + grade;
	}
	 
}