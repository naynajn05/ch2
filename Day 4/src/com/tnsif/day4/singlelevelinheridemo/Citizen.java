//to demonstrate single level inheritance
package com.tnsif.day4.singlelevelinheridemo;

//Parent class
public class Citizen {
	private String aadharNo;
	private String name;
	private int phNo;
	private String address;
	
	//default
	public Citizen() {
		System.out.println("Default constructor");
	}
	//para.
	public Citizen(String aadharNo, String name, int phNo, String address) {
		
		this.aadharNo = aadharNo;
		this.name = name;
		this.phNo = phNo;
		this.address = address;
	}
	//setter and getter
	public String getAadharNo() {
		return aadharNo;
	}
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhNo() {
		return phNo;
	}
	public void setPhNo(int phNo) {
		this.phNo = phNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Citizen [aadharNo=" + aadharNo + ", name=" + name + ", phNo=" + phNo + ", address=" + address + "]";
	}
	
	
	
	

}
