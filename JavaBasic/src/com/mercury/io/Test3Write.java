package com.mercury.io;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Test3Write {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileOutputStream fos = new FileOutputStream("resources/test3.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)) {
			// Hide fields from object
			Computer c = new Computer("Dell",1000,"Linux");
			
			oos.writeObject(c);
			
			System.out.println("Done..");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
