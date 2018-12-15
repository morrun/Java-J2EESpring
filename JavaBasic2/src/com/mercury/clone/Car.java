package com.mercury.clone;

public class Car implements Cloneable {
	private String brand;
	private int millage;
	
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Car(String brand, int millage) {
		super();
		this.brand = brand;
		this.millage = millage;
	}

	public String getBrand() {
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

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", millage=" + millage + "]";
	}
	
	
	@Override
	public Car clone() throws CloneNotSupportedException {
		return (Car)super.clone();
		
//		Car car = new Car();
//		
//		car.setBrand(new String(this.brand));
//		car.setMillage(this.millage);
//		
//		return car;
	}
	
	
	
	public static void main(String[] args) {
		Car c = new Car("Audi", 1100);
		
		// modify c
		c.setBrand(new String("BMW"));
		c.setMillage(2222);
		
		Car c2 = null;
		
		try {
			c2 = c.clone();
			System.out.println(c2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		
		System.out.println("c == c2      " + (c == c2));
		System.out.println("c.brand == c2.brand       " + (c.getBrand() == c2.getBrand()));
		
		System.out.println("***************************");
		
		c2.setBrand("Ford");
		c2.millage = 1111;
		
		System.out.println(c.millage);
		System.out.println(c2.millage);
		
		System.out.println(c.brand);
		System.out.println(c2.brand);
		
		System.out.println("c == c2      " + (c == c2));
		System.out.println("c.brand == c2.brand      " + (c.getBrand() == c2.getBrand()));
		
		System.out.println(c);
	}

}
