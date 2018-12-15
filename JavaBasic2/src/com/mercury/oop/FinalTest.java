package com.mercury.oop;

import com.mercury.oop.internal.Car;

// 1. final class cannot be extended
// 2. final method/function cannot be overridden
// 3. final field/reference cannot be reassigned

// final in Java = const in C
// final field has to have an initial value
public class FinalTest {

	// 1. final static field
	public static final int x = 4;
	//    static block will also be loaded/executed when class get loaded
	public static final int y;
	static {
		y = 2;
	}
	
	// 2. final non-static field
	public final int m = 2;
	public final int n;
	
	public FinalTest() {
		n = 2;
	}
	
	public FinalTest(int x) {
		n = 4;
	}
	
	public static final Car c = new Car();
	
	public final Car c2 = new Car();
	
	public static void main(String args[]) {
		c.setMillage(22);
		c.setMillage(2211);
		
		test();
		
		System.out.println("Done");
	}
	
	public static void test() {
		final Car ccc = new Car();
	}
}
