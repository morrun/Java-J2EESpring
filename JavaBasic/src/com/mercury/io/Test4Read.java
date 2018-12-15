package com.mercury.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test4Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fos = new FileInputStream("resources/test3.dat");
				ObjectInputStream oos = new ObjectInputStream(fos)) {
			// Hide fields from object
			Animal c = (Animal)oos.readObject();
			System.out.println(c);
			
			System.out.println("Done..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
