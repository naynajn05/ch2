package com.tnsif.day4.hierardemo;


//child 1 
public class MobilePhones extends ElectronicsGadgets {
 

private String modelNo;
 private String brand;
 private int memorySize;
 
public MobilePhones() {
	super();
	modelNo="123";
	brand="Samsung";
	memorySize=256;
	
}

public MobilePhones(String name, float price, String category,String modelNo, String brand, int memorySize) {
	super( name,  price,  category);
	this.modelNo = modelNo;
	this.brand = brand;
	this.memorySize = memorySize;
}

public String getModelNo() {
	return modelNo;
}

public void setModelNo(String modelNo) {
	this.modelNo = modelNo;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}

public int getMemorySize() {
	return memorySize;
}

public void setMemorySize(int memorySize) {
	this.memorySize = memorySize;
}
 
@Override
public String toString() {
	return "MobilePhones [modelNo=" + modelNo + ", brand=" + brand + ", memorySize=" + memorySize + ", toString()="
			+ super.toString() + "]";
}
 
}
