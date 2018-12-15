package com.mercury.factoryPattern;

public class PhoneFactory {
	public static Phone getInstance(String brand) {
		if (brand.equals("iPhone")) {
			return new Apple(brand);
		}else if(brand.equals("Huawei") ) {
			return new Huawei(brand);
		}else if(brand.equals("Samsung")) {
			return new Samsung(brand);
		}else return null;
	}
}
