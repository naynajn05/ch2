package com.tnsif.day7.nestedinterfacedemo;

@FunctionalInterface
public interface Greet {
	void print();
	
	static void display()
	{
		System.out.println("Display");
	}

	default void display1()
	{
		System.out.println("Display");
	}

}
