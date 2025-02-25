package com.tnsif.day6.methodoverloading;

public class Operations {

	public static boolean isPalindrome(int num)
	{
		int rev=0;
		int dummyNum=num;
		while(num !=0)
		{
			rev=rev*10+num%10;
			num=num/10;
		}
		return dummyNum==rev ;
	}
	
	public static boolean isPalindrome(String message)
	{
		String rev;
		/*
		 * StringBuffer sb=new StringBuffer(message); sb=sb.reverse();
		 * rev=sb.toString();
		 */
		 rev=new StringBuffer(message).reverse().toString();
		
		return message.equals(rev);
		
	}
}
