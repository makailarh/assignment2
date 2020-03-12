package com.meritamerica.assignment2;

import java.util.Date;

public class CDAccount {
	double balance1;
	double interestRate1;
	int term1; 
	long accountNumber1;
	double futureValue1;
	
		//Initialize a constructor
	public CDAccount(CDOffering offering, double openingBalance) {
		this.balance1 = openingBalance;	
	}
	
	//Get balance
	double getBalance() {
		return this.balance1;
	}
	
	//Get interest rate
	double getInterestRate() {
		return interestRate1;
		
	}
	
	//Get term
	int getTerm() {
		return this.term1;
	}
	
	//Get start date
	java.util.Date getStartDate(){
	Date d = new Date();
	return d;
	}
		
	//Get account number
			long getAccountNumber() {
				return MeritBank.getNextAccountNumber();
			}
	
	//future Value
	//FV = PV(1+i)^n	
	double futureValue() {
		double futureValue = this.balance1 * Math.pow((1+this.interestRate1),this.term1);
		return futureValue;
	}
	
}



