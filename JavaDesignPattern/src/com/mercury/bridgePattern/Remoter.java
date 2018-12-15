package com.mercury.bridgePattern;

public abstract class Remoter {
	private TV tv;

	public Remoter(TV tv) {
		super();
		this.tv = tv;
	}
	public void setChannel(int channel) {
		tv.setChannel(channel);
	}
}
