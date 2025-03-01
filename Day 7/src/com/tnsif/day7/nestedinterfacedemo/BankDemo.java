package com.tnsif.day7.nestedinterfacedemo;

public class BankDemo {

	public static void main(String[] args) {
		Bank bank=new BankImpl(); //dynamic binding
		
		Account acc=new Account(123,"Ritik",500000,bank);
		
		bank.deposit(acc, 2000);
		System.out.println(acc);
		
		bank.withdraw(acc, 500000);
		System.out.println(acc);
		
		
		

	}

}
