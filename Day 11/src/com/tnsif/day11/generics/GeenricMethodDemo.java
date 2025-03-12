package com.tnsif.day11.generics;

public class GeenricMethodDemo {

	public static void main(String[] args) {
		GenericMethod g=new GenericMethod();
		
		Integer[] num= {1,6,7,9,12,67,78};
		g.displayElements(num);
		
		String[] names= {"Sumaiya","Prithvi","Bilal","Pragati"};
		g.displayElements(names);
		
		

	}

}
