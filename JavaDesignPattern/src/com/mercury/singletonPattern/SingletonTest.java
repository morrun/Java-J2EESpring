package com.mercury.singletonPattern;
/*Singleton pattern is one of the most commonly used patterns in Java. 
 It is used to control the number of objects created by preventing 
 external instantiation and modification. 
 This concept can be generalized to systems that operate more efficiently 
 when only one object exists, or that restrict the instantiation to 
 a certain number of objects, such as:
private constructor - no other class can instantiate a new object.
private reference - no external modification.
public static method is the only place that can get an object*/

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boss boss = Boss.getInstance("Zihao");
		Boss boss1= Boss.getInstance("Rober");
		System.out.println("boss is " + boss);
		System.out.println("boss1 is " + boss1);
		boss1.setName("Robert");
		System.out.println("boss is " + boss);
		System.out.println("boss1 is " + boss);
	}

}
