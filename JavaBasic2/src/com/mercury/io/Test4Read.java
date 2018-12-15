package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test4Read {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("resources/test4.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			
			Animal a = (Animal)ois.readObject();
			
			System.out.println(a);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
