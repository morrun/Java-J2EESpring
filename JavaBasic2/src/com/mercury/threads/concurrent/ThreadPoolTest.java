package com.mercury.threads.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void testThreadPool() {
		// no limitation
//		ExecutorService es = Executors.newCachedThreadPool();
		// size 1
//		ExecutorService es = Executors.newSingleThreadExecutor();
		// fixed size
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(int i = 0; i < 100; i++) {
			es.execute(new DummyThread());
		}
		es.shutdown();
	}
	
	public static void testCallable() {
		ExecutorService es = Executors.newFixedThreadPool(5);
		List<Future<Integer>> resultList = new ArrayList();
		
		for(int i = 1; i <= 10; i++) {
			Future<Integer> future = es.submit(new SmartThread(i));
			resultList.add(future);
		}
		
		for(Future<Integer> future : resultList) {
			while(!future.isDone()) {}
			
			try {
				System.out.println(future.get());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		es.shutdown();
	}
	
	public static void main(String[] args) {
//		testThreadPool();
		testCallable();
	}

}
