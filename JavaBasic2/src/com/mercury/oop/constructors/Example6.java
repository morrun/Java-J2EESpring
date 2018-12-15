package com.mercury.oop.constructors;

import java.lang.ref.PhantomReference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class Example6 {

	public static class Par {
		List foo() {
			return null;
		}
	}
	
	public static class Sub extends Par {
		@Override
		protected ArrayList foo() {
			return new ArrayList();
		}
	}

	public static void main(String[] args) {
		Par p = new Sub();
		ArrayList al = (ArrayList)p.foo();
		
		WeakReference wr = new WeakReference(p);
		Par p2 = (Par)wr.get();
	}

}
