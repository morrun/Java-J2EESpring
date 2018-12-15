package com.mercury.oop.constructors;

public class Example3 {
	public static class Par {
		
		public Par() {
			foo();
		}
		
		// public
		private void foo() {
			System.out.println("Par");
		}
	}
	
	public static class Sub extends Par{
		
		public Sub() {
			foo();
		}
		
		public void foo() {
			System.out.println("Sub");
		}
	}
	
	public static void main(String args[]) {
		new Sub();
	}
}
