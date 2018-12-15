package com.mercury.prototypePatternII;

public class Square extends Shape {
	
	public Square() {
		this.setType("Square");
	}
	@Override
	void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw a " + this.getType());
	}

}
