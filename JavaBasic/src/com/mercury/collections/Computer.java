package com.mercury.collections;

import java.util.Comparator;

public class Computer implements Comparable<Computer>{
	private String brand;
	private int price;
	private int year;
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(String brand, int price, int year) {
		super();
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
		// 1, objects with same values should return same hashCode forever.
		// 2, different objects should return different hashCode.
		// 3, default hashCode will return memory location in decimal of this object.
		return super.hashCode();
		
	}
	@Override
	public int compareTo(Computer c) {
		//return:
		//return positive, this > c
		//return 0, this = c
		//return negative, this < c
//		return (this.price - c.getPrice());
		return this.getBrand().compareTo(c.getBrand());
	}
	@Override
	public boolean equals(Object o) {
		if (!(o instanceof Computer)) {
			return false;
		}
		
		Computer c2 = (Computer)o;
		return (this.brand.equals(c2.getBrand())
				&& (this.year == c2.getYear())
				&& (this.price == c2.getPrice()));
	}
	@Override
	public String toString() {
		return "Computer [brand=" + brand + ", price=" + price + ", year=" + year + "]";
	}
//	@Override
//	public int compare(Computer o1, Computer o2) {
//		// TODO Auto-generated method stub
//		return o1.price - o2.price;
//	}
	
}
