package com.mercury.bridgePattern;

public class BridgeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv = new SamsungTV();
		TV tv1 = new SonyTV();
		LogitRemoter lr = new LogitRemoter(tv);
		LogitRemoter lr1 = new LogitRemoter(tv1);
		lr.setChannelKeyboard(2);
		lr1.setChannelKeyboard(3);
	}

}
