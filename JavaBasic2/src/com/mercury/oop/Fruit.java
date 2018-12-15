package com.mercury.oop;

public enum Fruit {
	Banana;
	
	public Fruit giveMeTheSweetOne() {
		return Banana;
	}
	
	public static void test() {
		System.out.println("Test static function...");
	}
	
}