package com.mercury.IOtest;

import java.io.Serializable;

public class Garage implements Serializable{
	private Computer c1;
	private Computer c2;
	private static Garage INSTANCE = null;
	
	public Garage() {
		super();
		// TODO Auto-generated constructor stub
	}
	private Garage(Computer c1, Computer c2) {
		super();
		this.c1 = c1;
		this.c2 = c2;
	}
	public static Garage getInstance() {
		if (INSTANCE == null) {
			synchronized (Garage.class) {
				if (INSTANCE == null) {
					INSTANCE = new Garage(new Computer(), new Computer());
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
