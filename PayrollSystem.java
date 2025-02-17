package edu.ilstu;

import java.util.ArrayList;

public class PayrollSystem {

	public static void main(String[] args) {

		SalariedEmployee sle1 = new SalariedEmployee("Alice Johnson", 101, 5000);
		HourlyEmployee he1 = new HourlyEmployee("Bob Smith", 102, 20.00, 160);
		
		ArrayList<Employee> employee = new ArrayList<>();
		
		employee.add(sle1);
		employee.add(he1);
		
		System.out.println("Employee Payroll System");

		
		for(Employee e : employee) {
			System.out.println("\n-----------------------");
			e.displayDetails();
		}
		
		
		
	}

}
