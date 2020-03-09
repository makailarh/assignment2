package com.meritamerica.assignment2;

public class MeritAmericaBankApp {
	
	public static void main(String[] args) { // Main class
		
			//Add 5 CDOfferings to MeritBank
			//MeritBank.cDOfferings[5];
			
			//Add new account holder named ah1
			AccountHolder ah1 = new AccountHolder("John", "James", "Doe",
					"123-45-6789", 100, 1000); //Define parameters
			
			//Checking opening balance of $1000 & savings of $10,000
			try  {
				ah1.addCheckingAccount(1000);
			}catch (ArrayIndexOutOfBoundsException e){
				
			}
			try {
				ah1.addSavingsAccount(10000);
			}
			catch (ArrayIndexOutOfBoundsException e) {
			
			}
			
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
			try {if (ah1.checkings[3] == null) {
				System.out.println("Last entered account was not created");
			}
			}
			catch (ArrayIndexOutOfBoundsException e) {
				
			}
			
			
			//Add the best CD offering
			MeritBank.getBestCDOffering(0);
		
			//Add ah1 to list of account holders
			//ah1.add
			
			
		}
	
	}
