package edu.ilstu;

public class Manager extends FullTimeEmployee {
	
	private double bonus;
	
	public double calculateSalary() {
		
		return super.calculateSalary() + bonus;
		
	}
	
	public String getRole() {
		return "manager";
	}
}
