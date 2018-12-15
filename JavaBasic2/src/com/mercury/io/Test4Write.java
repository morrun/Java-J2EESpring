package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test4Write {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			
			Animal a = new Animal("Khao Manee", 5, "123");
			
			oos.writeObject(a);
			
			System.out.println("Complete.....");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
