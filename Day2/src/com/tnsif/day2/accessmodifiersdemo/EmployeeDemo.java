package com.tnsif.day2.accessmodifiersdemo;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee e=new Employee();
		
		e.name="Prathemesh";
		e.printName();
		e.id=12;
		e.printId();
		e.dept="Dev";
		e.printDept();
		
		/*
		 * if(e instanceof Person) { System.out.println(e); }
		 */		
		//e.salary=6537.65f;
		//e.printsalary();

	}

}
