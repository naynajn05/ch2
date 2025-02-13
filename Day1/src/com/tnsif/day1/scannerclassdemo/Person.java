package com.tnsif.day1.scannerclassdemo;

//entity class
public class Person {
	//data members
	private String name;
	private int age;
	private int income;
	private String gender;
	private int tax;
	
	
	
	
	public Person() {
		super();
	}

	//Para.constr.
	public Person(String name, int age, int income, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.income = income;
		this.gender = gender;
	}
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getIncome() {
		return income;
	}
	public void setIncome(int income) {
		this.income = income;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getTax() {
		return tax;
	}
	public void setTax(int tax) {
		this.tax = tax;
	}
	
	
	//object class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", income=" + income + ", gender=" + gender + ", tax=" + tax
				+ "]";
		
		
	}
	

	
}
