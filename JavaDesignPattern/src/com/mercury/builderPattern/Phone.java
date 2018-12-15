package com.mercury.builderPattern;

public class Phone {
	private String Brand;
	private String CPU;
	private int size;
	private int weight;
	private int price;
	@Override
	public String toString() {
		return "Phone [Brand=" + Brand + ", CPU=" + CPU + ", size=" + size + ", weight=" + weight + ", price=" + price
				+ "]";
	}
	public String getBrand() {
		return Brand;
	}
	public void setBrand(String brand) {
		Brand = brand;
	}
	public String getCPU() {
		return CPU;
	}
	public void setCPU(String cPU) {
		CPU = cPU;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Phone(String brand, String cPU, int size, int weight, int price) {
		super();
		Brand = brand;
		CPU = cPU;
		this.size = size;
		this.weight = weight;
		this.price = price;
	}
	public Phone() {
		super();
		// TODO Auto-generated constructor stub
	}
}
