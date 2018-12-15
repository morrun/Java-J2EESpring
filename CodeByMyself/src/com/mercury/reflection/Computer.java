package com.mercury.reflection;

public class Computer {
	private int price;
	private String name;
	public static String color;
	
	public Computer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Computer(int price, String name, String color) {
		super();
		this.price = price;
		this.name = name;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Computer [price=" + price + ", name=" + name + ", color=" + color + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean chekc(String str) {
		return str.equals("abc");
	}
}
