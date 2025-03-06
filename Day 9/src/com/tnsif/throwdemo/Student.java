package com.tnsif.throwdemo;

import java.util.Arrays;

public class Student {
	private String name;
	private int rollNo;
	private int noOfSubjects;
	private int[] marks;
	private float per;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public int getNoOfSubjects() {
		return noOfSubjects;
	}
	public void setNoOfSubjects(int noOfSubjects) {
		this.noOfSubjects = noOfSubjects;
	}
	public int[] getMarks() {
		return marks;
	}
	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	
	
	
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	public Student(String name, int rollNo, int noOfSubjects, int[] marks) {
		super();
		this.name = name;
		this.rollNo = rollNo;
		this.noOfSubjects = noOfSubjects;
		this.marks = marks;
	}
	public Student() {
		super();
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", noOfSubjects=" + noOfSubjects + ", marks="
				+ Arrays.toString(marks) + ", per=" + per + "]";
	}
	
	
	
	
	

}
