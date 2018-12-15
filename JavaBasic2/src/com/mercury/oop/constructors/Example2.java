package com.mercury.oop.constructors;

import com.mercury.oop.internal.Car;

// override & upcasting vs downcasting
// static & private function will not be overridden
public class Example2 {

	public static class GP {
		public void foo() {
			System.out.println("GP");
		}
	}
	
	public static class P extends GP{
		public void foo() {
			System.out.println("P");
		}
		public void bar() {
			System.out.println("bar");
		}
	}
	
	public static class S extends P{
		public void foo() {
			System.out.println("S");
		}
		
		public void cal() {
			System.out.println("cal");
		}
	}
	
	public static void main(String args[]) {
		// ClassCastException : down casting / no relational casting
		//		S s = (S)(new P());

		GP gp = new S();
		gp.foo();
		System.out.println("Done");
	}
}
