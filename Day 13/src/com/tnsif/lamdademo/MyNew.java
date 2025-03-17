package com.tnsif.lamdademo;

public class MyNew {

	public static void main(String[] args) {
		MyCube c=(no)-> no*no*no;
		System.out.println(c.getCube(4));
		
		Operations op1=(a,b)->a+b;
		System.out.println(op1.performOperation(1, 8));
		

		Operations op2=(a,b)->a-b;
		System.out.println(op2.performOperation(11, 8));
		
		Operations op3=(a,b)->a*b;
		System.out.println(op3.performOperation(11, 8));
		
		Message msg=(str)->System.out.println("Hello "+str ) ;
		msg.greet("All");
		
		Palindrome<String> p1;
		p1=(str)->{
			
			String rev=new StringBuffer(str).reverse().toString();
			return str.equals(rev);
		};
		System.out.println(p1.checkPalindrome("raceca"));
		
		Palindrome<Integer> p2;
		p2=(no)->
		{
			
		};
		System.out.println(p2.checkPalindrome(121);
		

	}

}
