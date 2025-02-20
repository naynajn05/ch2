package com.tnsif.day4.associationdemo;

//contained class
public class Address {
	private int flatNo;
	private String societyName;
	private String city;
	
	public Address() {
		super();
	}
	public Address(int flatNo, String societyName, String city) {
		super();
		this.flatNo = flatNo;
		this.societyName = societyName;
		this.city = city;
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getSocietyName() {
		return societyName;
	}
	public void setSocietyName(String societyName) {
		societyName = societyName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", SocietyName=" + societyName + ", city=" + city + "]";
	}
	
	
	

}
