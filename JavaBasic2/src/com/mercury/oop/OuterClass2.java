package com.mercury.oop;

public class OuterClass2 extends OuterClass.InnerClass2 {
	static OuterClass oc = new OuterClass();
	
	public OuterClass2 () {
		oc.super();
	}

	
	
	public String test() {
		// logic
		String result = "123";
		String result2 = result;
		String result3 = result;
		String result4 = result;
		
		return result3;
	}
}
