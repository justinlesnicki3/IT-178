package edu.ilstu;

public class EmployeeDriver {

	public static void main(String[] args) {
		
		BaseEmployee e = new FullTimeEmployee();
		Employee e2 = new Manager();
		String role = e2.getRole();
		double salary = e2.calculateSalary();
		System.out.println("Slary: " + salary);
		System.out.println("Role: " + role);
		//BaseEmployee e = new FullTimeEmployee();
		//Employee e2 = new BaseEmployee();
		//BaseEmployee e3 = new Employee(); this is wrong, employee is interface
		//FullTimeEmployee e4 = new BaseEmployee(); this is wrong, fulltimeemployee extends baseemployee
		//Manager m = new FullTimeEmployee(); this is wrong because fultimeemploye is higher in the heirarchy
		

		System.out.println(e.calculateSalary());
		
		
	}

}
