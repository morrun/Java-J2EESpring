package com.mercury.io;

import java.io.FileInputStream;

public class Test1Read {

	public static void main(String[] args) {
		// FileInputStream only work with 1 byte
		try (FileInputStream fis = new FileInputStream("resources/test1.dat")) {
			
			int x;
			do {
				x = fis.read();
				System.out.println(x);
			} while(x != -1);			// if x == -1, means reach the end of the file
			
			System.out.println("Complete!");
			
			System.out.println(23423423 % 256);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
