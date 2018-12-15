package com.mercury.oop;

import java.util.LinkedList;

public class OuterClass {
	
	private String name;
	private static String addr;
	
	// inner class : a class inside another class
	
	// 1. static inner class
	//  static inner class can be treated as a normal class
	
	public static class InnerClass1 {
		private String innerName;
		private int age;
		
		LinkedList a = null;
		
		public InnerClass1() {
			
		}
		
		public InnerClass1(String innerName, int age) {
			super();
			this.innerName = innerName;
			this.age = age;
		}
		
		public void displayName() {
			System.out.println(addr);
		}
	}
	
	// 2. non-static inner class
	//  need to create the non-static inner class from outer class's object
	
	public class InnerClass2 {
		private String innerName;
		private int age;
		
		public InnerClass2() {
			
		}
		
		public InnerClass2(String innerName, int age) {
			super();
			this.innerName = innerName;
			this.age = age;
		}
	}

	public static void main(String[] args) {
		OuterClass.InnerClass1 oi = new OuterClass.InnerClass1();
		
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass2 oi2 = oc.new InnerClass2();
	}

}
