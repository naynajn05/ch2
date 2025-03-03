package com.tnsif.exceptionsdemo;

public class ArrayDemo {

	public static void main(String[] args) {
		try {
			ArrayOperations arr=new ArrayOperations(new int[] {12,78,86,67});
			arr.displayArray();
			System.out.println(arr.getElement(8));
            
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception due to "+e.getMessage());
		}
		System.out.println("Hello");
	}

}
