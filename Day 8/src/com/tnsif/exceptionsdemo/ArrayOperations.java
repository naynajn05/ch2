package com.tnsif.exceptionsdemo;

public class ArrayOperations {
	int intArr[];

	public ArrayOperations() {
		super();
	}

	public ArrayOperations(int[] intArr) {

		this.intArr = intArr;
	}
	
	public void displayArray()
	{
		for(int arr:intArr)
		{
			System.out.println(arr);
		}
	}
	
	public int getElement(int position)
	{
		return intArr[position];
	}

}
