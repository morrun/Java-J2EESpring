package com.mercury.collections;

import java.util.concurrent.ConcurrentHashMap;

public class Trainer implements Comparable<Trainer>{
	private String name;
	private int height;
	private int weight;
	private ConcurrentHashMap chm;
	public Trainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Trainer(String name, int height, int weight) {
		super();
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public String toString() {
		return "Trainer [name=" + name + ", height=" + height + ", weight=" + weight + "]";
	}
	@Override
	public int compareTo(Trainer o) {
		// TODO Auto-generated method stub
		return this.getWeight()-o.getHeight();
	}
	
}
