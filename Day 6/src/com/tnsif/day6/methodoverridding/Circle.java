package com.tnsif.day6.methodoverridding;

public class Circle extends Shape {
	private int radius;
	
	
	public Circle(int radius) {
		
		this.radius = radius;
	}

	public void CalArea()
	{
		double area=3.14*radius*radius;
		System.err.println("Area of the circle is "+area);
	}
	
	public void draw()
	{
		System.out.println("Drawing a Circle");
	}

	public void erase()
	{
		System.out.println("Erasing a Circle");
	}


}
