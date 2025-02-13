package com.tnsif.day1.scannerclassdemo;

import java.util.Scanner;

public class PersonDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your age");
		int age=sc.nextInt();
		System.out.println("Enter your Gender");
		String gender=sc.next();
		System.out.println("Enter your income");
		int income=sc.nextInt();
		
		Person p=new Person(name,age,income,gender);
		
		TaxCalculator tax=new TaxCalculator();
		tax.calTax(p);
		System.out.println(p);
		
		
		
	}

}
