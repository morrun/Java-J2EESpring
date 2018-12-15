package com.mercury.IOtest;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ReadTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (FileInputStream fis = new FileInputStream("resources/test4.dat");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Garage c= (Garage)ois.readObject();
			System.out.println(c);
			System.out.println("Done");
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
