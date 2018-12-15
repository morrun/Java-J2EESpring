package com.mercury.adapterPattern;

public class ChargingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IPhone iphone = new IPhoneAdapter();
		System.out.println(iphone.charge("IPhoneX"));
		
	}

}
