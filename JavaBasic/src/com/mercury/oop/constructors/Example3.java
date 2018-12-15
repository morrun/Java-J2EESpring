package com.mercury.oop.constructors;

public class Example3 {
	public static class Par {
		
		public Par() {
			foo();
		}
		public Par(int i) {
			System.out.println("new");
		}
		// public and private are different 
		public static void foo() {
			System.out.println("Par");
		}
	}
	
	public static class Sub extends Par{
		
		public Sub(int i) {
			super(1);
			foo(1);
		}
		
		public void foo(int i) {
			System.out.println("Sub");
		}
	}
	
	public static void main(String args[]) {
		new Sub(1);
	}
}
