package com.inheritancedemo;

public class SavingAccount extends BankAccount {
	public SavingAccount(String accountNumber, double balance)
	{
		super(accountNumber, balance);
		
	}

	public void withdraw(double amount) {
		if(getbalance()-amount<100)  // this codition for saving account
		{
			
			System.out.println("You required to maintain the Minimum balance");
		}
		else {
			withdraw (amount);
		}

	}

}
