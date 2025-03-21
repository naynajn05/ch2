package com.tnsif.junit5demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
//.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


//@Disabled
//@Test
public class MyTestClass {
	
	@Test
	public void squareTest()
	{	
		int ActualOutput=ArithmeticOperations.getSquare(-2);
		int ExpectedOutput=4;
		assertEquals(ExpectedOutput, ActualOutput);
	}
	
	@Disabled
	@Test
	public void MaxArrayTestOne()
	{
		int a[]= {-12,-23,-34,-5,-30};
		int max=ArithmeticOperations.findMaximum(a);
		assertEquals(-5, max);
	}
	
	@Test
	public void MaxArrayTestTwo()
	{
		int a[]= {12,0,23,34,5,-30};
		int max=ArithmeticOperations.findMaximum(a);
		assertEquals(34, max);
	}
	
	@Test
	public void palindromeTestOne()
	{
		boolean status=ArithmeticOperations.checkPalindrome(121);
		assertEquals(true,status);
		
		//assertTrue(ArithmeticOperations.checkPalindrome(121));
	}
	
	@Test
	public void palindromeTestTwo()
	{
		assertFalse(ArithmeticOperations.checkPalindrome(123));		
	}

}