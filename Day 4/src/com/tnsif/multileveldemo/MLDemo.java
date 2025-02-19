package com.tnsif.multileveldemo;

public class MLDemo {

	public static void main(String[] args) {
		Manager m1=new Manager("Ritik",32, "Airoli",5000, 120000.7f, "Development",4, "Java");
		System.out.println(m1);
		
		
		Person p=new Person();
		p.display();
	
		Employee e=new Employee();
		e.display();
		e.print();
		
		m1.display();
		m1.print();
		m1.greet();
		System.out.println(m1.toString());
		System.out.println(e.toString());
		System.out.println(p.toString());

	}

}
