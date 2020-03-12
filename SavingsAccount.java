package com.meritamerica.assignment2;

public class SavingsAccount {
	
		
double balance;
	
	//Create a constructor	
	public SavingsAccount(double openingBalance) {
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

		