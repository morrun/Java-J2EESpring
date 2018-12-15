package com.mercury.oop;

import java.util.ArrayList;
import java.util.List;

public class JVMDumper {

	public static class MyObject {
		Object o;

		public MyObject()  {
			
		}
		
		public MyObject(Object o) {
			super();
			this.o = o;
		}
		
	}
	
	
	public static void main(String[] args) {
		MyObject mo = new MyObject();
		while(true) {
			mo = new MyObject(mo);
		}
	}

}
