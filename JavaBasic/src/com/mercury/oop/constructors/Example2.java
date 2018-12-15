package com.mercury.oop.constructors;

import com.mercury.oop.internal.Car;

// override & upcasting vs downcasting
// static & private function will not be overridden
public class Example2 {

	public static class GP {
		public int x = 1;
		public void foo() {
			System.out.println("GP");
		}
	}
	
	public static class P extends GP{
		//public int x = 2;
		public void foo() {
			System.out.println("P");
		}
		public void bar() {
			System.out.println("bar");
		}
	}
	
	public static class S extends P{
		public int x = 3;
		public void foo() {
			System.out.println("S" + x);
		}
		
		public void cal() {
			System.out.println("cal");
		}
	}
	
	public static void main(String args[]) {
		// ClassCastException : down casting / no relational casting
		//		S s = (S)(new P());

		P gp = new S();
		gp.foo();
		System.out.println("Done" + gp.x);
	}
}
