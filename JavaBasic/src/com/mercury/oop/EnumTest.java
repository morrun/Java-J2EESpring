package com.mercury.oop;

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit f = Fruit.Apple;
		Fruit c = Fruit.Apple;
		System.out.println(f.equals(c)	);
		f.giveMeTheSweetOne();
		Fruit.test();
	}

}
