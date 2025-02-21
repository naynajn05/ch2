package com.tnsif.staticdemo;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass m1=new MyClass(); //section=1 //roomNo=101
		
		System.out.println(m1);
		
		
		MyClass m2=new MyClass(); //section=1 //roomNo=101
		
		System.out.println(m2);
		
		
		MyClass m3=new MyClass(); //section=1 //roomNo=101
		
		System.out.println(m3);
		
		MyClass.print();
	}

}
