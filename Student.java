package edu.ilstu;

import java.util.ArrayList;

public class Student {
	
	private String name;
	private ArrayList<Integer> grades;
	
	public Student(String name, int numberOfSubjects) {
		
		this.name = name;
		this.grades = new ArrayList<>();
		
		for(int i = 0; i < numberOfSubjects; i++) {
			grades.add(-1);
		}
		
	}
	
	public void setGrade(int indexOfSubject, int grade) {
		grades.set(indexOfSubject, grade);
	}
	
	public int getGrade(int indexOfSubject) {
		
		return grades.get(indexOfSubject);
		
	}
	
	public String getName() {
		return name;
	}
	
	public double calculateAverage() {
		
		int total = 0;
		int count = 0;
		
		for(int i = 0; i < grades.size(); i++) {
			int grade = grades.get(i);
			if(grade != -1) {
				total += grade;
				count++;
			}
		}
		
		if (count == 0) {
			return 0;
		}
		return (double) total / count;
	}
	
	

}
