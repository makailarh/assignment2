package com.meritamerica.assignment2;

public class SavingsAccount {
	
	//declare variables
	double balance;
	double interestRate = 0.01;

	//initialize a constructor
		public SavingsAccount(double savingsAccountOpeningBalance){
			balance = savingsAccountOpeningBalance;
	}
		
	//get account balance
		public double getBalance() {
			return this.balance;	
		}		
	
	//get interest rate
		public double getInterestRate() {
			return this.interestRate;
		}
		//withdraw amount
		public boolean withdraw(double amount) {
			if ((balance-amount)<0) {
				return false;
			}
			else {
				 balance -= amount;
				return true;
				}
		}	
		//deposit amount
		public boolean deposit(double amount) {
			if (amount < 0)	{
				System.out.print("You can only deposit positive amounts");
				return false;
			}
			else {
				balance += amount;
				return true;
			}
						
		}
		//future Value
		//FV = PV(1+i)^n	
		public double futureValue(int years) {
			double futureValue = balance * Math.pow((1+interestRate),years);
			return futureValue;
		}
		//Get account number
				long getAccountNumber() {
					return MeritBank.getNextAccountNumber();
				}

		@Override
		public String toString() {
			
			return 
				"Savings Account Balance: $" +getBalance() //Return balance
				+"Savings Account Interest Rate: $"+getInterestRate()  //Return savings account interest rate
				+"Savings Account Balance in 3 years: $"+futureValue(3); //Return savings value in 3 years
		}
		
		}

		