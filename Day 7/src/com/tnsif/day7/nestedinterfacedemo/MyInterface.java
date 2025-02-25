//Nested Interface
package com.tnsif.day7.nestedinterfacedemo;

public interface MyInterface {
	 void calculateArea();
	    interface MyInnerInterface {
	       int  id = 20;
	       void print();     
	    }
}