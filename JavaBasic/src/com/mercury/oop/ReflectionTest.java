package com.mercury.oop;

import java.lang.reflect.Method;

public class ReflectionTest {
	public static class Ref {
		private String name;
		private int age;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		public void foo1() {
			System.out.println("foo1...");
		}
	}
	
	public static class Another {
		public void foo2() {
			System.out.println("foo2...");
		}
	}
	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
	}
	
	public void test(Object obj) {
		// call the fooxxxx from obj;
		// loop all teh methods from obj
		// if you see any function called fooxxx, call it
		// widely used in API development
		obj.getClass();
	}

}
