package com.mercury.prototypePatternII;

import java.util.Hashtable;

public class ShapeCache {
	private static Hashtable<Integer,Shape> shapeMap = new Hashtable<Integer,Shape>(); 
	
	public static void loadCache() {
		Circle circle = new Circle();
		circle.setId(1);
		shapeMap.put(circle.getId(), circle);
		Square square = new Square();
		square.setId(2);
		shapeMap.put(2, square);
	}
	public static Shape getShape(int id) throws CloneNotSupportedException {
		return shapeMap.get(id).clone();
	}
}
