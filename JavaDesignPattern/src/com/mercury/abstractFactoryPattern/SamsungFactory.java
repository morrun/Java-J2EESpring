package com.mercury.abstractFactoryPattern;

import com.mercury.abstractFactoryPattern.beans.Phone;
import com.mercury.abstractFactoryPattern.beans.Samsung;

public class SamsungFactory implements PhoneAbstractFactory {
	private String CPU;
	private String battery;
	private String OS;
	public SamsungFactory(String cPU, String battery, String oS) {
		super();
		this.CPU = cPU;
		this.battery = battery;
		this.OS = oS;
	}
	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new Samsung(this.CPU,this.battery,this.OS);
	}

}
