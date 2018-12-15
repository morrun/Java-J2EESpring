package com.mercury.IOtest;

import java.io.Serializable;

public class Computer implements Serializable {
	private String brand;
	private transient String color;
	private int price;
	
	public Computer(String brand, String color, int price) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
	}

	public Computer() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", color=" + color + ", price=" + price + "]";
	}
	
	
}
