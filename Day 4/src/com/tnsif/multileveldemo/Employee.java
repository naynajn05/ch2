package com.tnsif.multileveldemo;

//Child class
public class Employee extends Person{

	private int empId;
	private float salary;
	private String dept;
	public Employee() {
		super();
	}
	
	public Employee(String name, int age, String address,int empId, float salary, String dept) {
		super(name,age,address);
		this.empId = empId;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", salary=" + salary + ", dept=" + dept + ", toString()=" + super.toString()
				+ "]";
	}
	
	public void print() {
		System.out.println("Hello");
	}
	
}
