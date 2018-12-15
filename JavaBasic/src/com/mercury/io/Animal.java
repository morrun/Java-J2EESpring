package com.mercury.io;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

public class Animal implements Externalizable, Cloneable {
	private String breed;
	private int age;
	private String color;
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Animal(String breed, int age, String color) {
		super();
		this.breed = breed;
		this.age = age;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Animal [breed=" + breed + ", age=" + age + ", color=" + color + "]";
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
	public void writeExternal(ObjectOutput out) throws IOException {
		// TODO Auto-generated method stub
		out.writeObject(color); // sequence needs to be same as readExternal
		out.writeObject(breed);
		out.writeInt(age);
		
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		color = in.readObject().toString();
		breed = in.readObject().toString();
		age = in.readInt();
	}
	
	public Animal clone() throws CloneNotSupportedException {
		return (Animal)super.clone();
	}
	
}
