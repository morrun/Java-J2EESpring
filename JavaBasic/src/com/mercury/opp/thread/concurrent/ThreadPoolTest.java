 package com.mercury.opp.thread.concurrent;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ThreadPoolTest {

	public static void testThreadPool() {
		
		// no limitation
		//ExecutorService es = Executors.newCachedThreadPool();
		// fixed size
		ExecutorService es = Executors.newFixedThreadPool(5);
		//size 1
		//ExecutorService es = Executors.newSingleThreadExecutor();
		for (int i = 0;i < 100;i ++) {
			es.execute(new DummyThread());
			//new Thread(new DummyThread()).start();
		}
		
		es.shutdown();
	}
	
	public static void testCallable() {
		Executors.newScheduledThreadPool(1);
		ExecutorService es = Executors.newFixedThreadPool(5);
		List<Future<Integer>> resultList = new ArrayList<>();

		for (int i = 1;i <= 10;i ++) {
			Future<Integer> future = es.submit(new SmartThread(i));//will wait for last thread finished
			System.out.println(future);
			resultList.add(future);
		}
		for (Future<Integer> future:resultList) {
			while (!future.isDone()) {}
			try {
				System.out.println(future.get() + " " + Thread.currentThread().getName());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		es.shutdown();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		testThreadPool();//DummyThread
//		testCallable();
		System.out.println(Thread.activeCount());
	}

}
