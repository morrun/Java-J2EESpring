package com.mercury.prototypePatternII;

public class PrototypeIITest {

	public static void main(String[] args) throws CloneNotSupportedException {
		ShapeCache.loadCache();
		Shape s1 = ShapeCache.getShape(1);
		s1.draw();
		Shape s2 = ShapeCache.getShape(2);
		s2.draw();
		Shape s3 = ShapeCache.getShape(1);
		s3.draw();
		
		System.out.println(s1 == s3);
		System.out.println(s1.getClass()==s3.getClass());
	}

}
