package com.mercury.oop;

public class StringBufferBuilderTest {

	public static void main(String[] args) {
		String s = new String("a");
		String s2 = s + "b" + 123;
		
		System.out.println(s.toString());
		System.out.println(s2.toString());
		System.out.println(s == s2);
		
		System.out.println("****************************");
		// 1970.1.1 - present in milliseconds
		Long t1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		StringBuilder sb2 = new StringBuilder();
		for(int i = 0; i < 10000000; i++) {
			sb2 = sb.append("b").append(123);
		}
		
//		System.out.println(sb.toString());
//		System.out.println(sb2.toString());
//		System.out.println(sb == sb2);
		Long t2 = System.currentTimeMillis();
		
		System.out.println("StringBuilder take: " + (t2 - t1));
		
		System.out.println("****************************");
		
		Long t3 = System.currentTimeMillis();
		StringBuffer sbf = new StringBuffer("a");
		StringBuffer sbf2 = new StringBuffer();
		for(int i = 0; i < 10000000; i++) {
			sbf2 = sbf.append("b").append(123);
		}
//		System.out.println(sbf.toString());
//		System.out.println(sbf2.toString());
//		System.out.println(sbf == sbf2);
		Long t4 = System.currentTimeMillis();
		
		System.out.println("StringBuffer take: " + (t4 - t3));
	}

}
