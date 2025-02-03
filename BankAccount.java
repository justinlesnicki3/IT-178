package edu.ilstu;
import java.text.DecimalFormat;

public class BankAccount {
	
	public final DecimalFormat MONEY = new DecimalFormat("$#,##0.00");
	protected double balance;
	
	public BankAccount() {
		balance = 0.0;
	}
	
	public BankAccount(double balance) {
		deposit(balance);
	}
	
	public double getBalance() {
		return balance;
	}
	
	public BankAccount deposit(double amount) {
		if (amount >= 0.0);
		balance += amount;
		
		return this;
	}
	
	public BankAccount withdraw(double amount) {
		if(amount >= 0.0 && amount <= balance)
			balance -= amount;
		
		return this;
	}
	
	public String toString() {
		return "balance is " + MONEY.format(balance);
	}
}
