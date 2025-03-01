//to demonstarte Abstraction
package com.tnsif.day7.nestedinterfacedemo;

public interface Bank {
	//variable //static and final
	double MIN_BAL=5000;
	double DEPOSIT_LIMIT=25000;
	double WITHDRAWAL_LIMIT=25000;
	
	//methods //all methods are by default public and abstract
	 void deposit(Account account,double amount) ;
	
	 void withdraw(Account account,double amount);

}
