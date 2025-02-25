package com.tnsif.day6.methodoverridding;

//parent
public class Shape {
	
	public void CalArea()
	{
		System.err.println("Area of the shape is ");
	}
	
	public void draw()
	{
		System.out.println("Drawing a shape");
	}

	public void erase()
	{
		System.out.println("Earsing a shape");
	}
}
