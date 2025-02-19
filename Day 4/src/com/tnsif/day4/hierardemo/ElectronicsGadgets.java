package com.tnsif.day4.hierardemo;


//Parent Class
public class ElectronicsGadgets {
	private String name;
	private float price;
	private String category;
	public ElectronicsGadgets() {
		super();
	}
	public ElectronicsGadgets(String name, float price, String category) {
		super();
		this.name = name;
		this.price = price;
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "ElectronicsGadgets [name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
	
	
	

}
