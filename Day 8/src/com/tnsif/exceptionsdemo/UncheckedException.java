//to demonstrate unchecked exception
package com.tnsif.exceptionsdemo;

public class UncheckedException {

	public static void main(String[] args) {
		int x[];
		try {
			x=new int[] {1,2,3,4,5};
			System.out.println(x[8]);
		} 
		catch (StringIndexOutOfBoundsException e) {
			System.err.println("Error due to "+e.getMessage());
		}
		catch (IndexOutOfBoundsException e) {
			System.err.println("Error caught "+e.getMessage());
		}
		catch (Exception e) {
			System.err.println("Exception due to "+e.getMessage());
		}
		System.out.println("End of the program");

	}

}
