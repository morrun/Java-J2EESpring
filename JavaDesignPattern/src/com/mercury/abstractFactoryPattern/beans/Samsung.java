package com.mercury.abstractFactoryPattern.beans;

public class Samsung implements Phone {
	private String CPU;
	private String battery;
	private String OS;
	@Override
	public String toString() {
		return "Apple [CPU=" + CPU + ", battery=" + battery + ", OS=" + OS + "]";
	}

	public String getCPU() {
		return CPU;
	}

	public void setCPU(String cPU) {
		CPU = cPU;
	}

	public String getBattery() {
		return battery;
	}

	public void setBattery(String battery) {
		this.battery = battery;
	}

	public String getOS() {
		return OS;
	}

	public void setOS(String oS) {
		OS = oS;
	}

	public Samsung(String cPU, String battery, String oS) {
		super();
		CPU = cPU;
		this.battery = battery;
		OS = oS;
	}

	public Samsung() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String specific() {
		// TODO Auto-generated method stub
		return "This is a Samsung " + getCPU() + " " + getBattery() + " " + getOS();
	}

}
