package com.inheritancedemo;

public class BankAccount extends Object {
	
	public String accountNumber;
	public double balance;
	
	public BankAccount(String accountNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.balance=balance;
	}
	
public void deposit(double amount)
{
	//balance= balance+amount;
    balance+= amount;	
}
public void withdraw(double amount)
{	
  if(balance >=amount)
  {// balance-balance=amount;
	  balance-=amount;  
  }else {
	  System.out.println("Insufficient Amount");
  }
	}
public double getbalance()
{return balance;
}
}	

//	public BankAccount() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}


