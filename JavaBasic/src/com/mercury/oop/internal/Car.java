package com.mercury.oop.internal;

import com.mercury.oop.StaticVsNonStatic;

public class Car {
	private String brand;
	private int millage;
	
	// constructor : used for creating the object of this class
	// default constructor is provided by java, only if no constructor is specified
	// use "new" to call constructor
	
	// 1. name should be the same as class name
	// 2. no return type, this function will return a current class type object
	// 3. constructor can be overloaded : 
	// 	 	same method name, same return type, but different parameters type / arguments type
	public Car() {
		
	}
	
	public Car(int millage) {
		// this : this object, this.millage refer to the field defined in the class.
		this.millage = millage;
	}
	
	public Car(String brand, int millage) {
		super();
		this.brand = brand;
		this.millage = millage;
	}

	
	
	public String getBrand() {
		return brand;
	}
	

	// This is not a getter
	public String giveMeMyBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getMillage() {
		return millage;
	}

	public void setMillage(int millage) {
		this.millage = millage;
	}

	
	
	
	public void foo() {
		System.out.println("Car foo");
	}
	
	protected void bar() {
		System.out.println("Car bar");
	}
	
	void cal() {
		System.out.println("Car cal");
	}
	
	private void test() {
		System.out.println("Car test");
	}
	
	private void test(int x) {
		System.out.println("car test " + x);
	}
	
	private void test(float x, double y) {
		
	}
	
	private void test(double x,  float y) {
		
	}
	
	public static void main(String args[]) {
		// only same package classes can be visit directly
		StaticVsNonStatic sns = new StaticVsNonStatic();
		
		// different package classes need to be imported
		// ctrl/command + shift + o
		Person p = new Person();
		// public can be called from everywhere
		p.foo();
		// protected and (default) functions can be called from same package
		p.bar();
		p.cal();
//		p.test();

	}
}


class X {
	
}