package com.mercury.exceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExceptionTest {

	public static class MyException extends Exception {
	}
	
	public static void main(String[] args) {
//		try {
//			
//		} catch(Exception e) {
//			
//		}
		NullPointerException npe = null;
		// runtime exception, no need to deal with
		String x = null;
//		toLowerCase(x);
		
		// need to handle a normal exception
		// 1. try-catch, resolve the exception right away
		try {
			FileOutputStream fos = new FileOutputStream("c:\test.txt");
		} catch (FileNotFoundException fnfe) {
			fnfe.printStackTrace();
		}
		
		
		try {
			test();
		} catch (FileNotFoundException fe) {
			fe.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} 
		
		try {
			testError();
		} catch (Error e) {
			e.printStackTrace();
		}
		
		
		try {
			testThrowable();
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
		System.out.println("Hello World");
		
		try {
			throw new MyException();
		} catch(MyException me) {
			me.printStackTrace();
		}
	}

	
	public static String toLowerCase(String x) {
		return x.toLowerCase();
	}
	
	public static void test()  throws FileNotFoundException {
		// 2. throws the exception in function declaration
		//	  Function caller need to deal with it
//		FileOutputStream fos2 = new FileOutputStream("c:\test.txt");
		System.out.println("ABC");
		
		throw new FileNotFoundException();
	}
	
	public static void testError() throws StackOverflowError {
		throw new StackOverflowError();
	}
	
	public static void testThrowable() throws Throwable {
		throw new Throwable();
	}
	
	public static void testRuntimeException() {
		throw new RuntimeException();
	}
}
