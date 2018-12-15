package com.mercury.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class IterationTest {

	public static List<String> list;
	public static Set<String> set;
	public static Map<String, Integer> map;
	
	static {
		list = new ArrayList();
		list.add("a");
		list.add("bb");
		list.add("c");
		list.add("d");
		
		set = new HashSet();
		set.add("a");
		set.add("bb");
		set.add("c");
		set.add("d");
		
		map = new ConcurrentHashMap();
		map.put("a", 1);
		map.put("b", 2);
		map.put("c", 3);
		map.put("d", 4);
	}
	
	public static void iterationList() {
//		System.out.println(list);
		
		// 1. for loop: traditional one
		for(int i = 0; i < list.size(); i++) {
			String s = list.get(i);
			if(s.length() > 1) {
				list.remove(s);
			}
			System.out.println(list.get(i));
		}
		
		// 2. for loop: fancy one
//		for(String s : list) {
//			if(s.length() > 1) {
//				list.remove(s);
//			}
//			System.out.println(s);
//		}
		
		// 3. foreach
		
		// 4. iterator
//		Iterator<String> i = list.iterator();
//		while(i.hasNext()) {
//			String s = i.next();
//			System.out.println(s);
//		}
	}
	
	public static void iterationSet() {
//		System.out.println(set);
		// 1. no traditional for loop
		
		// 2. for loop : fancy
//		List<String> al = new ArrayList();
//		for(String s : set) {
//			if(s.length() > 1) {
//				al.add(s);
//			}
//		}
//		for(String s : al) {
//			set.remove(s);
//		}
		
//		set.removeAll(al);
		
		// 3. foreach
		
		// 4. iterator
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			String s = i.next();
			if(s.length() > 1) {
				i.remove();
			}
		}
	
		System.out.println(set);
	}
	
	public static void iterationMap() {
//		System.out.println(map);
//		map.entrySet();
//		map.keySet();
		// 1. for loop: traditional
		
		
		// 2. for loop: fancy
//		for(Map.Entry<String, Integer> me : map.entrySet()) {
//			System.out.println(me.getKey() + " -> " + me.getValue());
//		}
		
		for(String key : map.keySet()) {
			map.remove("d");
			System.out.println(key + " -> " + map.get(key));
		}
		
		// 3. foreach
		
		// 4. no iterator
//		Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();
//		while(i.hasNext()) {
//			Map.Entry<String, Integer> me = i.next();
//			System.out.println(me.getKey() + " -> " + me.getValue());
//		}
		
//		Iterator<String> i = map.keySet().iterator();
//		while(i.hasNext()) {
//			String key = i.next();
//			System.out.println(key + " -> " + map.get(key));
//		}
	}
	
	public static void main(String[] args) {
//		iterationList();
//		iterationSet();
		iterationMap();
		
//		CopyOnWriteArrayList c = null;
		
	}

}
