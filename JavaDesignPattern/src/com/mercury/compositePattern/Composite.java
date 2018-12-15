package com.mercury.compositePattern;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Component {
	private String name;
	private List<Component> components = new ArrayList();
	
	
	public Composite(String name) {
		super();
		this.name = name;
	}
	public void addComponent(Component com) {
		this.components.add(com);
	}
	@Override
	public void show() {
		System.out.println(this.name);
		for (Component com:components) {
			com.show();
		}

	}

}
