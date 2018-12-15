package com.mercury.opp.test;

import java.io.IOException;

public class A {
	private int age;
	private int time;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "A [age=" + age + ", time=" + time + "]";
	}
	public void method() throws IOException {
		
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	public A(int age, int time) {
		super();
		this.age = age;
		this.time = time;
	}
	private void superHas() {
		System.out.println("super");
	}
	
}
