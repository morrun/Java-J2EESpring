package com.mercury.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.Vector;

public class ListTest {
	public static List test() {
		// generic, restrict the input in compile time
		List<String> l = new Vector();
		List l2 = l;
		l2.add(123);
		Map<Integer,String> map = new HashMap<>();

	}
	public static void testHC() {
		Computer c1 = new Computer("Mac", 2018, 1000);
		Computer c2 = new Computer("Mac1", 2017, 999);
		Computer c3 = new Computer("Mac2", 2016, 1999);
		Computer c4 = new Computer("Mac3", 2015, 199);
		
		Computer c5 = new Computer("Mac4", 2018, 123);
		List<Computer> list = new ArrayList<>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);
		Collections.sort(list/*,new Comparator<Computer>() {
			@Override
			public int compare(Computer t1,Computer t2) {
				return t2.getPrice() - t1.getPrice();
			}
		}*/);
		Collections.sort(list, (l1, l2) -> l1.getBrand().compareTo(l2.getBrand()));
		System.out.println(list);
		
	}
	public static class A{
		void foo(Object o) {
			System.out.println("Ojbect");
		}
		void foo(String str) {
			System.out.println(str);
		}
	}
	public static void main(String args[]) {
		//testHC();
//		final List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		System.out.println(list);
		new A().foo("abc");
		new A().foo(null);
	}
}
