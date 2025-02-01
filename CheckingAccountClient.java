package edu.ilstu;

public class CheckingAccountClient {

	public static void main(String[] args) {

		CheckingAccount c1 = new CheckingAccount();
		System.out.println("New checking account: " + c1 + "\n");
		
		CheckingAccount c2 = new CheckingAccount(100.00);
		System.out.println("New checking account: " + c2);
		
	}

}
