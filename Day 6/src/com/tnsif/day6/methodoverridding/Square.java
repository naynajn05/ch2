package com.tnsif.day6.methodoverridding;

public class Square extends Shape {
	
	int height,base;
	
	
	public Square(int height, int base) {
		
		this.height = height;
		this.base = base;
	}


	public void CalArea()
	{
		double area=height*base;
		System.err.println("Area of the circle is "+area);
	}
	
	
	public void draw()
	{
		System.out.println("Drawing a Square");
	}

	public void erase()
	{
		System.out.println("Erasing a Square");
	}


}
