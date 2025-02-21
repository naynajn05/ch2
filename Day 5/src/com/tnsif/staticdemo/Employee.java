package com.tnsif.staticdemo;

//Entity class
public class Employee {
	//data member
	private String name;
	private int id;
	private String dept;
	private int salary;
	private static String companyName="TCS";
	
	

	public Employee(String name, int id, String dept, int salary) {
		super();
		this.name = name;
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", dept=" + dept + ", salary=" + salary + ", companyName="
				+ companyName + "]";
	}
	
	

}
