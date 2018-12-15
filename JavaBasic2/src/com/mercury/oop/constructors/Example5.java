package com.mercury.oop.constructors;

public class Example5 {
	public static class Par {
		public void foo(int x) {
			System.out.println("Par " + x);
		}
	}
	
	public static class Sub extends Par{
		public void foo(int x) {
			super.foo(x);
			System.out.println("Sub " + x);
		}
		
		
		public void bar() {
			super.foo(2);
		}
		
		// accept parameter as many int as it possible
		public void foo(int...x) {
			System.out.println(x.getClass());
			for(int value : x) {
				System.out.println(value);
			}
			System.out.println("foo...");
		}
	}
	public static void main(String[] args) {
		Sub s = new Sub();
		s.foo(2, 3, 4);
	}

}
