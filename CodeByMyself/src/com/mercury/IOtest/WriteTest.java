package com.mercury.IOtest;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class WriteTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer("Lenovo","black",999);
		Computer c1= new Computer("Mac","white",899);
		Garage g = Garage.getInstance(c, c1);//(c,c1);
		try (FileOutputStream fos = new FileOutputStream("resources/test4.dat");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(g);
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
