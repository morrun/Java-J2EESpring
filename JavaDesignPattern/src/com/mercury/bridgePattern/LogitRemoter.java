package com.mercury.bridgePattern;

public class LogitRemoter extends Remoter {

	public LogitRemoter(TV tv) {
		super(tv);
		// TODO Auto-generated constructor stub
	}
	public void setChannelKeyboard(int channel) {
		setChannel(channel);
		System.out.println("Logit is working");
	}
}
