package com.mercury.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortCollectionTest {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s;
//		System.out.println(s);
		Set<Computer> ts = new TreeSet();
		Map<Computer, Integer> tm = new TreeMap();
		tm.put(new Computer("Mac",1000, 2000), 2);
		tm.put(new Computer("Lenovo",999, 2003),32);
		tm.put(new Computer("Dell",888, 2004), 9);
		tm.put(new Computer("Acer",888, 2006), 11);
		System.out.println(tm);
		// anonymous implementation
//		Comparator<Trainer> trainerComparator = new Comparator<Trainer>() {
//			@Override
//			public int compare(Trainer t1, Trainer t2) {
//				return t2.getHeight() - t1.getHeight();
//			}
//		};
		Comparator<Trainer> trainerComparator = (t1,t2) -> {
			return t2.getHeight() - t1.getHeight();
		};
		Comparator<Trainer> trainerCom = (t1, t2) -> {
			return t2.getName().compareTo(t1.getName());			
			
			};
		Map<Trainer,Integer> map = new TreeMap(trainerComparator);
		map.put(new Trainer("Greg",-169,120), 1);
		map.put(new Trainer("Robert",-173,150), 1);
		map.put(new Trainer("Frank",-174,120), 1);
		
//		ArrayList<>
		System.out.println(map);
	}

}
