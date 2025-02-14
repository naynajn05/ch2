//to demonstrate private constructor
package com.tnsif.day2.privateconstructordemo;

public class MyClass {
	
	//data members
	private int id;
	private String name;
	
			
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



	//private constructor
	private  MyClass() {
		System.out.println("Private Constructor");
	}

  private static MyClass obj=new MyClass();
  
  public static  MyClass getObject()
  {
	  return obj;
  }
  
	
	
	
	@Override
	public String toString() {
		return "MyClass [id=" + id + ", name=" + name + "]";
	}
	
	
	

}
