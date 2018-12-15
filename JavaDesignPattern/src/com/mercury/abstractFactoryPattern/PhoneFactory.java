package com.mercury.abstractFactoryPattern;

import com.mercury.abstractFactoryPattern.beans.Phone;

public class PhoneFactory {
	public static Phone createPhone(PhoneAbstractFactory paf) {
		return paf.createPhone();
	}
}
