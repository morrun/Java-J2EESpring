package com.mercury.exceptionHandling;

import java.io.FileOutputStream;
import java.io.IOException;

public class ExceptionTest2 {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		System.out.println(test());
		try {
			// logic 1
			
			fos = new FileOutputStream("C:\\Test\\test.txt");
			
			String a = null;
			a.toCharArray();
			
			// output to the file
			
			System.out.println("close...");
			fos.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		System.out.println("Done...");
	}
	
	public static int test() {
		
		try {
			System.out.println("AAA");
			if(true) {
				throw new Exception();
			}
			
			return 200;
		} catch(Exception e) {
			return 404;
		} finally {
			return 1;
		}
	}
	
	public static void foo(String x) {
		if(x != null) {
			x.toLowerCase();
		}
	}

}
