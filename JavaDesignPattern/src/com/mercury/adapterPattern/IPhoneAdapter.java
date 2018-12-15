package com.mercury.adapterPattern;

import com.mercury.adapterPattern.target.SamsungCharger;

public class IPhoneAdapter implements IPhone {
	SamsungCharger sc = new SamsungCharger();
	@Override
	public String charge(String str) {
		// TODO Auto-generated method stub
		return sc.charging("IPhone adapter help " + str);
	}

}
