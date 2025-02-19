package com.tnsif.day4.singlelevelinheridemo;

//Child class
public class Student extends Citizen {
	
	private int rollNo;
	private String gender;
	private String dept;
	
	//default default
	public Student() {
		super();
	}

	public Student(String aadharNo, String name, int phNo, String address,int rollNo, String gender, String dept) {
		super(aadharNo,name,phNo,address);
		this.rollNo = rollNo;
		this.gender = gender;
		this.dept = dept;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", gender=" + gender + ", dept=" + dept + ", getAadharNo()="
				+ getAadharNo() + ", getName()=" + getName() + ", getPhNo()=" + getPhNo() + ", getAddress()="
				+ getAddress() + "]";
	}

	/*
	 * @Override public String toString() { return "Student [rollNo=" + rollNo +
	 * ", gender=" + gender + ", dept=" + dept + ", toString()=" + super.toString()
	 * + "]"; }
	 */
	

	
	
	
	
	

}
