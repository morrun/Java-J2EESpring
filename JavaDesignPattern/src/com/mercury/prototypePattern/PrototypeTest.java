package com.mercury.prototypePattern;

public class PrototypeTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book();
		BookShop bs = new BookShop();
		bs.setsName("bookStore");
		bs.bookLoad();
		
		BookShop bs1 = bs.clone();
		bs1.setsName("bookStore1");
		System.out.println(bs);
		System.out.println(bs1);
		
		bs1.getBooks().remove(2);
		System.out.println(bs);
		System.out.println(bs1);
		
		

	}

}
