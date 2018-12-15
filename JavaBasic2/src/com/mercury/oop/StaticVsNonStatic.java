package com.mercury.oop;

public class StaticVsNonStatic {
	
	public String name = "ABC";
	public static int age = 120;
	
	public static void foo() {
		System.out.println("static foo()");
		System.out.println("age : " + age);
		// anonymous object
		System.out.println("name : " + new StaticVsNonStatic().name);
		StaticVsNonStatic x = new StaticVsNonStatic();
		
		// logic have 2 min.
		try {
			Thread.sleep(20);
		} catch(Exception e) {
			
		}
		
		System.out.println(x.name);
		x.cal();
	}
	
	public void cal() {
		System.out.println("non-static cal()");
		foo();
		String[] args = new String[2];
		// thread related issue.
		main(args);
	}
	
	// java application main entrance function
	public static void main(String[] args) {
		// sysout + ctrl/command + space
		System.out.println("Hello World");

		
		foo();
		StaticVsNonStatic.foo();
		StaticVsNonStatic sns = new StaticVsNonStatic();
		sns.foo();
		
		sns.cal();
	}
}
