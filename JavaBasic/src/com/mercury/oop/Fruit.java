package com.mercury.oop;

public enum Fruit {
	Apple {
		@Override
		public void test2() {
			// TODO Auto-generated method stub
			
		}
	};
	public Fruit giveMeTheSweetOne() {
		return null;
	}

	public static Fruit test() {
		System.out.println("apple");
		return null;
	}
	
	public abstract void test2();
}
