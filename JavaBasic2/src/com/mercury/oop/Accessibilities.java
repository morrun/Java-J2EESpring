package com.mercury.oop;

import com.mercury.oop.internal.Person;

// 1. 1 and only 1 public class allowed in 1 .java file.
// 2. The public class need to have same name as the file name;
// 3. Other classes are allowed, but should be default
// 4. naming convention (industry level) : 
//		1. Class name should start with Capital, followed with lower case, each word should start with capital
//			eg: public class StaticVsNonStatic
// 		2. Function name & field name should start with lower case, each word should start with capital
//			eg: public String nameAndAge;
//		3. Final field should be all capital
//			eg: public final String NAMEANDAGE = "Greg is 100";
// 5. if function need to be accessed from everywhere, public it.
// 	  if function need to be used only after extended, protected it.
//	  if function is only for this class, private it
// 6. most of the fields, should be private non-static, followed with getters & setters.

public class Accessibilities {
	public static void main(String args[]) {
		// only same package classes can be visit directly
		StaticVsNonStatic sns = new StaticVsNonStatic();
		
		// different package classes need to be imported
		// ctrl/command + shift + o
		Person p = new Person();
		// public can be called from everywhere
		p.foo();
		// protected and (default) functions cannot be called from different package
//		p.bar();
//		p.cal();
		
		// private function cannot be accessed from different files
//		p.test();
	}
}
class X{}