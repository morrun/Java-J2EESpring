package com.mercury.opp.test;

import java.io.IOException;
import java.util.Random;

public class B extends A{
	public void method(){
//		super.superHas();
	}
	public void superHas() {
		System.out.println("sub");
	}
	@Override
	public int hashCode() {
//		return new Random().nextInt(100);
		return 100;
	}
	@Override
	public boolean equals(Object o) {
		return true;
	}
}
