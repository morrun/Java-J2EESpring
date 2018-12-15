package com.mercury.builderPattern;

public class PhoneBuilder {
	private String Brand;
	private String CPU;
	private int size;
	private int weight;
	private int price;
	public PhoneBuilder setBrand(String brand) {
		Brand = brand;
		return this;
	}
	public PhoneBuilder setCPU(String cPU) {
		CPU = cPU;
		return this;
	}
	public PhoneBuilder setSize(int size) {
		this.size = size;
		return this;
	}
	public PhoneBuilder setWeight(int weight) {
		this.weight = weight;
		return this;
	}
	public PhoneBuilder setPrice(int price) {
		this.price = price;
		return this;
	}
	public Phone createPhone() {
		return new Phone(this.Brand,this.CPU,this.size,this.weight,this.price);
	}
	
}
