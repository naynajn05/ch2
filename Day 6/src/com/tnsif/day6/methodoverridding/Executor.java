package com.tnsif.day6.methodoverridding;

public class Executor {

	public static void main(String[] args) {
		/*
		 * Shape s; s=new Shape(); s.CalArea(); s.draw(); s.erase();
		 * 
		 * s=new Circle(4); s.CalArea(); s.draw(); s.erase();
		 * 
		 * s=new Square(2,4); s.CalArea(); s.draw(); s.erase();
		 */
		
		Shape[] shape=new  Shape[3];
		
		shape[0]=new Shape();
		shape[1]=new Circle(5);
		shape[2]=new Square(3,5);
		
		for(Shape s:shape)
		{
			s.CalArea();
			s.draw();
			s.erase();
		}
	}

}
