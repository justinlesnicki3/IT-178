package edu.ilstu;

import java.util.ArrayList;

public class Subject {
	
	 private String name;
	 private ArrayList<Integer> grades;
	
	public Subject(String name, int totalStudents) {
		this.name = name;
		grades = new ArrayList<>();
		for(int i = 0; i < totalStudents; i++) {
			grades.add(-1);
		}
		
	}
	
	public void setGrade(int index, int grade) {
		grades.set(index,grade);
	}
	
	public int getGrade(int index) {
		return grades.get(index);
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
	
	public int getHighestGrade() {
		int highest = Integer.MIN_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			if(grades.get(i) > highest) {
				highest = grades.get(i);
			}
		}
		return highest;
	}
	
	public int getLowestGrade() {
		int lowest = Integer.MAX_VALUE;
		for (int i = 0; i < grades.size(); i++) {
			if(grades.get(i) < lowest) {
				lowest = grades.get(i);
			}
		}
		return lowest;
	}
	
}
