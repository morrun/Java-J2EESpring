package com.mercury.oop;

import com.mercury.oop.internal.Person;

public class PersonExtend extends Person {
	
	@Override
	public void foo() {
		System.out.println("Person foo");
	}
	
	// protected accessibility can be overridden outside from the package
	@Override
	protected void bar() {
		System.out.println("Person bar");
	}
	
	// default accessibility cannot be overridden outside from the package
//	@Override
	void cal() {
		System.out.println("Person cal");
	}
	
	private void test() {
		System.out.println("person test");
	}
}
