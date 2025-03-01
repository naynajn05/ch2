package com.tnsif.day7.nestedinterfacedemo;

public class Account {
	private int accNo;
	private String accName;
	private double balance;
	//HAS-A
	private Bank bank;
	
	public Account(int accNo, String accName, double balance, Bank bank) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.balance = balance;
		this.bank = bank;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public Bank getBank() {
		return bank;
	}

	public void setBank(Bank bank) {
		this.bank = bank;
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", accName=" + accName + ", balance=" + balance + ", bank=" + bank + "]";
	}
	
	

}
