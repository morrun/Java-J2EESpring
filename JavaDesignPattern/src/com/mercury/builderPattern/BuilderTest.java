package com.mercury.builderPattern;

public class BuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone Apple = new Phone("Apple","A11",5,6,999);
		System.out.println(Apple);
		
		Phone apple = new PhoneBuilder().setBrand("Apple").setPrice(999).createPhone();
		System.out.println(apple);
	}

}
