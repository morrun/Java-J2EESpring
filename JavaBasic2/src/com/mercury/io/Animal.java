package com.mercury.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Animal implements Externalizable {
	
	private String breed;
	private int age;
	private String color;
	
	public Animal() {
		super();
	}

	public Animal(String breed, int age, String color) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", age=" + age + ", color=" + color + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(color);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		age = Integer.parseInt(in.readObject().toString());
	}
}
