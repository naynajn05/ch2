//to demonstrate final variable
package com.tnsif.day5.finaldemo;

public class FinalVariable {
	//final variable
	final int X=9;
	
	//final static variable
	final static int Y;
	
	final static int Z=20;
	
	
	static
	{
		Y=34;
		//Z=89;
	}
	
	public void change()
	{
	//	X=30; //can not be reassigned
		
	}
	
	static void print()
	{
		//System.out.print(X);
		System.out.print(Y);
		System.out.print(Z);
		
	}
	
	

}
