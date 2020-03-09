package com.meritamerica.assignment2;


public class MeritBank {

	//Instantiate account holders, start at capacity of 100
	static AccountHolder[] accountHolders = new AccountHolder[100];

	static int index = 0;
	static int best = 0;
	static int secondBest = 0;
	static int accountNumber = 12345;
		
	//Add account holder method
	static void addAccountHolder(AccountHolder accountHolder) {
		
		//Find out how many account holders there are
		for (int i=0; i<accountHolders.length; i++) {
			if(accountHolders[i] == null) {
				index = i;
				break;
			}
		}
		//Add specified amount of account holders
		accountHolders[index] = accountHolder;
		accountNumber++;
	}
		///Instantiate CD offerings, same amount as account holders
	static CDOffering[] cDOfferings = new CDOffering[index];
	
	//Get Account Holder
	static AccountHolder[] getAccountHolders() {	
		return accountHolders;
	}
	
	//Get CDOfferings
	static CDOffering[] getCDOfferings() {
		return cDOfferings;
	}
	
	//Get best CDOffering
	static CDOffering getBestCDOffering(double depositAmount) {
		double highestYield =0;
		double yield =0;
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
		double yield =0;
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
			index = 0;
		}
	}
	
	//Get next account number
	static long getNextAccountNumber() {
		return accountNumber;
	}
	
	//Return the total balances
	static double totalBalances() {
	 double sum = 0;
	 for (AccountHolder holder : accountHolders) {
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