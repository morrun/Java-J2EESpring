package com.mercury.io;

import java.io.Serializable;

public class Computer implements Serializable {
	
	private static final long serialVersionUID = 9237483213L;
	public static String color = "Black";
	private String brand;
	private int screenSize;
	private transient String os;
	//public Computer() {
	//	super();
	//}
	
	public Computer(String brand, int screenSize, String os) {
		super();
		this.brand = brand;
		this.screenSize = screenSize;
		this.os = os;
	}

	
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", screenSize=" + screenSize + ", os=" + os + "] " + color;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getScreenSize() {
		return screenSize;
	}
	public void setScreenSize(int screenSize) {
		this.screenSize = screenSize;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
//	private void writeObject(java.io.ObjectOutputStream s) {
//		
//	}
//	private void readObject(java.io.ObjectInputStream s) {
//		
//	}
}
