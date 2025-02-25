//Program to define abstract class
package com.tnsif.day7.abstarctclassdemo;

//abstract class//Parent
public abstract  class Shape {
     protected float area;
     
     //abstract method 
	 abstract void calArea();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }
}
	 