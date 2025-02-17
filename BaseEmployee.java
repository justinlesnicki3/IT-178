package edu.ilstu;

public abstract class BaseEmployee implements Employee1 {
	
	private String name;
	
	public abstract double calculateSalary();
	
	public String getRole() {
		
		return "yo";
	}

}
