//Executor class
package com.tnsif.day1.encapsulationdemo;

public class PersonDemo {

	public static void main(String[] args) {
		Person p=new Person();
		p.setName("Ayub");
		p.setAge(23);
		p.setCity("Mumbai");
		System.out.println(p.getAge());
		System.out.println(p);
		
		Person p1=new Person("Sumaiya",12,"Bombay");
		System.out.println(p1);
		
		

	}

}
