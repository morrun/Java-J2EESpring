package com.mercury.IOtest;

import java.io.Serializable;

public class Garage implements Serializable{
	private Computer c1;
	private Computer c2;
	private static Garage INSTANCE = null;
	private Garage(Computer c1, Computer c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	public static Garage getInstance(Computer c1, Computer c2) {
		if (INSTANCE == null) {
			synchronized (Garage.class) {
				if (INSTANCE == null) {
					INSTANCE = new Garage(c1, c2);
				}
			}
		}
		return INSTANCE;
	}
	@Override
	public String toString() {
		return c1 + ";" + c2;
	}
	
	
}
