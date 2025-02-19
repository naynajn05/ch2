package com.tnsif.multileveldemo;


//Grand Child
public class Manager extends Employee{
	private int teamSize;
	private String skiils;
	
	
	
	public Manager() {
		super();
	}



	public Manager(String name, int age, String address,int empId, float salary, String dept,int teamSize, String skiils) {
		super(name,age,address,empId,salary,dept);
		this.teamSize = teamSize;
		this.skiils = skiils;
	}


	public int getTeamSize() {
		return teamSize;
	}

	public void setTeamSize(int teamSize) {
		this.teamSize = teamSize;
	}

	public String getSkiils() {
		return skiils;
	}

	public void setSkiils(String skiils) {
		this.skiils = skiils;
	}

	@Override
	public String toString() {
		return "Manager [teamSize=" + teamSize + ", skiils=" + skiils + ", toString()=" + super.toString() + "]";
	}
	
	public void greet()
	{
		System.out.println("Hi");
	}
	

}
