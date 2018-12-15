package com.mercury.factoryPattern;

public class Samsung implements Phone {
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Samsung(String brand) {
		super();
		this.brand = brand;
	}

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String charging() {
		// TODO Auto-generated method stub
		return getBrand() + " is on charging!";
	}

}
