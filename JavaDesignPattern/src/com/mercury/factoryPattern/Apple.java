package com.mercury.factoryPattern;

public class Apple implements Phone {
	private String brand;
		
	public Apple() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Iphone [brand=" + brand + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Apple(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String charging() {
		// TODO Auto-generated method stub
		return getBrand() + " is on charging!";
	}

}
