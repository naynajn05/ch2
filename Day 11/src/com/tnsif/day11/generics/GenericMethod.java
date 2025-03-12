package com.tnsif.day11.generics;

public class GenericMethod {
	
	public <E> void displayElements(E[] elements)
	{
		for( E e:elements)
		{
			System.out.println(e);
		}
	}

}
