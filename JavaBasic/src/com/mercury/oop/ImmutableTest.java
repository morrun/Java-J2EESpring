package com.mercury.oop;

import java.util.ArrayList;
import java.util.List;

import com.mercury.clone.Car;

public class ImmutableTest {

//	public static class MyImmutable2 extends MyImmutableClass {
//		public String id;
//		
//		public MyImmutable2() {
//			super();
//		}
//		
//		public String getName() {
//			return id;
//		}
//
//	}
	
	public static void main(String[] args) throws Exception {
		
		List<String> strList = new ArrayList<String>();
		strList.add("info1");
		
		MyImmutableClass mic = new MyImmutableClass("Greg", 1, strList, new Car("Ford", 100));
		System.out.println(mic);
		
		mic.getC().setBrand("Audi");
		System.out.println(mic);
		
		mic.getC().setBrand("BMW");
		System.out.println(mic);
		
		String x = "abc";
		x += "d";
		
		
//		mic = new MyImmutableClass();
//		MyImmutable2 mic2 = new MyImmutable2();
//		mic2.id = "abc";
//		MyImmutableClass m = mic2;
//		System.out.println(m.getName());
//		mic2.id = "xyz";
//		System.out.println(m.getName());
		
		
	}

}
