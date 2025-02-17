package edu.ilstu;

import java.text.NumberFormat;

public class HourlyEmployee extends Employee {

	private double hourlyRate;
	private int hoursWorked;
	NumberFormat money = NumberFormat.getCurrencyInstance();
	
	public HourlyEmployee(String name, int employeeId, double hourlyRate, int hoursWorked) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.hoursWorked = hoursWorked;
	}

	public double calculatePay() {
		
		return hourlyRate * hoursWorked;
		
	}
	
	public void displayDetails() {
		System.out.println("\nEmployee ID: " + employeeId + "\nName: " + name + "\nType: Hourly Employee" + "\nHourly Rate: "
							+ money.format(hourlyRate) + "\nHours Worked: " + hoursWorked + "\nTotal Pay: " + money.format(calculatePay()));
	}
	
	
}
