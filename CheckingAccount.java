package com.meritamerica.assignment2;

public class CheckingAccount {
	
	double balance;
	
	//Create a constructor	
	public CheckingAccount(double openingBalance) {
			this.balance = openingBalance;
	}
		
	
	//get account balance
	public double getBalance() {
		return this.balance;
	}
	

		//Get account number
		long getAccountNumber() {
			return MeritBank.getNextAccountNumber();
		}

		
	}
		