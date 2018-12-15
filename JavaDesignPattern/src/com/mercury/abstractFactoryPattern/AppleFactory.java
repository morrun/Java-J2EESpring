package com.mercury.abstractFactoryPattern;

import com.mercury.abstractFactoryPattern.beans.Apple;
import com.mercury.abstractFactoryPattern.beans.Phone;

public class AppleFactory implements PhoneAbstractFactory {
	private String CPU;
	private String battery;
	private String OS;
	
	public AppleFactory(String cPU, String battery, String oS) {
		super();
		this.CPU = cPU;
		this.battery = battery;
		this.OS = oS;
	}

	@Override
	public Phone createPhone() {
		// TODO Auto-generated method stub
		return new Apple(this.CPU,this.battery,this.OS);
	}

}
