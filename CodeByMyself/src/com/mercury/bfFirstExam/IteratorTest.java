package com.mercury.bfFirstExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class IteratorTest {
	private static List<String> l;
	private static Map<String,Integer> map;
	private static Set<String> set;
	public static void testList() {
		l = new CopyOnWriteArrayList();
		l.add("d");
		l.add("c");
		l.add("b");
		l.add("a");
		Collections.sort(l,new Comparator<String>() {
			@Override
			public int compare(String t1,String t2) {
				if (t1.equals(t2)) return 0;
				return t1.compareTo(t2);
			}
		});
		Iterator i = l.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
	}
	public static void testSet() {
		set = new LinkedHashSet();
		set.add("d");
		set.add("c");
		set.add("b");
		set.add("a");
//		Collections.sort(set,new Comparator<String>() {
//			@Override
//			public int compare(String t1,String t2) {
//				if (t1.equals(t2)) return 0;
//				return t1.compareTo(t2);
//			}
//		});
		
		
//		Iterator i= set.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
		for (String s:set) {
			System.out.println(s);
		}
	}
	public static void testMap() {
		
		Comparator<String> c = new Comparator<String>() {
			@Override
			public int compare(String s1,String s2) {
				return s1.compareTo(s2);
			}
		};
		map = new ConcurrentHashMap();
		map.put("b", 1);
		map.put("d", 2);
		map.put("c", 4);
		map.put("a", 8);
//		for (Map.Entry<String,Integer> m: map.entrySet()) {
//			System.out.println(m.getKey() + " " + m.getValue());
//		}
		
//		Iterator<String> i = map.keySet().iterator();
//		while (i.hasNext()) {
//			String s = i.next();
//			System.out.println(s + " " + map.get(s));
//		}
		Iterator<Map.Entry<String, Integer>> i = map.entrySet().iterator();
		while (i.hasNext()) {
			Map.Entry<String, Integer> me = i.next();
			System.out.println(me.getKey() + " " + me.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testList();
		//testSet();
//		testMap();
	}

}
