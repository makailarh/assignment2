package com.meritamerica.assignment2;

public class AccountHolder { 
	
	
	//****INSTANCE VARIABLES ARE IN BLUE****//
	
	
	//Declare variables
	private String firstName; 
	private String middleName;
	private String lastName;
	private String ssn;
	double balance;
	int savingsIndex;
	int checkingsIndex;
	int cDIndex;
	
	//Declaring a new checking account array
	private CheckingAccount[] checkings;
	
	//Declare a new savings account array
	private SavingsAccount[] savings;
	
	//Declare a new CD Account array
	private CDAccount[] cDAccounts;

	//Default constructor to initialize Account Holder Info
	public AccountHolder (String firstName, String middleName, String lastName,  //Default 
			String ssn) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		this.checkings = new CheckingAccount[10];	
		this.checkingsIndex = 0;  //number of checking accounts in array
		
		this.savings = new SavingsAccount[10];
		this.savingsIndex = 0; //number of savings accounts in array
		
		this.cDAccounts = new CDAccount[10];
		this.cDIndex = 0; //number of CD accounts in the array
	
	}
	
	
	//get first name from User
	public String getFirstName() {
		return firstName;
	}
	//set first name
	public void setFirstName(String name) {
		this.firstName = name;
	}
	
	//get middle name from User
	public String getMiddleName() {
		return this.middleName;	
	}
	
	//set middle name
	public void setMiddleName(String name) {
		this.middleName = name; 
	}	
	
	//get last name
	public String getLastName() {
		return this.lastName;
	}
	
	//set last name
	public void setLastName(String name) {
		this.lastName = name;
	}
	
	//get SSN
	public String getSSN() {
		return this.ssn;
	}
	
	//set SSN
	public void setSSN(String number) {
		this.ssn = number; 
	}
	
	
	// **** CHECKINGS **** //
	
	
	//construct new checking account
	CheckingAccount addCheckingAccount (double openingBalance) {
		
		CheckingAccount placeholder = new CheckingAccount(openingBalance);
		return addCheckingAccount(placeholder);
		
	}
			
	//add new checking account
	CheckingAccount addCheckingAccount (CheckingAccount checkingAccount) {		
	
		if (this.getCombinedBalanceWithoutCD() < 250000) {
		
		//Is array of checking accounts at capacity?
		
				if (this.checkingsIndex +1 > this.checkings.length) {
					
					//If array is at capacity, then we need to create a new array with a larger capacity
					CheckingAccount[] largerChecking = new CheckingAccount[this.checkings.length+10];
					
					//Then we have to copy the contents from the existing array
					for (int i=0; i < this.checkings.length; i++) {
						largerChecking[i] = this.checkings[i];
					}
					
					//then we have to assign the new larger array to our checking account array instance variable
					this.checkings = largerChecking;
					
				}
				
				//and assign it to the next index of the checking account array
				this.checkings[this.checkingsIndex] = checkingAccount;
				this.checkingsIndex++;
			
						return checkingAccount;
		}
		else
			return null;
	}
	
	//Checking account[] getCheckingAccounts()
	CheckingAccount[] getCheckingAccounts() {
		return this.checkings;
	}
	
	//Get number of checking accounts
	int getNumberOfCheckingAccounts() {
		return this.checkingsIndex;
	}
	
	//Call upon the get balance method
	double getCheckingBalance() {
		
		int numbOfCheckings = this.checkingsIndex;
		double total = 0;
		
		for (int j = 0; j < numbOfCheckings; j++) {
			total = total + this.checkings[j].getBalance();
		}
		
		return total;
	}
	
	

	// **** SAVINGS **** //
				

	
	//construct new savings account
		SavingsAccount addSavingsAccount (double openingBalance) {
			
			SavingsAccount placeholder = new SavingsAccount(openingBalance);
			return addSavingsAccount(placeholder);
			
		}
				
		//add new savings account
		SavingsAccount addSavingsAccount (SavingsAccount savingsAccount) {		
		
			//Check to see if account holder has more than 250000 in combined savings and checking accounts
			if (this.getCombinedBalanceWithoutCD() < 250000) {
			
			//Is array of savings accounts at capacity?
			
					if (this.savingsIndex +1 > this.savings.length) {
						
						//If array is at capacity, then we need to create a new array with a larger capacity
						SavingsAccount[] largerSavings = new SavingsAccount[this.savings.length+10];
						
						//Then we have to copy the contents from the existing array
						for (int i=0; i < this.savings.length; i++) {
							largerSavings[i] = this.savings[i];
						}
						
						//then we have to assign the new larger array to our savings account array instance variable
						this.savings = largerSavings;
						
					}
					
					//and assign it to the next index of the savings account array
					this.savings[this.savingsIndex] = savingsAccount;
					this.savingsIndex++;
				
							return savingsAccount;
			}
			else
				
				//Do not allow to open new account if they have over $250,000 in combined accounts
				return null;
		}
		
		//Savings Account[] getSavingsAccounts()
		SavingsAccount[] getSavingsAccounts() {
			return this.savings;
		}
		
		//Get number of savings accounts
		int getNumberOfSavingsAccounts() {
			return this.savingsIndex;
		}
		
		//Call upon the get balance method
		double getSavingsBalance() {
			
			int numbOfSavings = this.savingsIndex;
			double total = 0;
			
			for (int j = 0; j < numbOfSavings; j++) {
				total = total + this.savings[j].getBalance();
			}
			
			return total;
		}
		
		
		// **** CD ACCOUNTS **** //
		
		
		//construct new CD account
			CDAccount addCDAccount (CDOffering offering, double openingBalance) {
				
				CDAccount placeholder = new CDAccount(offering, openingBalance);
				return addCDAccount(placeholder);
				
			}
					
			//add new CD account
			CDAccount addCDAccount (CDAccount cDAccount) {		
				
				//Is array of CD accounts at capacity?
				
						if (this.cDIndex  > this.cDAccounts.length) {
							
							//If array is at capacity, then we need to create a new array with a larger capacity
							CDAccount[] largerCDAccount = new CDAccount[this.cDAccounts.length+10];
							
							//Then we have to copy the contents from the existing array
							for (int i=0; i < this.cDAccounts.length; i++) {
								largerCDAccount[i] = this.cDAccounts[i];
							}
							
							//then we have to assign the new larger array to our CD account array instance variable
							this.cDAccounts = largerCDAccount;
							
						}
						
						//and assign it to the next index of the CD account array
						this.cDAccounts[this.cDIndex] = cDAccount;
						this.cDIndex++;
					
								return cDAccount;
				}
				
			
			//CDAccount[] getCDAccounts()
			CDAccount[] getCDAccounts() {
				return this.cDAccounts;
			}
			
			//Get number of CD accounts
			int getNumberOfCDAccounts() {
				return this.cDIndex;
			}
			
			//Call upon the get balance method
			double getCDBalance() {
				
				int numbOfCD = this.cDIndex;
				double total = 0;
				
				for (int j = 0; j < numbOfCD; j++) {
					total = total + this.cDAccounts[j].getBalance();
				}
				
				return total;
			}
		
			
		// **** COMBINED BALANCES **** //
		
		
	//Get combined balance
	double getCombinedBalance() {
		int numbOfSavings = this.savingsIndex;
		int numbOfCheckings = this.checkingsIndex;
		int numbOfCD = this.cDIndex;
		double totalSavings = 0;
		double totalCheckings = 0;
		double totalCDOfferings = 0;
		for (int j = 0; j < numbOfSavings; j++) {
				totalSavings = totalSavings + this.savings[j].getBalance();
		}
		for (int j = 0; j < numbOfCheckings; j++) {
			totalCheckings = totalCheckings + this.checkings[j].getBalance();
	}
		for (int j = 0; j < numbOfCD; j++) {
			totalCDOfferings = totalCDOfferings + this.cDAccounts[j].getBalance();
	}
		double combined = totalSavings + totalCheckings + totalCDOfferings;
		return combined;
	}
	
	//Get combined balance without CD accounts
	
	
	double getCombinedBalanceWithoutCD() {
		int numbOfSavings = this.savingsIndex;
		int numbOfCheckings = this.checkingsIndex;
		double totalSavings = 0;
		double totalCheckings = 0;
		for (int j = 0; j < numbOfSavings; j++) {
				totalSavings = totalSavings + this.savings[j].getBalance();
		}
		for (int j = 0; j < numbOfCheckings; j++) {
			totalCheckings = totalCheckings + this.checkings[j].getBalance();
	}
		double combined = totalSavings + totalCheckings;
		return combined;
	}
	 
}