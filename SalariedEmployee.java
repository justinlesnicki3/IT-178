package edu.ilstu;

import java.text.NumberFormat;

public class SalariedEmployee extends Employee {
	
	private double monthlySalary;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public SalariedEmployee(String name, int employeeId, double monthlySalary) {
		super(name, employeeId);
		this.monthlySalary = monthlySalary;
	}

	
	
	public double calculatePay() {
		return monthlySalary;
	}
	
	public void displayDetails() {
		System.out.println("\nEmployee ID: " + employeeId + "\nName: " + name + "\nType: Salaried Employee" + "\nMonthly Salary: " 
							+ money.format(monthlySalary) + "\nTotal Pay: " + money.format(monthlySalary));
	}
	
	
	
	
	
	

}
