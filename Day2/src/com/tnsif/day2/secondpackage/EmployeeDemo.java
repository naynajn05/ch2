package com.tnsif.day2.secondpackage;

import com.tnsif.day2.accessmodifiersdemo.Employee;

public class EmployeeDemo extends Employee{

	public static void main(String[] args) {
		Employee e=new Employee();
		EmployeeDemo e1=new EmployeeDemo();
		e.name="Prathemesh";//public
		e.printName();//public 
		e1.id=56;//protected
		e1.printId();
		
		//e.id=12;
		//e.printId();
		//e.dept="Dev";
		//e.printDept();
		//e.salary=6537.65f;
		//e.printsalary();

	}

}
