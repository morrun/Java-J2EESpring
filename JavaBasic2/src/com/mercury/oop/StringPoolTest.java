package com.mercury.oop;

public class StringPoolTest {

	public static void main(String[] args) {
		String s1 = "xyz";
		String s2 = "xyz";
		String s3 = new String("xyz");
		String s4 = new String("xyz");
		String s5 = s3.intern();
		
		System.out.println("s1 == s2 : " + (s1 == s2));
		System.out.println("s2 == s3 : " + (s2 == s3));
		System.out.println("s3 == s4 : " + (s3 == s4));
		System.out.println("s3 == s5 : " + (s3 == s5));
		System.out.println("s1 == s5 : " + (s1 == s5));
		
		System.out.println("*************************");
		String s6 = new String("abc");
		String s7 = s6.intern();
		System.out.println("s7 == 'abc' " + (s7 == "abc"));
		
		System.out.println("*****************");
		String s8 = "xy" + "abc" + s3;
		String s9 = "xy".toLowerCase();
	}

}
