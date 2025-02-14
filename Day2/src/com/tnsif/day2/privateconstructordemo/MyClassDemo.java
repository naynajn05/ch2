package com.tnsif.day2.privateconstructordemo;

public class MyClassDemo {

	public static void main(String[] args) {
		MyClass obj1=MyClass.getObject();
		obj1.setId(12);
		obj1.setName("Nayna");
		System.out.println(obj1);
		
		MyClass obj2=MyClass.getObject();
		obj2.setId(14);
		obj2.setName("Ayub");
		System.out.println(obj2);
		System.out.println(obj1);
		
		//MyClass obj3=MyClass.getObject();
		//System.out.println(obj3);

}
}
