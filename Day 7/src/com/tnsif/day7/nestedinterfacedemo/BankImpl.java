package com.tnsif.day7.nestedinterfacedemo;

public class BankImpl implements Bank,Test {

	@Override
	public void deposit(Account account, double amount) {
		if(amount >=DEPOSIT_LIMIT)
		{
			System.err.println("Deposit limit is exceeded");
		}
		else
		{
			account.setBalance(account.getBalance()+amount);
		}
		
	}

	@Override
	public void withdraw(Account account, double amount) {
		if(account.getBalance()-amount>MIN_BAL)
		{
			account.setBalance(account.getBalance()-amount);
			
		}
		else
		{
			System.err.println("Insufficient balance");
		}
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

}
