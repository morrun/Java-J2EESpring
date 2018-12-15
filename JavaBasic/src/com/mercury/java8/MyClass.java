package com.mercury.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MyClass implements MyInterface {
	public static void main(String args[]) {
		MyInterface.test();
		MyInterface.test2();
		MyInterface mi = new MyInterface() {};
		mi.cal();
		mi.cal1();
		//anonymous imp
//	Runnable r = new Runnable() {
//		@Override
//		public void run() {
//			System.out.println("run");
//		}
//	};
	
	// lambda expression
	// to imp functional interface
//	Runnable r2 = () -> {System.out.println("abc");};
//	new Thread(r2).start();
	MyFunctionalInterface mfi = (x,y) -> System.out.println(x + y);
	
	mfi.foo(4,5);
	testStream();
	}
	
	
	public static void testStream() {
		// stream API
		String[] arr = {"abcd","adbcadf","fadf","as"};
	
		List<String> strList = Arrays.asList(arr);
		
		strList.parallelStream()			//convert to a stream
			.filter(x->(x.length()<5))		//filter out those which doesn't fit
			.map(String::toUpperCase)		//apply toUpperCase() function to each element
			.peek(x->System.out.println(x)) //do action Sysout() on each element
			.findAny()						
			.get();							//terminal function will actually start above operations
		
		System.out.println("*****************");
		strList.forEach(x -> System.out.println(x));
		strList.sort((x,y)->x.compareTo(y));
		System.out.println("*****************");
		Collections.sort(strList);
		System.out.println(strList);
		System.out.println("*****************");
		String s = "";
		strList.forEach(System.out::println);
		
			
	}
	
	
	
}
