package com.objectsandclasses;

public class MoneyMoneyBank {
	private double accountNumber;
	
	private String firstName;
	private double initialBalance;
	static double accountBalance;
	private static double  amount;
	private static double nextAccountnumber=500;
	public void MoneyMoneyBank(String firstName , double initialBalance) {
		
		this.setFirstName(firstName);
		this.setInitialBalance(initialBalance);
		this.accountNumber=accountNumber++;
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public double getInitialBalance() {
		return initialBalance;
	}
	public void setInitialBalance(double initialBalance) {
		this.initialBalance = initialBalance;
	}
	
	public static double getAmount() {
		return amount;
	}
	public static void setAmount(double amount) {
		MoneyMoneyBank.amount = amount;
	}
	public double getAccountNumber() {
		return accountNumber;
	}
	
	public double getnextAccountNumber() {
		return accountNumber++;
		
	}

	public void setAccountNumber(double accountNumber) {
		this.accountNumber = accountNumber;
	}


	public static double getAccountBalance() {
		return accountBalance;
	}


	public static void setAccountBalance(double accountBalance) {
		MoneyMoneyBank.accountBalance = accountBalance;
	}

	
	public double Withdraw( int accountBalance,int amount) {
		
		return accountBalance-amount;
		
	}
	
	public double Deposite(int accountBalance,int amount) {
		return  accountBalance+amount;
		
		
	}
	
	
}
