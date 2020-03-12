package com.meritamerica.assignment2;


public class MeritBank {


	static int accountsIndex = 0;
	static int cDIndex = 0;
	static int best = 0;
	static int secondBest = 0;
	static int accountNumber = 12345;
	static int accountAmounts = 0;
	
	//Declare a new account holder array
	static private AccountHolder[] accounts;
	

		
	//Add account holder method
	static void addAcountHolder (AccountHolder accountHolder) {	
		
			//Define instance variables
	accounts = new AccountHolder[5];
	
		//Is array of account holders at capacity?
		
		if (accountsIndex +1 > accounts.length) {
			
			//If array is at capacity, then we need to create a new array with a larger capacity
			AccountHolder[] moreAccounts = new AccountHolder[accounts.length+10];
			
			//Then we have to copy the contents from the existing array
			for (int i=0; i < accounts.length; i++) {
				moreAccounts[i] = accounts[i];
			}
			
			//then we have to assign the new larger array to our account holders array instance variable
			accounts = moreAccounts;
			
		}
		
		//and assign it to the next index of the checking account array
		accounts[accountsIndex] = accountHolder;
		accountsIndex++;
		accountNumber++;
		
	}
	
	//AccountHolder[] getAccountHolders()
	static AccountHolder[] getAccountHolders() {
		return accounts;
	}
			
	
	//Instantiate CD offerings, same amount as account holders
	static CDOffering[] cDOfferings = new CDOffering[accountsIndex];
	
	
	//Get CDOfferings
	static CDOffering[] getCDOfferings() {
		return cDOfferings;
	}
	
	//Get best CDOffering
	static CDOffering getBestCDOffering(double depositAmount) {
		double highestYield =0;
		double yield = 0;
		int bestIndex = 0;
		for (int i=0; i<cDOfferings.length; i++) {  
			yield = MeritBank.futureValue(depositAmount, cDOfferings[i].getInterestRate(), cDOfferings[i].getTerm());
			if (yield > highestYield) {
				highestYield = yield;
				bestIndex = i;
			}
		}
		return cDOfferings[bestIndex];
	}

	
	//Get second best CDOffering
	static CDOffering getSecondBestCDOffering(double depositAmount) {
		double highestYield = 0;
		double yield = 0;
		int secondBestIndex = 0;
		for (int i=0; i<cDOfferings.length; i++) {
			yield = MeritBank.futureValue(depositAmount, cDOfferings[i].getInterestRate(), cDOfferings[i].getTerm());
			if (highestYield == 0) {
				highestYield = i; }
			else if (yield < highestYield && yield > secondBestIndex) {
				highestYield=yield;
				secondBestIndex = i;
			}
		}
		return cDOfferings[secondBestIndex];
	}
	
	//Clear all CDOfferings
	static void clearCDOfferings() {
		for (int i = 0; i < cDOfferings.length; i++) {
			cDOfferings[i]=null;
		}
	}
	
	//set CDOfferings
	static void setCDOfferings(CDOffering[] offerings) {
		cDOfferings = offerings;
	}
	
	//Get next account number
	static long getNextAccountNumber() {
		return accountNumber;
	}
	
	//Return the total balances
	static double totalBalances() {
	 double sum = 0;
	 for (AccountHolder holder : accounts) {
		 sum += holder.getCheckingBalance();
		 sum += holder.getSavingsBalance();
		 sum += holder.getCDBalance();
	 }
	 return sum;
	}
	
	//future Value
	//FV = PV(1+i)^n	
	public static double futureValue(double presentValue, double interestRate, int term) {
		double futureValue = presentValue * Math.pow((1+interestRate),term);
		return futureValue;
	}
	
	
	
	
	
	
	
	
	
	
	
}