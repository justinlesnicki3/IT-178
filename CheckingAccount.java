package edu.ilstu;

public class CheckingAccount extends BankAccount {
	
	public CheckingAccount() {
		super();
		System.out.println("In checkingAmount " + " default constructor");
	}
	
	public CheckingAccount(double balance) {
		super(balance);
		System.out.println("In checkingAccount " + "overloaded constructor");
	}

}
