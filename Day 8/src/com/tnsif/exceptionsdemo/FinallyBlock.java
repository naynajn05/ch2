//Program to demonstrate Finally block

package com.tnsif.exceptionsdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {
			System.out.print("Enter the number : ");
			int number = scanner.nextInt();
			System.out.println(number > 0 ? number + " is Positive" : number + " is Negative");
			return;
		} catch (InputMismatchException e) {
			System.err.println("Invalid input...");

		} finally {
			System.out.println("In Finally....");
			scanner.close();
		}

	}
}