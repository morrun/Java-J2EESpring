package com.mercury.prototypePattern;

public class Book implements Cloneable{
	private int bid;
	private String bname;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + "]";
	}
	public Book clone() throws CloneNotSupportedException {
		return (Book)super.clone();
	}
}
