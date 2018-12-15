package com.mercury.oop.constructors;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Example7 {
	
//	private static class A{
//		protected class Y{
//			public Y() {
//				System.out.println("A.Y");
//			}
//		}
//		private Y y;
//		public A() {
//			System.out.println("new A");
//			y = new Y();
//		}
//	}
//	private static class B extends A{
//		public class Y extends A.Y{
//			public Y() {
//				System.out.println("B.Y");
//			}
//		}
//		
//	}
static class A{
	String str;
	A(String str) {
		this.str = str;
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a = new B();
		Set<Object> set = new HashSet();
		set.add(new A("abc"));
		set.add(new A("abc"));
		set.add(new String("abc"));
		set.add(new String("abc"));
		System.out.println(set.size());
		
	}
	

}

class One{
	public One foo() {
		return this;
	}
}
class Two extends One {
	public One foo() {
		return this;
	}
}
class Three extends Two{
	public Object foo() {
		return this;
	}
}

