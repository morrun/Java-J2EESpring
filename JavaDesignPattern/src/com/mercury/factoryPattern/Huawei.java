package com.mercury.factoryPattern;

public class Huawei implements Phone {
	private String brand;
	
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Huawei() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Huawei(String brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String charging() {
		// TODO Auto-generated method stub
		return getBrand() + " is on charging!";
	}

}
