package com.mercury.java8;

public interface MyInterface {
	//class level function
	static void test() {
		System.out.println("Test");
	}
	static void test2() {
		System.out.println("test2");
	}
	// default function is object level
	default public void cal() {
		System.out.println("call..");
	}
	default public void cal1() {
		System.out.println("cal1....");
	}
}
