package com.mercury.oop;

public class StringBufferBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = new String("a");
		String a2 = a + "b" + 123;
		System.out.println(a.toString());
		System.out.println(a2.toString());
		System.out.println(a == a2);
		System.out.println("**********************");
		Long t1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder("a");
		StringBuilder sb2 = sb.append("b").append(123);
		System.out.println(sb.toString());
		System.out.println(sb2.toString());
		System.out.println(sb == sb2);
		Long t2 = System.currentTimeMillis();
		
		System.out.println(t2 - t1);
		System.out.println("**********************");
		StringBuffer sb3 = new StringBuffer("a");
		t1 = System.currentTimeMillis();
		StringBuffer sb4 = sb3.append("b").append(123);
		System.out.println(sb3.toString());
		System.out.println(sb4.toString());
		System.out.println(sb3 == sb4);
		t2 = System.currentTimeMillis();
		System.out.println(t2 - t1);
	}

}
