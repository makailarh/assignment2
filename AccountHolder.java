package com.meritamerica.assignment2;

public class AccountHolder { 
	
	//Declare variables
	private String firstName; 
	private String middleName;
	private String lastName;
	private String ssn;
	private CheckingAccount checkingAccount; 
	private SavingsAccount savingsAccount;
	private CDAccount cDOffering;
	double balance;
	static int savingsIndex = 0;
	static int checkingsIndex = 0;
	static int cDIndex = 0;

	
	//Default constructor to initialize Account Holder Info
	public AccountHolder (String firstName, String middleName, String lastName,  //Default 
			String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
	
		CheckingAccount checking = new CheckingAccount(checkingAccountOpeningBalance);
		
		this.checkingAccount = checking;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		
		SavingsAccount savings = new SavingsAccount(savingsAccountOpeningBalance);
		this.savingsAccount = savings;
	
	
	}
	
	
	//get first name from User
	public String getFirstName() {
		return this.firstName;
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
	
	//Instantiate new checking account array
	CheckingAccount[] checkings = new CheckingAccount[checkingsIndex];
	
	//add new checking account amount
	CheckingAccount addCheckingAccount (double openingBalance) {
		//Find out how many account holders there are
				for (int i=0; i<checkings.length; i++) {
					if(checkings[i] == null) {
						checkingsIndex = i;
						break;
					}
				}
				//Add specified amount of account holders
				try {
					checkings[checkingsIndex] = checkingAccount;
				}
				catch (ArrayIndexOutOfBoundsException e) {
				
			}
				return checkingAccount;
	}

			
	//add new checking account
	CheckingAccount addCheckingAccount (CheckingAccount checkingAccount) {
	
		//Find out how many account holders there are
		for (int i=0; i<checkings.length; i++) {
			if(checkings[i] == null) {
				checkingsIndex = i;
				break;
			}
		}
		//Add specified amount of account holders
		checkings[checkingsIndex] = checkingAccount;
		return checkingAccount;
	}
	
	
	//Checking account[] getCheckingAccounts()
	CheckingAccount[] getCheckingAccounts() {
		return checkings;
	}
	
	//Get number of checking accounts
	int getNumberOfCheckingAccounts() {
		return checkingsIndex;
	}
	
	//Get checking balance
	double getCheckingBalance() {
		int index = 0;
		for (int i=0; i<checkings.length; i++) {
			if(checkings[i] == null) {
				index = i;
				break;
			}
		}
		
		int numbOfCheckings = index;
		double total = 0;
		
		for (int j = 0; j < numbOfCheckings; j++) {
			total = total + checkings[j].getBalance();
		}
		
		return total;
	}
	
//Instantiate new savings account array
SavingsAccount[] savingsAccounts = new SavingsAccount[savingsIndex];
	
	//add new savings account amount
		SavingsAccount addSavingsAccount (double openingBalance) {
			//Find out how many account holders there are
					for (int i=0; i<savingsAccounts.length; i++) {
						if(savingsAccounts[i] == null) {
							savingsIndex = i;
							break;
						}
					}
					//Add specified amount of account holders
					try {
						savingsAccounts[savingsIndex] = savingsAccount;
					}
					catch (ArrayIndexOutOfBoundsException e) {
					
					}return savingsAccount;
				}
		
				
		//add new savings account, overloading
		SavingsAccount addSavingsAccount (SavingsAccount savingsAccount) {
		
			//Find out how many account holders there are
			for (int i=0; i<savingsAccounts.length; i++) {
				if(savingsAccounts[i] == null) {
					savingsIndex = i;
					break;
				}
			}
			//Add specified amount of account holders
			savingsAccounts[savingsIndex] = savingsAccount;
			return savingsAccount;
		}

		
	//Savings account[] getSavingsAccounts()
	SavingsAccount[] getSavingsAccount() {
			return savingsAccounts; 
	}
	
	//Get number of savings accounts	
	int getNumberOfSavingsAccounts() {
			return savingsIndex;
	}
	
	//Get savings balance
		double getSavingsBalance() {
			int index = 0;
			for (int i=0; i<savingsAccounts.length; i++) {
				if(savingsAccounts[i] == null) {
					index = i;
					break;
				}
			}
			
			int numbOfSavings = index;
			double total = 0;
			
			for (int j = 0; j < numbOfSavings; j++) {
				total = total + savingsAccounts[j].getBalance();
			}
			
			return total;
		}
		
		
		//Instantiate new CDAccount account array
		CDAccount[] cDAccount = new CDAccount[cDIndex];
			
			//add new CDOFfering account amount
				CDAccount addCDAccount (CDOffering offering, double openingBalance) {
					//Find out how many account holders there are
							for (int i=0; i<cDAccount.length; i++) {
								if(cDAccount[i] == null) {
									cDIndex = i;
									break;
								}
							}
							//Add specified amount of account holders
							cDAccount[cDIndex] = cDOffering;
							return cDOffering;
						}
				
						
				//add new CD account, overloading
				CDAccount addCDAccount (CDAccount cdAccount) {
				
					//Find out how many account holders there are
					for (int i=0; i<cDAccount.length; i++) {
						if(cDAccount[i] == null) {
							cDIndex = i;
							break;
						}
					}
					//Add specified amount of account holders
					cDAccount[cDIndex] = cdAccount;
					return cdAccount;
				}

				
			//CD account[] getCDAccounts()
			CDAccount[] getCDAccounts() {
					return cDAccount; 
			}
			
			//Get number of savings accounts	
			int getNumberOfCDAccounts() {
					return cDIndex;
			}
			
			//Get savings balance
				double getCDBalance() {
					int index = 0;
					for (int i=0; i<cDAccount.length; i++) {
						if(cDAccount[i] == null) {
							index = i;
							break;
						}
					}
					
					int numbOfSavings = index;
					double total = 0;
					
					for (int j = 0; j < numbOfSavings; j++) {
						total = total + cDAccount[j].getBalance();
					}
					
					return total;
				}
				
			
	//Get combined balance
	double getCombinedBalance() {
		int numbOfSavings = savingsIndex;
		int numbOfCheckings = checkingsIndex;
		int numbOfCD = cDIndex;
		double totalSavings = 0;
		double totalCheckings = 0;
		double totalCDOfferings = 0;
		for (int j = 0; j < numbOfSavings; j++) {
				totalSavings = totalSavings + savingsAccounts[j].getBalance();
		}
		for (int j = 0; j < numbOfCheckings; j++) {
			totalCheckings = totalCheckings + checkings[j].getBalance();
	}
		for (int j = 0; j < numbOfCD; j++) {
			totalCDOfferings = totalCDOfferings + cDAccount[j].getBalance();
	}
		double combined = totalSavings + totalCheckings + totalCDOfferings;
		return combined;
	}
	
				
	//get checking account number
	public CheckingAccount getCheckingAccountNumber() {
		return this.checkingAccount;
	}
	
	//get savings account number
	public SavingsAccount getSavingsAccountNumber() {
		return this.savingsAccount;
	}

	
	@Override
	public String toString() {
		
		return "Name: " + firstName + " " + middleName + " " + lastName  //Return name
				+"SSN: " + ssn //Return social
				+"Checking Account Balance: $" + checkingAccount.getBalance() //Return balance
				+"Checking Account Interest Rate: $"+checkingAccount.getInterestRate()  //Return checking account interest rate
				+"Checking Account Balance in 3 years: $"+checkingAccount.futureValue(3) //Return checking value in 3 years
				+"Savings Account Balance: $"+savingsAccount.getBalance() //Return savings account balance
				+"Savings Account Interest Rate: $"+savingsAccount.getInterestRate() //Return savings account interest rate
				+"Savings Account Balance in 3 years: $"+savingsAccount.futureValue(3); //Return savings value in 3 years
	} 
		
	
	

	 
}