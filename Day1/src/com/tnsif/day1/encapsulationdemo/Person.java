//to demonstrate encapsulation concept
package com.tnsif.day1.encapsulationdemo;

//Entity class
public class Person {
	//data member
	private String name;
	private int age;
	private String city;
	
	//Default Constructor
	public Person() {
		System.out.println("Default constructor");
	}
	
	
	//Parametr. constructor
	public Person(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}



	//getters and setter
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	//Object class
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
	
	
	
	

}



