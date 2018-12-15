package com.mercury.prototypePattern;

import java.util.ArrayList;
import java.util.List;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.Occurs;

public class BookShop implements Cloneable{
	private String sName;
	private List<Book> books = new ArrayList();
	public String getsName() {
		return sName;
	}
	public void setsName(String sName) {
		this.sName = sName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	@Override
	public String toString() {
		return "BookShop [sName=" + sName + ", books=" + books + "]";
	}
	public void bookLoad() {
		for (int i = 0;i < 5;i ++) {
			Book book  = new Book();
			book.setBid(i);
			book.setBname("book " + i);
			getBooks().add(book);
		}
	}
	public BookShop clone() throws CloneNotSupportedException{
		
//		return (BookShop)super.clone();
		BookShop bs = (BookShop) super.clone();
		bs.setsName(this.sName);
		for (Book b:this.getBooks()) {
			bs.getBooks().add(b.clone());
			
		}
		return bs;
	}
}
