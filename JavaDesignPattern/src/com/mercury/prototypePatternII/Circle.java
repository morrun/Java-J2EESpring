package com.mercury.prototypePatternII;

public class Circle extends Shape {
	public Circle() {
		this.setType("Circle");
	}
	@Override
	public void draw() {
		System.out.println("Draw a " + this.getType());

	}

}
