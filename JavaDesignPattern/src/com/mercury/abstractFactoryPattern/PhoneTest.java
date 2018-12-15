package com.mercury.abstractFactoryPattern;

import com.mercury.abstractFactoryPattern.beans.Phone;

public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone apple = PhoneFactory.createPhone(new AppleFactory("CPU","Battery","OS"));
		Phone samsung = PhoneFactory.createPhone(new SamsungFactory("CPU","Battery","OS"));
		System.out.println(apple.specific());
		System.out.println(samsung.specific());
	
	}
}
	
	
/*Abstract factory provides the abstraction for factories, whereas
 * factory pattern provides abstraction for Concrete products.
 * 
 * Better Abstraction than Factory Pattern
 * 
 * No if-else or swith-case logic like factory Pattern
 * 
 * Remove burden from client to Factory
 * 
 * Easy to extend*/
 