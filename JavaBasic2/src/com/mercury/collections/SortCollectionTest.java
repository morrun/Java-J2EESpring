package com.mercury.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class SortCollectionTest {

	public static void main(String[] args) {
		Map<Computer, Integer> tm = new LinkedHashMap();
		
		tm.put(new Computer("MAC", 1000, 2018), 1);
		tm.put(new Computer("MAC", 25000, 2000), 1);
		tm.put(new Computer("MAC", 300, 2014), 1);
		tm.put(new Computer("DELL", 300, 2015), 2);

		System.out.println(tm);
		
		// anonymous implementation
		Comparator<Trainer> trainerComparator = new Comparator<Trainer>() {
			@Override
			public int compare(Trainer t1, Trainer t2) {
				return t1.getHeight() - t2.getHeight();
			}
		};
		
		
		Map<Trainer, Integer> tm2 = new TreeMap(trainerComparator);
		
		tm2.put(new Trainer("Greg", 169, 120), 1);
		tm2.put(new Trainer("Robert", 174, 150), 2);
		tm2.put(new Trainer("Frank", 174, 135), 3);
		
		
//		System.out.println(tm2);
	}

}
