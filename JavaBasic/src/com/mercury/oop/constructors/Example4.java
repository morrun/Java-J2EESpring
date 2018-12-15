package com.mercury.oop.constructors;

import com.mercury.oop.constructors.Example3.Par;
import com.mercury.oop.constructors.Example3.Sub;

public class Example4 {

	public static class Par {
		int x = 5;
		public Par() {
			foo();
		}
		
		// public and private are different
		public void foo() {
			System.out.println("Par " + x);
		}
	}
	
	public static class Sub extends Par{
		int x = 10;
		
		// field will be filled up before constructor get called
		// constructor is the last step to do for the object creation.
		public Sub() {
			//super();
			foo();
		}
		
		public void foo() {
			System.out.println("Sub " + x);
		}
	}
	
	public static void main(String args[]) {
		new Sub();
	}
}
