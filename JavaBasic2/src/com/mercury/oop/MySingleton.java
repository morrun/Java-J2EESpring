package com.mercury.oop;

public class MySingleton {
	private String name;
	private int age;
	
	private static MySingleton ms = null;
	
	private MySingleton() {};
	private MySingleton(int age) {this.age = age;};
	
	public static MySingleton getInstance() {
		if(ms == null) {
			synchronized(MySingleton.class) {
				if(ms == null) {
					ms = new MySingleton();
				}
			}
		}
		return ms;
	}
	
	public static MySingleton getInstance(int age) {
		if(ms == null) {
			synchronized(MySingleton.class) {
				if(ms == null) {
					ms = new MySingleton(age);
				}
			}
		}
		return ms;
	}
	
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
	
	@Override
	public String toString() {
		return "MySingleton [name=" + name + ", age=" + age + "]";
	}
}
