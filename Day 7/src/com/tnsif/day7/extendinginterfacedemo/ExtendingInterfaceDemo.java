//multiple inheritance - 
package com.tnsif.day7.extendinginterfacedemo;

public class ExtendingInterfaceDemo implements ChildInterface {
	// Override ChildInterface method
	public void print() { 
		System.out.println("print method");
	}

	// Override InterfaceOne method
	public void show() {
		System.out.println("show Method");
	}
}

