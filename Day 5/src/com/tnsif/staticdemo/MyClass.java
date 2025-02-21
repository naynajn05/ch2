//to demonstrate static method & static block
package com.tnsif.staticdemo;

public class MyClass {
	
	private int section;
	private static int roomNo;
		
	static
	{
		System.out.println("Inside static block");
		roomNo=100;
		//section=10;
		
	}
	
	public MyClass()
	{
		System.out.println("default constructor");
		section++;
		roomNo++;
	}

	


	
	@Override
	public String toString() {
		return "MyClass [section=" + section + ",roomNo="+roomNo+"]";
	}





	//static method
	public static void print()
	{
		//System.out.println("Section is "+section);
		System.out.println("roomNo is "+roomNo);
	}
	
}
