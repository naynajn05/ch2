package com.tnsif.day11.generics;

public class GenericClassDemo {

	public static void main(String[] args) {
		GenericClass<Integer> gc=new GenericClass<>();
		gc.setData(10);
		System.out.println(gc.getData());
		
		GenericClass<String> gc1=new GenericClass<>();
		gc1.setData("Nayna");
		//gc1.setData(10);
		System.out.println(gc1.getData());
		
		GenericClass<Student> st=new GenericClass<>();
		st.setData(new Student(12,"Ayub",99.7f));
		System.out.println(st.getData());


	}

}
