package com.tnsif.day4.hierardemo;

//child 2
public class Television extends ElectronicsGadgets {
	private int screenSize;
	private boolean isHD;
	private boolean isLED;
	
	public Television() {
		super();
		screenSize=42;
		isHD=true;
		isLED=false;
	}

	public Television(String name, float price, String category,int screenSize, boolean isHD, boolean isLED) {
		super( name,  price,  category);
		this.screenSize = screenSize;
		this.isHD = isHD;
		this.isLED = isLED;
	}

	public int getScreenSize() {
		return screenSize;
	}

	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}

	public boolean isHD() {
		return isHD;
	}

	public void setHD(boolean isHD) {
		this.isHD = isHD;
	}

	public boolean isLED() {
		return isLED;
	}

	public void setLED(boolean isLED) {
		this.isLED = isLED;
	}

	@Override
	public String toString() {
		return "Television [screenSize=" + screenSize + ", isHD=" + isHD + ", isLED=" + isLED + ", toString()="
				+ super.toString() + "]";
	}
	
	
	
	

}
