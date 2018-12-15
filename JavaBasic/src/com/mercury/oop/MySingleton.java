package com.mercury.oop;

public class MySingleton {
	private String brand;
	
	private static MySingleton ms = null;
	private MySingleton() {
		
	}
	public static MySingleton getInstance() {
		if (ms == null) {
			synchronized (MySingleton.class) {
				if (ms == null) {
					ms = new MySingleton();
				}
			}
		}
		return ms;
	}
}
