package com.mercury.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class Test3Read {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("resources/test3.dat");
				ObjectInputStream ois = new ObjectInputStream(fis);) {
			//Computer.color = "White";
			Computer c = (Computer)ois.readObject();
			
			System.out.println(c);
			System.out.println("Done..");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
