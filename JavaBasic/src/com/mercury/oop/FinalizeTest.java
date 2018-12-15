package com.mercury.oop;

public class FinalizeTest {

	public static class MyObject {
		
		@Override
		protected void finalize() {
			System.out.println("This function will be called when destruct the object");
		}
	}
	
	public static void main(String[] args) {
		new MyObject();
		System.gc();
		
		try {
			//Thread.sleep();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Complete...");
		

	}

}
