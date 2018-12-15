package com.mercury.clone;

public class Car implements Cloneable{
	private String name;
	private String color;
	public Car(String name, String color) {
		super();
		this.name = name;
		this.color = color;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		return "Car [name=" + name + ", color=" + color + "]";
	}
	@Override
	protected Car clone() throws CloneNotSupportedException {
		return (Car) super.clone();
	}
	
}
