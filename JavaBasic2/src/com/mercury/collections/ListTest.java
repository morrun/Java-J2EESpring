package com.mercury.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Vector;

public class ListTest {

	public static void test() {
		List<String> l = new LinkedList();
		
		// so slow
		Vector v = new Vector();
		
		// slow, but not that slow
		List l2 = Collections.synchronizedList(l);
		
		Map<Integer, String> myMap = new HashMap<Integer, String>();
	}
	
	public static void sortList() {
		Trainer t1 = new Trainer("Greg", 169, 120);
		Trainer t2 = new Trainer("Frank", 174, 135);
		Trainer t3 = new Trainer("Robert", 174, 135);
		List<Trainer> trainers = new ArrayList();
		trainers.add(t1);
		trainers.add(t2);
		trainers.add(t3);
		
		Trainer[] ts = {t1, t2, t3};
		
		Arrays.sort(ts);
		for(int i = 0; i < ts.length; i++) {
			System.out.println(ts[i]);
		}
		
		Collections.sort(trainers);
		
		System.out.println(trainers);
	}
	
	public static void testHC() {
		Computer c1 = new Computer("Mac", 2018, 1000);
		Computer c2 = new Computer("Mac", 2008, 1010);
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c1.equals(c2));
	}
	
	public static void main(String a[]) {
//		Map<Object, Integer> map = new Hashtable();
////		map.put(null, 1);
//		map.put("abc", 2);
//		map.put(new Exception(), 23);
//		map.put(123, 2);
//		
//		map.put("bbd", 2322);
//		
//		System.out.println(map);
		sortList();
	}
}
