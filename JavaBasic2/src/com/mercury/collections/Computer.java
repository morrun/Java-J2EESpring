package com.mercury.collections;

public class Computer implements Comparable<Computer> {
	
	private String brand;
	private int price;
	private int year;
	
	public Computer() {
	}
	
	public Computer(String brand, int price, int year) {
		this.brand = brand;
		this.price = price;
		this.year = year;
	}
	
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int hashCode() {
		// principles:
		// 1. object with same value should return same hashCode for ever
		// 2. different object should return different hashCode
		// 3. default hashCode will return memory location in decimal of this object.
		return price + year + brand.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		// compare if this object and the incoming object have the same values
		if(!(o instanceof Computer)) {
			return false;
		}
		Computer incomingObj = (Computer)o;
		return (this.brand.equals(incomingObj.getBrand())) 
				&& (this.year == incomingObj.getYear()) 
				&& (this.price == incomingObj.getPrice());
	}
	
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Computer c) {
		// return:
		// positive, this > c
		// 0, 		 this = c
		// negative, this < c
		
		return this.price - c.getPrice();
	}
	
	
}
