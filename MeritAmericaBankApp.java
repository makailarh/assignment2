package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) { // Main class
		
			//Add 5 CDOfferings to MeritBank
			CDOffering new1 = new CDOffering(1,1.8);
			CDOffering new2 = new CDOffering(2,1.9);
			CDOffering new3 = new CDOffering(3,2.0);
			CDOffering new4 = new CDOffering(5,2.5);
			CDOffering new5 = new CDOffering(10,2.2);
			
			//Add new account holder named ah1
			AccountHolder ah1 = new AccountHolder("John", "James", "Doe", "345-21-2044");
			
			//Checking opening balance of $1000 & savings of $10,000
				ah1.addCheckingAccount(1000);
				ah1.addSavingsAccount(10000);
			
			//Checking opening balance of $5000 & savings of $50,000
			ah1.addCheckingAccount(5000);
			ah1.addSavingsAccount(50000);
			
			//Checking opening balance of $50,000 & savings of $500,000
			ah1.addCheckingAccount(50000);
			ah1.addSavingsAccount(500000);
			
			//Checking opening balance of $5000 & savings of $50,000
			ah1.addCheckingAccount(5000);
			ah1.addSavingsAccount(50000);
			
			//Confirm last checking and savings were not created	
			
			
			//Add the best CD offering
			CDOffering bestCD = MeritBank.getBestCDOffering(5);
			ah1.addCDAccount(bestCD, 5);
		
			//Add ah1 to list of account holders
			MeritBank.addAcountHolder(ah1);
			
			//Add new account holder named ah2
			AccountHolder ah2 = new AccountHolder("Jane","Cake","Face","234-54-1234");
			
			//Add a checking account with an opening balance of $1000 in checking and $10000 in savings
			ah2.addCheckingAccount(1000);
			ah2.addSavingsAccount(10000);
			
			//Add the second best CD offering
			CDOffering secondBest = MeritBank.getSecondBestCDOffering(5);
			ah2.addCDAccount(secondBest, 5);
			
			//Add ah2 to the list of account holders
			MeritBank.addAcountHolder(ah2);
			
			//Clear the CDs being offered
			MeritBank.clearCDOfferings();
			
			//Instantiate a new account holder ah3
			AccountHolder ah3 = new AccountHolder("Bubble","Blue","Yellow","234-789-0098");
			
			//Assign second best to ah3
			CDOffering secondBest1 = MeritBank.getSecondBestCDOffering(5);
			ah2.addCDAccount(secondBest1, 5);
			
			//Confirm last account was not created on ah3
			
			
			//Add checking and savings to ah3 $1000 and $10000
			ah3.addCheckingAccount(1000);
			ah3.addSavingsAccount(10000);
			
			//Add ah3 to list of account holders
			MeritBank.addAcountHolder(ah3);
			
			//Get total balance of all account holders
		}
	
	}
