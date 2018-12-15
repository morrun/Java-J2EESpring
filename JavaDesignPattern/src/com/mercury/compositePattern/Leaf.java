package com.mercury.compositePattern;

public class Leaf implements Component{
	private String name;
	private int price;
	

	public Leaf(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}


	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " " + this.price);
	}

}
