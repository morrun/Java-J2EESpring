package com.mercury.clone;

public class CloneTest {
	public void CloenTest() {
		System.out.println("work");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CloneTest c = new CloneTest();
		c.CloenTest();
		Car c1 = new Car("BMW","Black");
		Car c2;
		try {
			 c2 = c1.clone();
			 System.out.println(c2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(c1);
	}

}
