package com.mercury.exceptionHandling;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import com.sun.jmx.snmp.BerException;

// try with resource
public class ExceptionTest3 {

	public static class MyObj implements AutoCloseable{

		@Override
		public void close() throws IOException {
			System.out.println("Closing MyObj...");
			
		}
		
	}
	
	public static void main(String[] args) {
		test();

	}
	
	public static void test() {
		// new feature in java 1.7
		// what is a resource? - AutoCloseable
		try (FileOutputStream fos = new FileOutputStream("C:\\test\\test.txt");
				DataOutputStream dos = new DataOutputStream(fos);
				MyObj mo = new MyObj();) {
			
			System.out.println("Working...");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Complete!");
	}
	
	public static void foo() {
		try {
			if(true) {
				throw new IOException();
			}
			throw new BerException();
		} catch (IOException | NullPointerException | BerException e) {
			
		}
	}

}
