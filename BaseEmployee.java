package edu.ilstu;

public abstract class BaseEmployee implements Employee {
	
	private String name;
	
	public abstract double calculateSalary();
	
	public String getRole() {
		
		return "yo";
	}

}
