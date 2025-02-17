package edu.ilstu;

public abstract class Employee implements Payable {
	
	String name;
	int employeeId; 
	
	public Employee(String name, int employeeId) {
		this.name = name;
		this.employeeId = employeeId;
	}
	
	public void displayDetails() {
		
	}
	

}
