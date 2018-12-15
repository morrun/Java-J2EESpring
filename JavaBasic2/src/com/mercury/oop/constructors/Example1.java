package com.mercury.oop.constructors;

public class Example1 {

	public static class Parent {
		
		public Parent() {
			System.out.println("Parent without parameter");
		}

		public Parent(int x) {
			System.out.println("Parent : " + x);
		}
		
		public void foo() {
			System.out.println("Parent foo");
		}
	}
	
	public static class Sub extends Parent {
		
		// before sub constructor get called, call parent constructor 1st
		// default constructor will be called, always
		// super : super class
		// super() : super classes' default constructor
		// super(para) : call the corresponding super constructor
		public Sub() {
			System.out.println("Sub without parameter");
		}
		
		public Sub(int x) {
			System.out.println("Sub : " + x);
		}
		
		public Sub(String name) {
			super(1);
			System.out.println("Sub : " + name);
		}
		
		public void foo() {
			System.out.println("Sub foo");
		}
		
		public void bar() {
			System.out.println("Sub bar");
		}
	}
	
	public static void main(String[] args) {
		Sub s = new Sub("ABC");
		System.out.println("***********************");
		s.bar();
		s.foo();
		System.out.println("***********************");
		Parent p = new Parent();
	}

}
