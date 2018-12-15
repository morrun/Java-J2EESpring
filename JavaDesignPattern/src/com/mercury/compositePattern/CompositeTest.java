package com.mercury.compositePattern;

public class CompositeTest {

	public static void main(String[] args) {
		Component mouse = new Leaf("logit",300);
		Component keyboard = new Leaf("meitu",200);
		
		Component moniter = new Leaf("lenevo",4000);
		Component CPU = new Leaf("intel",3000);
		
		Composite m = new Composite("main");
		m.addComponent(mouse);
		m.addComponent(keyboard);
		Composite y = new Composite("var");
		y.addComponent(moniter);
		y.addComponent(CPU);
		
		m.show();
		y.show();
		
		
	}

}
