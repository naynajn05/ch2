package com.tnsif.day2.accessmodifiersdemo;

//Entity -Base class
public class Employee {
	public String name;
	private float salary;
	protected int id;
	String dept;
	
	//constructor
	private  Employee() {
		
		
	}

	//public method
	public void printName()
	{
		System.out.println("Name of the Employee is "+name);
	}

	//private method
		private void printSalary()
		{
			System.out.println("Salary of the Employee is "+salary);
		}

		//protected method
		protected void printId()
		{
			System.out.println("Id of the Employee is "+id);
		}
		
		//Default method
		 void printDept()
		{
			System.out.println("Dept of the Employee is "+dept);
		}

		@Override
		public String toString() {
			return "Employee [name=" + name + ", salary=" + salary + ", id=" + id + ", dept=" + dept + "]";
		}


		 
		 
}
