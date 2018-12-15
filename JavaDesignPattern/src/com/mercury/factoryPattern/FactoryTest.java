package com.mercury.factoryPattern;

public class FactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone phone = PhoneFactory.getInstance("iPhone");
		System.out.println(phone.charging());
		Phone phone1 = PhoneFactory.getInstance(("Huawei"));
		System.out.println(phone1.charging());
	}

}
