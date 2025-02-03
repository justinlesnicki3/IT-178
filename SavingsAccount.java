package edu.ilstu;

import java.text.DecimalFormat;


public class SavingsAccount extends BankAccount {

	public final double DEFAULT_RATE = .03;
	private double interestRate;
	
	public SavingsAccount() {
		
		super();
		interestRate = DEFAULT_RATE;
		System.out.println("Default constructor is called.");
		
	}
	
	public SavingsAccount(double balance, double interestrate) {
		super(balance);
		setInterestRate(interestRate);
		System.out.println("Overloaded constructor is called.");

	}

	public SavingsAccount applyInterest() {
		deposit((interestRate/12));
		
		return this;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public SavingsAccount setInterestRate(double interestRate) {
		if(interestRate >= 0.0)
			this.interestRate = interestRate / 100;
		return this;
	}
	
	public String toString() {
		return "Balance: " + balance + " Interest Rate: " + interestRate;
	}
	
	
}
