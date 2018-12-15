package com.mercury.io;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class Test2Write {

	public static void main(String[] args) {
		int i = -5;
		double d = 3.1415926;
		boolean b = true;

		try (FileOutputStream fos = new FileOutputStream("resources/test2.dat");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				DataOutputStream dos = new DataOutputStream(bos)) {
			
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeBoolean(b);
			
			System.out.println("Complete");
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
