package com.mercury.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class IterationTest {
	public static List<String> list;
	public static Set<String> set;
	public static Map<String,Integer> map;
//	Collection
	public Thread t;
	
	public IterationTest() {
		super();
	}
	static {
		list = new ArrayList();
		list.add("beauty");
		list.add("b");
		list.add("e");
		list.add("a");
		
		set = new HashSet();
		
		set.add("a");
		set.add("bb");
		set.add("c");
		set.add("d");
		
		map = new HashMap();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
	}
	public static void iterationList() {
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
	}
	public static void iterationSet() {
		Iterator<String> i = set.iterator();
		while (i.hasNext()) {
			String s = i.next();
			if (s.length() > 1) {
				set.remove(s);
			}
		}
		set.forEach(null);
		System.out.println(set);
	}
	public static void iterationMap() { 
		Iterator<Map.Entry<String,Integer>> i = map.entrySet().iterator();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iterationSet();
	}

}
