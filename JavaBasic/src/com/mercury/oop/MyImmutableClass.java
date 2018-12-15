package com.mercury.oop;

import java.util.Collections;
import java.util.List;

import com.mercury.clone.Car;

public final class MyImmutableClass {

	private String name;
	private int age;
	private List<String> info;
	private Car c;
	
	
	public MyImmutableClass() {}
	
	public MyImmutableClass(String name, int age, List<String> info, Car c) {
		super();
		this.name = name;
		this.age = age;
		this.info = info;
		this.c = c;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public List<String> getInfo() {
		return Collections.unmodifiableList(info);
	}
	
	public Car getC() throws Exception {
		return c;
	}

	@Override
	public String toString() {
		return "MyImmutableClass [name=" + name + ", age=" + age + ", info=" + info + ", c=" + c + "]";
	}
	

	

}
