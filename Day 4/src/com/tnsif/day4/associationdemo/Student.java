package com.tnsif.day4.associationdemo;

//Container class
public class Student {
	
	private String name;
	private int age;
	//association //Dependency
	private Address address;
	
	
	public Student() {
		super();
	}


	public Student(String name, int age, Address address) {
		super();
		this.name = name;
		this.age = age;
		this.address = address;
	}


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


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}





	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	
	

}
