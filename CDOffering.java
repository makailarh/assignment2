package com.meritamerica.assignment2;

public class CDOffering {
	int term1;
	double interestRate1;
	double balance1; 
	
	
		//Initialize a constructor
	public CDOffering(int term, double interestRate) {
		term1 = term;
		interestRate1 = interestRate;
	}
		//get current term
	public int getTerm() {
			return this.term1;
		
	}
		//get interest rate
	public double getInterestRate() {
			return interestRate1;
	}
	
}

